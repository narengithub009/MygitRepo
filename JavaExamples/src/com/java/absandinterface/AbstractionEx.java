package com.java.absandinterface;

public class AbstractionEx {
	public static void main(String[] args) {
		
//		Shape1 s1=new Shape1();
//		s1.draw();
		
		Shape1 s;
		
		s=new CircleShape();
		s.draw();
		
		s=new RextangleShape();
		
		s.draw();
		
		s=new PolygonShape();
		s.draw();
	}
}

/*
 * class Shape1{
 * 
 * void draw() { System.out.println("Drawing a shape"); } }
 */

abstract class Shape1{
	public Shape1() {
		System.out.println("Constructor");
	}
	abstract void draw();
}
class CircleShape extends Shape1{
	void draw() {
		System.out.println("Drawing a Circle shape");
	}
}
class RextangleShape extends Shape1{
	void draw() {
		System.out.println("Drawing a Rectangle shape");
	}
}
class PolygonShape extends Shape1{
	void draw() {
		System.out.println("Drawing a Polygon shape");
	}
}