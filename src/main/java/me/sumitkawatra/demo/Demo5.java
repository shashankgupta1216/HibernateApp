package me.sumitkawatra.demo;

import me.sumitkawatra.model.SpringBean;
import me.sumitkawatra.util.ApplicationContextUtil;
/**
 * Bean LifeCycle
 * 
 * Static Block
 * Constructor
 * Setter Injection
 * Before INIT Hook
 * InitizationBean Interface/annotation@Init/configuration in XML. 
 * After INIT Hook
 * DisposeableBean/annotation@destroy/configuration in XML. 
 * @author Sumit Kawatra
 *
 */
public class Demo5 {
	
	public static void main(String[] args) {
		SpringBean bean = ApplicationContextUtil.getContext().getBean(SpringBean.class,"springBean");
		
		System.out.println(bean); 
		
		
		ApplicationContextUtil.closeContext();
	}

}
