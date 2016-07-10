package me.sumitkawatra.demo;

import me.sumitkawatra.model.PrototypeBean;
import me.sumitkawatra.util.ContextLoader;
/**
 * Demo 8 another way to load application context
 * @author Sumit Kawatra
 *
 */
public class Demo8 extends ContextLoader {
	
	public static void main(String[] args) {
		Demo8 foo = new Demo8();
		
		PrototypeBean bean1 = (PrototypeBean) foo.getApplicationContext().getBean("prototypeBean");
		PrototypeBean bean2 = (PrototypeBean) foo.getApplicationContext().getBean("prototypeBean");
		
		System.out.println(bean1.hashCode());
		System.out.println(bean2.hashCode());
	}

}
