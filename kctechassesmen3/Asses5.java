package com.kctechassesmen3;

public class Asses5 {
	interface Interface1
	{ 
		static void print()
		{
			System.out.print("Hello"); 
			} 
		}
	interface Interface2
	{ 
		static void print() 
		{ 
			System.out.print(" World!"); 
			} 
		}
	public static void main(String[] args) {
	Interface1.print();
	Interface2.print();

	}

}
