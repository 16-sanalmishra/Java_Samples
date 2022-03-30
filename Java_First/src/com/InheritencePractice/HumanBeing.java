package com.InheritencePractice;

public class HumanBeing {

	private int eyes;
	private String name;
	private char gender;
	public HumanBeing(int eyes, String name, char gender) {
		super();
		this.eyes = eyes;
		this.name = name;
		this.gender = gender;
	}
	public HumanBeing() {
		// TODO Auto-generated constructor stub
	}
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
