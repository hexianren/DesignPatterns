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
			super.context.setLiftState(Context.openningState); //置为敞门状态
			super.context.getLiftState().open();
		}

		//电梯门关了就运行， 这是再正常不过了
		@Override
		public void run() {
			super.context.setLiftState(Context.runningState); //设置为运行状态
			super.context.getLiftState().run();
		}

		//电梯门关着， 我就不按楼层
		@Overridepublic void stop() {
			super.context.setLiftState(Context.stoppingState); //设置为停止状态
			super.context.getLiftState().stop();
		}
}
