package com.peter;
public class RunningState extends LiftState {
	//电梯门关闭？ 这是肯定的
	@Override
	public void close() {
		//do nothing
	}

	//运行的时候开电梯门？ 你疯了！ 电梯不会给你开的
	@Override
	public void open() {
		//do nothing
	}

	//这是在运行状态下要实现的方法
	@Override
	public void run() {
		System.out.println("电梯上下运行...");
	}

	//这绝对是合理的， 只运行不停止还有谁敢坐这个电梯？ ！ 估计只有上帝了
	@Override
	public void stop() {
		context.setLiftState(Context.stoppingState);//环境设置为停止状态
		context.getLiftState().stop();
	}
}
