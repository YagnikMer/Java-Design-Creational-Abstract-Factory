package com.classes;

import com.interfaces.Client;

public class ClientB implements Client {
	@Override
	public void onProject() {
	System.out.println("Client B on Project");
	}
}
