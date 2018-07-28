package com.classes;

import com.interfaces.Emp;

public class EmpB implements Emp{

	@Override
	public void onWork() {
		System.out.println("Emp B on Work");
	}
}
