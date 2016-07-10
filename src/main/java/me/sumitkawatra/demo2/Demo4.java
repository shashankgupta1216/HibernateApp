package me.sumitkawatra.demo2;

import me.sumitkawatra.util.ApplicationContextUtil;
/**
 * Scope of spring stereotype.
 * @author Sumit Kawatra
 *
 */
public class Demo4 {
	
	public static void main(String[] args) {
		
		System.out.println("Component --> "+ApplicationContextUtil.getContext().isSingleton("componentBean"));
		System.out.println("Component --> "+ApplicationContextUtil.getContext().isSingleton("serviceBean"));
		System.out.println("Component --> "+ApplicationContextUtil.getContext().isSingleton("controllerBean"));
		System.out.println("Component --> "+ApplicationContextUtil.getContext().isSingleton("repositoryBean"));
	}
}
