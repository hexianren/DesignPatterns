package com.peter;

/**
 * 具体处理类
 * 处理它所负责的请求，可访问它的后继者，如果可以处理该请求，处理之；否则把请求转发给它的后继者
 * @author Administrator
 *
 */
public class ConcreteHandler3 extends Handler {
    /**
     * 处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest(int request) {
        /**
         * 判断是否满足处理条件
         * 如果满足，则处理请求
         * 如果不满足，则交给后继者
         */
        if (request >= 20 && request < 30) {
            System.out.println("处理请求: " + request + " By: " + this.getClass().getSimpleName());
        } else if (getSuccessor() != null) {
				getSuccessor().handleRequest(request);
        }
    }
}
