package org.example.demo.test;

import org.example.demo.abstractfactory.ComputerFactory;
import org.example.demo.abstractfactory.LaptopFactory;
import org.example.demo.abstractfactory.PCFactory;
import org.example.demo.abstractfactory.ServerFactory;
import org.example.demo.beans.Computer;

public class ComputerClient {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.createComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		System.out.println(pc+" "+pc.getClass());
		
		Computer server = ComputerFactory.createComputer(new ServerFactory("2 GB","500 GB","2.4 GHz"));
		System.out.println(server+" "+server.getClass());
		
		Computer laptop = ComputerFactory.createComputer(new LaptopFactory());
		System.out.println(laptop+""+laptop.getClass());
		
	}

}
