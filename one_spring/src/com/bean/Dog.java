package com.bean;

import com.inter.Animal;

public class Dog implements Animal{

	public void eat() {
		System.out.println("狗吃狗粮");
	}

	@Override
	public void la() {
		System.out.println("狗拉狗屎");
	}

}
