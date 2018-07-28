package com.designpattern;

import com.classes.CompanyFactory;
import com.interfaces.Client;
import com.interfaces.Company;
import com.interfaces.Emp;

public class LaunchPoint {
	public static void main(String[] args)
	{
		  Company company = new CompanyFactory();
		  Client client1 =company.getProject("A");
		  client1.onProject();
		  
		  Client client2 =company.getProject("B");
		  client2.onProject();
		  
		  Emp emp1 = company.getWork("A");
		  emp1.onWork();
		  
		  Emp emp2 = company.getWork("B");
		  emp2.onWork();
	}
}
