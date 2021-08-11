package com.telstra.pack1;

public class User {
	
	private int id;
	private String Name;
	private String role;
	public User(int id, String name, String role) {
		super();
		this.id = id;
		Name = name;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", role=" + role + "]";
	}
	
	

}
