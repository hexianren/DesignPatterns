package com.peter;
public class StoppingState extends LiftState {
	//停止状态关门？ 电梯门本来就是关着的！
	@Override
	public void close() {
		//do nothing;
	}
	
	//停止状态， 开门， 那是要的！
	@Override
	public void open() {
		context.setLiftState(Context.openningState);
		context.getLiftState().open();
	}
	
	//停止状态再运行起来， 正常得很
	@Overridepublic void run() {
		context.setLiftState(Context.runningState);
		context.getLiftState().run();
	}
	
	//停止状态是怎么发生的呢？ 当然是停止方法执行了
	@Override
	public void stop() {
		System.out.println("电梯停止了...");
	}
}
