package com.peter;

/**
 * 命令发出者
 */
public class Invoker {
	// 持有命令对象     
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	// 执行命令    
	public void runCommand(){
		command.execute();
	}
}
