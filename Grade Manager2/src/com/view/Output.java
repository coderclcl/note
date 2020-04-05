package com.view;

import static com.resource.R.*;

import com.model.Student;

public class Output implements View {

	@Override
	public void display() {
		System.out.println("-------------출력 기능-------------");
		System.out.println("1.학생번호 2.전과목등수");
		System.out.print("출력할 기준을 선택하세요>>");
		data.outputnum = scan.nextInt();
	}

	public void snumdisplay(Student[] sArr) {
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i].toString());
		}
	}
	
	
	public void rankdisplay(Student[] sArr) {
		
			for(int rank=1; rank<=sArr.length; rank++) {
				
				for(int i=0; i<sArr.length; i++) {
					if(sArr[i].getRank()==rank) {
						System.out.println(sArr[i].toString());
					}
				}
			}
		
		}
		
	
}
