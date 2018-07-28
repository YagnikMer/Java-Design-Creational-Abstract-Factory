package com.classes;

import com.interfaces.Client;

public class ClientA implements Client {
	@Override
	public void onProject() {
	System.out.println("Client A on Project");
	}
}
