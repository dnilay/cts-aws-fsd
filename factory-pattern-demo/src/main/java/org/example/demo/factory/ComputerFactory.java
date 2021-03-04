package org.example.demo.factory;

import org.example.demo.beans.Computer;
import org.example.demo.beans.PC;
import org.example.demo.beans.Server;

public class ComputerFactory {

public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {

	Computer comp = null;
	switch (type) {
	case PC:
		comp = new PC(ram, hdd, cpu);
		break;
	case SERVER:
		comp = new Server(ram, hdd, cpu);
		break;
	}

	return comp;
}
}
