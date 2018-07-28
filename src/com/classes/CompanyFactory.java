package com.classes;

import com.interfaces.Client;
import com.interfaces.Company;
import com.interfaces.Emp;

public class CompanyFactory extends Company {

	@Override
	public Client getProject(String project) {
		if (project.equals("A"))
			return new ClientA();
		else if (project.equals("B"))
			return new ClientB();
		else
			return null;
	}

	@Override
	public Emp getWork(String work) {
		if (work.equals("A"))
			return new EmpA();
		else if (work.equals("B"))
			return new EmpB();
		else
			return null;
	}
}
