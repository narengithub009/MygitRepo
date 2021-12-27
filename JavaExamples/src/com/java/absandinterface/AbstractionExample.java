package com.java.absandinterface;

public class AbstractionExample {
	public static void main(String[] args) {
		
		Shape draw=new Shape();
		draw.shape();
		
		Shape s;
		s=new Circle();
		s.shape();
		
		s=new Rectangle();
		s.shape();
		
	}
}

class Shape{
	public void shape() {
		System.out.println("Drawing a shape");
	}
}

class Circle extends Shape{
	public void shape() {
		System.out.println("Drawing a Circle shape");
	}
}
class Rectangle extends Shape {
	public void shape() {
		System.out.println("Drawing a Rectangle shape");
	}
}