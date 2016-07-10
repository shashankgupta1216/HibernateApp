package me.sumitkawatra.demo2;

import me.sumitkawatra.beans.SpringBean;
import me.sumitkawatra.util.ApplicationContextUtil;
import me.sumitkawatra.util.ContextLoader;

public class Demo1 extends ContextLoader{
	
	public static void main(String[] args) {
		SpringBean o = (SpringBean) ApplicationContextUtil.getContext().getBean("springBean");
		System.out.println(o.getDependency().getMessage());
		ApplicationContextUtil.closeContext();
		System.out.println("Done");
	}
}
