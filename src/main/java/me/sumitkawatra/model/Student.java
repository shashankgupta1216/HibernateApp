package me.sumitkawatra.model;

public class Student {
	private int rollNumber;
	private String name;
	private COURSE course;

	public Student(int rollNumber, String name, COURSE course) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.course = course;
	}

	public Student() {
		super();
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public COURSE getCourse() {
		return course;
	}

	public void setCourse(COURSE course) {
		this.course = course;
	}

}
