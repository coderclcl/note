package com.view;

import static com.resource.R.*;
import com.model.Student;

public class Search implements View {

	@Override
	public void display() {
		
		System.out.println("-------------�˻� ���-------------");
		System.out.print("�˻��� �л� �̸��� �Է��ϼ���>>");
		data.name = scan.next();
	}


	public void display(Student[] sArr) {
		for(int i=0; i<data.sArr.length; i++) {
			System.out.println(data.sArr[i].toString());
		}
	}
}
