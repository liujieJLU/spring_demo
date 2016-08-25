package com.bean;

import com.inter.Animal;

public class Cat implements Animal{

	public void eat() {
		System.out.println("猫吃猫粮");
	}

	public void la() {
		System.out.println("猫拉猫屎");
	}

}
