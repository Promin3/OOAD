package com.itranswarp.learnjava;

public class Student implements Cloneable {

	private int id;
	private String name;
	private int score;

	@Override
	public Object clone() {
		Student std = new Student();
		std.id = this.id;
		std.name = this.name;
		std.score = this.score;
		return std;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("{Student: id=%s, name=%s, score=%s}@%s", this.id, this.name, this.score,
				Integer.toHexString(hashCode()));
	}
}
