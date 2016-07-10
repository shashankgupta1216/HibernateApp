package me.sumitkawatra.demo2;

import me.sumitkawatra.beans.Container;
import me.sumitkawatra.util.ApplicationContextUtil;

/**
 * Autowire and inject is to wiring
 * Resource is to get me resource by Name.
 * @author Sumit Kawatra
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		
		Container container = (Container) ApplicationContextUtil.getContext().getBean("container");		
		System.out.println(container.getContainee().getMessage());
		
	}
}
