package com.kctechjavatest;
public class Foo 
{ 
	public Foo() 
	{
		doSomething(); 
		} 
public void doSomething() { System.out.println("do something acceptable"); } } 
public class Test7 extends Foo{

	public static void main(String[] args) {
		System.out.println("yolo"); Zoom zoom = new Zoom(this); }
	
	}

}
