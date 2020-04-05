package com.model;

import static com.resource.R.*;


public class Dao {
	
	private int sequence = 1; //학생번호
	private int top = 0; //스택 top 번지
	private Student[] sArr = new Student [MAX];

	
	
	public int getTop() {
		return top;
	}


	public void insert(Student s) {
		if(top>=MAX) {
			System.out.println("저장 공간이 부족합니다!");
			return;
		}
		s.setStudentnum(sequence++);
		s.setTotal(s.getKor()+s.getEng()+s.getMath());
		s.setAverage(s.getTotal()/3.0);
		sArr[top++] = s;
		rankcalc();
	}
	
	
	public void rankcalc() {
		
		
		for(int i=0; i<top; i++) {
			sArr[i].setRank(0);
		}
		
		int rank = 1;
		for(int j=300; j>0; j--) {
			for(int i=0; i<top; i++) {
				if(sArr[i].getRank()==0 && sArr[i].getTotal()>j) {
					sArr[i].setRank(rank);
					rank++;
				}
			}
		}
		
		//동점자 등수 처리
		for(int i=0; i<top; i++) {
			for(int j=0; j<top; j++) {
				if(sArr[i].getTotal()==sArr[j].getTotal()) {
					
					if(sArr[i].getRank()>sArr[j].getRank()) {
						sArr[i].setRank(sArr[j].getRank());
						
					}else {
						sArr[j].setRank(sArr[i].getRank());
						
					}
					
					
				}
			}
		}
	}
	
	
	
	
	
	public void selectall() {
		Student[] tmpArr = new Student[top];
		
		for(int i=0; i<top; i++) {
			Student tmp = new Student();
			tmp.setStudentnum(sArr[i].getStudentnum());
			tmp.setName(sArr[i].getName());
			tmp.setKor(sArr[i].getKor());
			tmp.setEng(sArr[i].getEng());
			tmp.setMath(sArr[i].getMath());
			tmp.setTotal(sArr[i].getTotal());
			tmp.setAverage(sArr[i].getAverage());
			rankcalc();
			tmp.setRank(sArr[i].getRank());
			tmpArr[i] = tmp;
		}
		data.sArr = tmpArr;
	}


	public void search() {
		
		
		Student[] tmpArr = new Student[top];
		int cnt = 0;
		
		rankcalc();
		
		
		for(int i=0; i<top; i++) {
			if(sArr[i].getName().equals(data.name)) {
				Student tmp = new Student();
				tmp.setStudentnum(sArr[i].getStudentnum());
				tmp.setName(sArr[i].getName());
				tmp.setKor(sArr[i].getKor());
				tmp.setEng(sArr[i].getEng());
				tmp.setMath(sArr[i].getMath());
				tmp.setTotal(sArr[i].getTotal());
				tmp.setAverage(sArr[i].getAverage());
				tmp.setRank(sArr[i].getRank());
				tmpArr[cnt++] = tmp;
			}
		}
		
		if(tmpArr[0]==null) {
			System.out.println("해당 학생은 존재하지 않습니다!");
		}
		
		
		Student[] newArr = new Student[cnt];
		for(int i=0; i<cnt; i++) {
			newArr[i] = tmpArr[i];
		}
		
		data.sArr = newArr;
	}


	public void update(Student s) {
		
		for(int i=0; i<top; i++) {
			if(sArr[i].getStudentnum()==data.snum) {
				
				s.setStudentnum(sArr[i].getStudentnum());
				s.setTotal(s.getKor()+s.getEng()+s.getMath());
				s.setAverage(s.getTotal()/3.0);
				rankcalc();
				sArr[i] = s;
				
			}
		}
		
	}


	public void delete() {
		
		int start = -1;
		
		
		
		
		for(int i=0; i<top; i++) {
			if(sArr[i].getStudentnum()==data.snum) {
				start = i;
			}
		}
		
		if(start==-1) {
			System.out.println("일치하는 데이터가 없습니다.");
			return;
		}
		
		for(int i=start; i<top-1; i++) {
			sArr[i] = sArr[i+1];
		}
		top--;
		System.out.println("삭제 완료하였습니다!");
		
		rankcalc();
		
	}
	
	
	
	
	
}
