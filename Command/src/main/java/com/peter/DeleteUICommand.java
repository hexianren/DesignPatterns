package com.peter;

public class DeleteUICommand extends Command {
		public void execute() {
				//找到需求组
				super.pg.find();
				//增加需求
				super.pg.add();
				//给出计划
				super.pg.plan();
		}
}
