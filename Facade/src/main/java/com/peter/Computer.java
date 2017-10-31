package com.peter;

/**
 * 相当于Facade
 */
public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer(){
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}

	public void startup(){
		System.out.println("Start the computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("Start computer finished!");
	}

	public void shutdown(){
		System.out.println("Begin to close the computer!");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("Computer closed!");
	}
}

