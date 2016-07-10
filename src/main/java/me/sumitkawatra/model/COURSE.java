package me.sumitkawatra.model;

public enum COURSE {
	
	BCA(10,"BCA"),
	MCA(20,"MCA"),
	BTECH(30,"B.Tech"),
	MTECH(40,"M.Tech");
	
	private int id;
	private String name;
	
	private COURSE(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	
	
}
