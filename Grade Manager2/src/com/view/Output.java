package com.view;

import static com.resource.R.*;

import com.model.Student;

public class Output implements View {

	@Override
	public void display() {
		System.out.println("-------------��� ���-------------");
		System.out.println("1.�л���ȣ 2.��������");
		System.out.print("����� ������ �����ϼ���>>");
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
