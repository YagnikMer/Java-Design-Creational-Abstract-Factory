package com.classes;

import com.interfaces.Emp;

public class EmpA implements Emp{

	@Override
	public void onWork() {
		System.out.println("Emp A on Work");
	}
}
