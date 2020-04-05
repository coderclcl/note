package com.controller;

import static com.resource.R.*;



public class Controller {
	
	public void service() {
		
		// �޴� : 1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����
		menu.display();
		
		
		switch(data.menunum) {
		//view ���� �Է¹޾� data�� ����, �׸��� dao���� ó���Ͽ� ����
		case 1 : add.display(); dao.insert(data.s); break; 
		
		//dao���� �����͸� ��Ƽ� data�� ����, �׸��� view ���� data�� �ִ� ������ ���
		case 2 : 
			// ��� �޴� : 1.�й��� 2.�����
			isblank();
			output.display(); 
			switch (data.outputnum) {
			case 1 : dao.selectall(); output.snumdisplay(data.sArr); break;
			case 2 : dao.selectall(); output.rankdisplay(data.sArr); break;
			default: System.out.println("�޴��� �غ����Դϴ�."); break;
			}
		break;
		
		// ���� ����ϹǷ� ���� �޼��带 ����� ����
		case 3 : search(); break;
		
		// search �� ������ �ִ��� ã�� view���� ���� ���ϴ� �й� / ������ �޾Ƽ� data�� ����, �׸��� dao���� �ش� �й� �л� ���� �����
		case 4 : search(); update.display(); dao.update(data.s); break;
		
		// search �� ������ �ִ��� ã�� view���� ���� ���ϴ� �й� �޾Ƽ� data�� ����, �׸��� dao���� �ش� �й� �л����� �迭 �����
		case 5 : search(); delete.display(); dao.delete(); break;
			
		case 6 : exit.display(); break;
		default : System.out.println("�޴��� �غ����Դϴ�.");
		}
		service();
	}
	
	//view ���� �̸� �޾� data ����, dao���� ������ ���� �� ��ġ�� data�� ����, �׸��� view ���� data�� �ִ� ������ ���
	public void search() {
		isblank(); 
		search.display(); 
		dao.search(); 
		search.display(data.sArr);
	}
	
	
	public void isblank() {
		if(dao.getTop()==0) {
			System.out.println("����� �����Ͱ� �����ϴ�.�����͸� �߰����ּ���.");
			service();
		}
	}
	

}
