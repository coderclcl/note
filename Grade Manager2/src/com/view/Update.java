package com.view;

import static com.resource.R.*;

import java.util.InputMismatchException;

public class Update implements View {

	@Override
	public void display() {
		
		System.out.println("-------------���� ���-------------");
		
		
		boolean flag = false;
				do {
					flag = true;
					try {
						System.out.print("������ ���ϴ� �л��� �й��� �Է��ϼ���>>");
						data.snum = scan.nextInt();
						
						
					} catch (InputMismatchException e) {
						System.out.println("�������� ���ڸ� �Է��ϼ���!");
						scan.nextLine();
						flag = false;
					}
				}while(flag==false);
		
		
		System.out.println("���� ������ �Է��ϼ���");
		add.display();
		

	}

}
