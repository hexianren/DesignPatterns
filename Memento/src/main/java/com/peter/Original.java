package com.peter;

/**
 * Original类是原始类，里面有需要保存的属性value
 * 负责创建一个备忘录，用以记录当前时刻它的内部状态；并可使用备忘录恢复内部状态
 */
public class Original {  

	private String value;  

	public String getValue() {  
		return value;  
	}  

	public void setValue(String value) {  
		this.value = value;  
	}  

	public Original(String value) {  
		this.value = value;  
	}  

	// 创建备忘录类，保存value的值 
	public Memento createMemento(){  
		return new Memento(value);  
	}  

	// 使用备忘录恢复value
	public void restoreMemento(Memento memento){  
		this.value = memento.getValue();  
	}  
}
