package com.controller;

import static com.resource.R.*;



public class Controller {
	
	public void service() {
		
		// 메뉴 : 1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료
		menu.display();
		
		
		switch(data.menunum) {
		//view 에서 입력받아 data에 저장, 그리고 dao에서 처리하여 저장
		case 1 : add.display(); dao.insert(data.s); break; 
		
		//dao에서 데이터를 모아서 data에 저장, 그리고 view 에서 data에 있는 정보를 출력
		case 2 : 
			// 출력 메뉴 : 1.학번순 2.등수순
			isblank();
			output.display(); 
			switch (data.outputnum) {
			case 1 : dao.selectall(); output.snumdisplay(data.sArr); break;
			case 2 : dao.selectall(); output.rankdisplay(data.sArr); break;
			default: System.out.println("메뉴를 준비중입니다."); break;
			}
		break;
		
		// 자주 사용하므로 따로 메서드를 만들어 빼냄
		case 3 : search(); break;
		
		// search 로 데이터 있는지 찾고 view에서 수정 원하는 학번 / 새정보 받아서 data에 저장, 그리고 dao에서 해당 학번 학생 정보 덮어씌움
		case 4 : search(); update.display(); dao.update(data.s); break;
		
		// search 로 데이터 있는지 찾고 view에서 삭제 원하는 학번 받아서 data에 저장, 그리고 dao에서 해당 학번 학생부터 배열 땡기기
		case 5 : search(); delete.display(); dao.delete(); break;
			
		case 6 : exit.display(); break;
		default : System.out.println("메뉴를 준비중입니다.");
		}
		service();
	}
	
	//view 에서 이름 받아 data 저장, dao에서 데이터 대조 후 일치만 data에 저장, 그리고 view 에서 data에 있는 정보를 출력
	public void search() {
		isblank(); 
		search.display(); 
		dao.search(); 
		search.display(data.sArr);
	}
	
	
	public void isblank() {
		if(dao.getTop()==0) {
			System.out.println("저장된 데이터가 없습니다.데이터를 추가해주세요.");
			service();
		}
	}
	

}
