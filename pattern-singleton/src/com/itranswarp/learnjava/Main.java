package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Earth earth = Earth.getInstance();
		System.out.println(earth.getName());

		World world = World.INSTANCE;
		System.out.println(world.getName());
	}
}
