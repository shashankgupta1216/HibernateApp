package me.sumitkawatra.demo;

import me.sumitkawatra.model.PrototypeBean;
import me.sumitkawatra.util.ApplicationContextUtil;

/**
 * Demo 7 Is lesson learn to use this get bean
 * @author Sumit Kawatra
 *
 */
public class Demo7 {
	
	public static void main(String[] args) {
		//SingletonBean singletonBean = ApplicationContextUtil.getContext().getBean(SingletonBean.class,"singletonBean");
		PrototypeBean prototypeBean = ApplicationContextUtil.getContext().getBean("prototypeBean",PrototypeBean.class);
		PrototypeBean prototypeBean2 = ApplicationContextUtil.getContext().getBean("prototypeBean",PrototypeBean.class);
		
		//System.out.println(singletonBean.getPrototypeBean());
		System.out.println(prototypeBean.hashCode());
		System.out.println(prototypeBean2.hashCode());
	}
}
