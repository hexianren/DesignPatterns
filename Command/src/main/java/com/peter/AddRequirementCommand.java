package com.peter;

public class AddRequirementCommand extends Command {
		public void execute() {
				//找到需求组
				super.rg.find();
				//增加需求
				super.rg.add();
				//给出计划
				super.rg.plan();
		}
}
