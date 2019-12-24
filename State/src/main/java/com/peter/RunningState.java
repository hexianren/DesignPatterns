package com.peter;
public class RunningState extends LiftState {
	//电梯门关闭？ 这是肯定的
	@Override
	public void close() {
		//do nothing
		System.out.println("ERROR 电梯运行中本来就是关门状态...");
	}

	//运行的时候开电梯门？ 你疯了！ 电梯不会给你开的
	@Override
	public void open() {
		System.out.println("ERROR 电梯运行中不能开门...");
	}

	//这是在运行状态下要实现的方法
	@Override
	public void run() {
		System.out.println("电梯上下运行...");
	}

	//这绝对是合理的， 只运行不停止还有谁敢坐这个电梯？ ！ 估计只有上帝了
	@Override
	public void stop() {
		context.setLiftState(new StoppingState());//环境设置为停止状态
		context.getLiftState().stop();
	}
}
