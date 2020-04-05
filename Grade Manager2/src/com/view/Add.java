package com.view;

import static com.resource.R.*;

import java.util.InputMismatchException;

import com.model.Student;

public class Add implements View {

	@Override
	public void display() {
		System.out.println("-------------�Է� ���-------------");
		
		Student tmp = new Student();
		
		System.out.println("�л� ������ �Է��ϼ���");
		System.out.print("���� : ");
		tmp.setName(scan.next());
		
		
		boolean flag = false;
		
		do {
			flag = true;
			try {
				System.out.print("�������� : ");
				tmp.setKor(scan.nextInt());
				System.out.print("�������� : ");
				tmp.setEng(scan.nextInt());
				System.out.print("�������� : ");
				tmp.setMath(scan.nextInt());
			} catch (InputMismatchException e) {
				System.out.println("�������� ���ڸ� �Է��ϼ���!");
				scan.nextLine();
				flag = false;
			}
		}while(flag==false);
		
		
		data.s = tmp;
		
		System.out.println("���� �Ϸ�Ǿ����ϴ�!");
	}

}
