package org.example.demo.test;

import org.example.demo.beans.Computer;
import org.example.demo.factory.ComputerFactory;
import org.example.demo.factory.ComputerType;

public class ComputerClient {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1GB", "256GB", "Intel Core 2 Duo");
		System.out.println(pc.getClass());

		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1TB", "AMD Ryzen 7 2700X");
		System.out.println(server.getClass());
	}

}
