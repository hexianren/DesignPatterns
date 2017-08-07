package com.peter;

public abstract class Group {
	// 找到这个项目组
	public abstract void find();
	// 被要求增加功能
	public abstract void add();
	// 被要求删除功能
	public abstract void delete();
	// 被要求修改功能
	public abstract void change();
	// 被要求列出所有的变更计划
	public abstract void plan();
}
