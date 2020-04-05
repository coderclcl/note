package com.view;

public class Exit implements View {

	@Override
	public void display() {
		
		System.out.println("이용해주셔서 감사합니다.");
		System.out.println("프로그램 종료...");
		System.exit(0);
		
	}
	

}
