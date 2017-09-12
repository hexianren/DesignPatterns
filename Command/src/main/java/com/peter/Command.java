package com.peter;

/**
 * 命令接口
 */
public abstract class Command {
	protected Group group;
	public abstract void execute();
}
