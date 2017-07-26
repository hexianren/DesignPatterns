package com.peter;

/**
 * 命令接口
 * @author Administrator
 *
 */
public abstract class Command {
	protected RequirementGroup rg = new RequirementGroup();
	protected UIGroup pg = new UIGroup();
	protected CodeGroup cg = new CodeGroup();

	public abstract void execute();
}
