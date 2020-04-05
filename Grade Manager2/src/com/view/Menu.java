package com.view;

import static com.resource.R.*;

import java.util.FormatFlagsConversionMismatchException;
import java.util.InputMismatchException;


public class Menu implements View {

	@Override
	public void display() {
		System.out.println("---------------�޴�---------------");
		System.out.println("|   1.�����Է� 2.������� 3.�л��˻�	|");
		System.out.println("|   4.�������� 5.�������� 6.����	|");
		System.out.println(line);
		System.out.print("���Ͻô� �۾��� �����ϼ���>>");
		
		boolean flag = false;
		int num = 0;
		
		do {
			flag = true;
			try {
				num = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("�������� ���ڸ� �Է��ϼ���>>");
				scan.nextLine();
				flag = false;
			}
		}while(flag==false);
		
		data.menunum = num;
		
	}

}
