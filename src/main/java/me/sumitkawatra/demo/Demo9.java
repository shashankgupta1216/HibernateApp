package me.sumitkawatra.demo;

import me.sumitkawatra.model.PrototypeBean;
import me.sumitkawatra.model.SingletonBean;
import me.sumitkawatra.util.ApplicationContextUtil;
/**
 * Finally Third way to understand 
 * @author Sumit Kawatra
 *
 */
public class Demo9 {
	
	public static void main(String[] args) {
		SingletonBean singletonBean = ApplicationContextUtil.getContext().getBean("singletonBean",SingletonBean.class);
		SingletonBean singletonBean2 = ApplicationContextUtil.getContext().getBean("singletonBean",SingletonBean.class);
		
		PrototypeBean prototypeBean = ApplicationContextUtil.getContext().getBean("prototypeBean",PrototypeBean.class);
		PrototypeBean prototypeBean2 = ApplicationContextUtil.getContext().getBean("prototypeBean",PrototypeBean.class);
		
		System.out.println(singletonBean.hashCode());
		System.out.println(singletonBean2.hashCode());
		
		System.out.println(singletonBean.getPrototypeBean().hashCode());
		System.out.println(singletonBean2.getPrototypeBean().hashCode());
				
		System.out.println(prototypeBean.hashCode());
		System.out.println(prototypeBean2.hashCode());
	}
}
