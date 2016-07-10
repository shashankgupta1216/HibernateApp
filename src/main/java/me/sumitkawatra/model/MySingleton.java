package me.sumitkawatra.model;

public class MySingleton {
	
	private static MySingleton SINGLETON;
	
	static {
		System.out.println("Singleton Loading");
		SINGLETON = new MySingleton();
	}
	
	private MySingleton(){
		
	}
	
	public static MySingleton getInstance() {
		return MySingleton.SINGLETON;
	} 
	
}
