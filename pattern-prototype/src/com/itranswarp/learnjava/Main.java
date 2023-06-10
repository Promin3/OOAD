package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setId(123);
		std1.setName("Bob");
		std1.setScore(88);
		Student std2 = (Student) std1.clone();
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std1 == std2);
	}
}
