package com.resource;


import java.util.Scanner;

import com.controller.Controller;
import com.model.Dao;
import com.model.Student;
import com.view.Add;
import com.view.Delete;
import com.view.Exit;
import com.view.Menu;
import com.view.Output;
import com.view.Search;
import com.view.Update;

public interface R {

	Scanner scan = new Scanner(System.in);
	
	Controller controller = new Controller();
	
	Data data = new Data();
	
	Dao dao = new Dao();
	Student student = new Student();
	
	Menu menu = new Menu();
	Add add = new Add();
	Output output = new Output();
	Search search = new Search();
	Update update = new Update();
	Delete delete = new Delete();
	Exit exit = new Exit();
	
	
	String line = "---------------------------------";
	
	int MAX = 1000;
	
}
