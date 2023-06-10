package com.itranswarp.learnjava;

public class Earth {

	private static final Earth instance = new Earth();

	private String name = "earth";

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Earth() {
	}

	public static Earth getInstance() {
		return instance;
	}
}
