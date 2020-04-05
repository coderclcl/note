package com.view;

import static com.resource.R.*;

import java.util.FormatFlagsConversionMismatchException;
import java.util.InputMismatchException;


public class Menu implements View {

	@Override
	public void display() {
		System.out.println("---------------메뉴---------------");
		System.out.println("|   1.점수입력 2.점수출력 3.학생검색	|");
		System.out.println("|   4.점수수정 5.정보삭제 6.종료	|");
		System.out.println(line);
		System.out.print("원하시는 작업을 선택하세요>>");
		
		boolean flag = false;
		int num = 0;
		
		do {
			flag = true;
			try {
				num = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("정상적인 숫자를 입력하세요>>");
				scan.nextLine();
				flag = false;
			}
		}while(flag==false);
		
		data.menunum = num;
		
	}

}
