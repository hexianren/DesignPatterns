package com.peter;
public class ClosingState extends LiftState {
	//电梯门关闭， 这是关闭状态要实现的动作
	@Override
	public void close() {
		System.out.println("电梯门关闭...");
	}

	//电梯门关了再打开
	@Override
	public void open() {
		context.setLiftState(Context.openningState); //置为敞门状态
		context.getLiftState().open();
	}

	//电梯门关了就运行， 这是再正常不过了
	@Override
	public void run() {
		context.setLiftState(Context.runningState); //设置为运行状态
		context.getLiftState().run();
	}

	//电梯门关着， 我就不按楼层
	@Override
	public void stop() {
		context.setLiftState(Context.stoppingState); //设置为停止状态
		context.getLiftState().stop();
	}
}
