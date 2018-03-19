package com.peter;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义有子节点的行为，用来存储子部件，在Component接口中实现与子部件有关的操作
 * @author Administrator
 *
 */
public class Composite extends Component {
 
    // 用来保存节点的子节点  
    List<Component> list = new ArrayList<Component>();  

    // 添加节点 添加部件  
    public void add(Component c) {  
        list.add(c);  
    }  

    // 删除节点 删除部件  
    public void remove(Component c) {   
        list.remove(c);  
    }  

    // 遍历子节点  
    @Override  
    public void showChild() { 
        System.out.println(name + "执行了");  
        for (Component c : list) {  
            c.showChild();  
        }
    }
}
