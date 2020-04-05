package com.view;

import static com.resource.R.*;
import com.model.Student;

public class Search implements View {

	@Override
	public void display() {
		
		System.out.println("-------------검색 기능-------------");
		System.out.print("검색할 학생 이름을 입력하세요>>");
		data.name = scan.next();
	}


	public void display(Student[] sArr) {
		for(int i=0; i<data.sArr.length; i++) {
			System.out.println(data.sArr[i].toString());
		}
	}
}
