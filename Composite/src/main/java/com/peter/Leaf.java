package com.peter;

/**
 * 在组合中表示叶节点对象，叶节点没有子节点
 * @author Administrator
 *
 */
public class Leaf extends Component{
 
	// 叶子节点不具备添加的能力，所以不实现  
    @Override  
    public void add(Component c) {  
        System.out.println("");  
    }  

    // 叶子节点不具备添加的能力必然也不能实现
    @Override  
    public void remove(Component c) {   
        System.out.println("");  
    }  

    // 叶子节点没有子节点所以显示自己的执行结果  
    @Override  
    public void eachChild() {  
        System.out.println(name + "执行了");  
    }  
}
