package com.peter;

/**
 * 定义负责请求的接口
 * @author Administrator
 *
 */
public abstract class Handler {
    // 持有后继的责任对象
    protected Handler successor;
    
    // 示意处理请求的方法，虽然这个示意方法是没有传入参数的，但实际是可以传入参数的，根据具体需要来选择是否传递参数
    public abstract void handleRequest(int request);
    
    // 取值方法
    public Handler getSuccessor() {
        return successor;
    }
    
    // 赋值方法，设置后继的责任对象
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    } 
}
