package org.example.demo.beans;

public class Laptop implements Computer {
	private String RAM;
	private String HDD;
	private String CPU;
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.RAM;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.HDD;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}

	@Override
	public String toString() {
		return "Laptop [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}

}
