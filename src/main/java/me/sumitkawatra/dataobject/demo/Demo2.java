package me.sumitkawatra.dataobject.demo;

import org.apache.commons.dbcp.BasicDataSource;

import me.sumitkawatra.util.ApplicationContextUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		BasicDataSource dataSource = (BasicDataSource) ApplicationContextUtil.getContext().getBean("dataSource");
		
		System.out.println(dataSource);
		
		ApplicationContextUtil.closeContext();
	}
	

}
