package com.peter;

public class Context {
	//定义一个当前电梯状态
	private LiftState liftState;
	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		//把当前的环境通知到各个实现类中
		this.liftState.setContext(this);
	}

	public void open(){
		this.liftState.open();
	}

	public void close(){
		this.liftState.close();
	}

	public void run(){
		this.liftState.run();
	}

	public void stop(){
		this.liftState.stop();
	}
}
