package org.example.demo.abstractfactory;

import org.example.demo.beans.Computer;
import org.example.demo.beans.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {

	@Override
	public Computer createComputer() {
		return new Laptop();
	}

}
