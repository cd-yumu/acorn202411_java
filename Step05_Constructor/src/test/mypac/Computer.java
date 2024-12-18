package test.mypac;

public class Computer {
	private Cpu c;
	private Memory m;
	private Ssd s;
	
	// Default Constructor is gone when you define another Constructor
	
	// Constructor
	public Computer(Cpu c, Memory m, Ssd s) {
		this.c = c;
		this.m = m;
		this.s = s;
	}
}
