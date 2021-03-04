package org.example.demo.abstractfactory;

import org.example.demo.beans.Computer;

public class ComputerFactory {

	public static Computer createComputer(ComputerAbstractFactory caf) {
		return caf.createComputer();
	}
}
