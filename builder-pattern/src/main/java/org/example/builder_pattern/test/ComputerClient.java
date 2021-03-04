package org.example.builder_pattern.test;

import org.example.builder_pattern.beans.Computer;

public class ComputerClient {

	public static void main(String[] args) {

		Computer comp = new Computer.Builder("2GB", "2TB", "Intel i7").build();
		System.out.println(comp);
		
		Computer comp1 = new Computer.Builder("2GB", "2TB", "Intel i7").setGraphicsCardEnabled(true).build();
		System.out.println(comp1);
		Computer comp3=new Computer.Builder("4GB", "512GB", "AMD").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println(comp3);
		
	}

}
