package me.sumitkawatra.demo;


import me.sumitkawatra.model.A;
import me.sumitkawatra.model.B;
import me.sumitkawatra.util.ApplicationContextUtil;

/**
 * Circular dependency can handle through setter injection only.
 * @author Sumit Kawatra
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		
		A a = ApplicationContextUtil.getContext().getBean("a",A.class);
		A a1 = ApplicationContextUtil.getContext().getBean("a",A.class);
		
		B b = ApplicationContextUtil.getContext().getBean("b",B.class);
		B b2 = ApplicationContextUtil.getContext().getBean("b",B.class);
		
		System.out.println(a.hashCode());
		System.out.println(a1.getB().hashCode());
		System.out.println(b.hashCode());
		System.out.println(b2.getA().hashCode());
		
	}
}