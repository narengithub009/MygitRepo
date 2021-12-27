package com.java.absandinterface;

public class InterfaceEx {
	public static void main(String[] args) {

		Shape12 s;

		s = new CircleShape1();
		s.draw();

		s = new RextangleShape1();

		s.draw();

		s = new PolygonShape1();
		s.draw();
	}
}

interface Shape12 {

	abstract void draw();
}

class CircleShape1 implements Shape12 {
	public void draw() {
		System.out.println("Drawing a Circle shape");
	}
}

class RextangleShape1 implements Shape12 {
	public void draw() {
		System.out.println("Drawing a Rectangle shape");
	}
}

class PolygonShape1 implements Shape12 {
	public void draw() {
		System.out.println("Drawing a Polygon shape");
	}
}