package com.view;

import static com.resource.R.*;

import java.util.InputMismatchException;

import com.model.Student;

public class Add implements View {

	@Override
	public void display() {
		System.out.println("-------------입력 기능-------------");
		
		Student tmp = new Student();
		
		System.out.println("학생 정보를 입력하세요");
		System.out.print("성명 : ");
		tmp.setName(scan.next());
		
		
		boolean flag = false;
		
		do {
			flag = true;
			try {
				System.out.print("국어점수 : ");
				tmp.setKor(scan.nextInt());
				System.out.print("영어점수 : ");
				tmp.setEng(scan.nextInt());
				System.out.print("수학점수 : ");
				tmp.setMath(scan.nextInt());
			} catch (InputMismatchException e) {
				System.out.println("정상적인 숫자를 입력하세요!");
				scan.nextLine();
				flag = false;
			}
		}while(flag==false);
		
		
		data.s = tmp;
		
		System.out.println("저장 완료되었습니다!");
	}

}
