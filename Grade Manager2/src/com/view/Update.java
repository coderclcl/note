package com.view;

import static com.resource.R.*;

import java.util.InputMismatchException;

public class Update implements View {

	@Override
	public void display() {
		
		System.out.println("-------------수정 기능-------------");
		
		
		boolean flag = false;
				do {
					flag = true;
					try {
						System.out.print("수정을 원하는 학생의 학번을 입력하세요>>");
						data.snum = scan.nextInt();
						
						
					} catch (InputMismatchException e) {
						System.out.println("정상적인 숫자를 입력하세요!");
						scan.nextLine();
						flag = false;
					}
				}while(flag==false);
		
		
		System.out.println("수정 정보를 입력하세요");
		add.display();
		

	}

}
