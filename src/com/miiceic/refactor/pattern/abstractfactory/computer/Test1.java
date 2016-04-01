package com.miiceic.refactor.pattern.abstractfactory.computer;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComputerProducer cp = new PcProducer();
		Cpu cup = cp.createCpu();
		Ram ram = cp.createRam();
		
	}

}
