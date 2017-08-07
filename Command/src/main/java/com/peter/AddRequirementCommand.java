package com.peter;

public class AddRequirementCommand extends Command {
	public AddRequirementCommand(Group group) {
		this.group = group;
	}

	public void execute() {
		//找到需求组
		group.find();
		//增加需求
		group.add();
		//给出计划
		group.plan();
	}
}
