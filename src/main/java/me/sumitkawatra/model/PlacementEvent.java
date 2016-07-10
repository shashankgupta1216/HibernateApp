package me.sumitkawatra.model;

import java.util.Date;
import java.util.Set;

public class PlacementEvent {
	
	private Company company;
	private Set<Student> students;
	private Date date;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
