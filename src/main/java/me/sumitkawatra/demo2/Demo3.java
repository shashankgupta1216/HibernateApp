package me.sumitkawatra.demo2;

import me.sumitkawatra.beans.PrototypeBean;
import me.sumitkawatra.beans.SingletonBean;
import me.sumitkawatra.util.ApplicationContextUtil;

/**
 * Prototype injected into Singleton implemented using @LooUp  
 * @author Sumit Kawatra
 *
 */
public class Demo3 {
	
	public static void main(String[] args) {
		SingletonBean singletonBean = (SingletonBean) ApplicationContextUtil.getContext().getBean("singletonBean");
		SingletonBean singletonBean2 = (SingletonBean) ApplicationContextUtil.getContext().getBean("singletonBean");
		
		PrototypeBean prototypeBean = (PrototypeBean) ApplicationContextUtil.getContext().getBean("prototypeBean");
		PrototypeBean prototypeBean2 = (PrototypeBean) ApplicationContextUtil.getContext().getBean("prototypeBean");
		
		
		System.out.println(singletonBean.hashCode());
		System.out.println(singletonBean.getPrototypeBean().hashCode());
		System.out.println(singletonBean2.hashCode());
		System.out.println(singletonBean2.getPrototypeBean().hashCode());
		 
		 
		
		System.out.println(prototypeBean.hashCode());
		System.out.println(prototypeBean2.hashCode()); 
		
		
	}

}
