package com.kctechjavatest;

import java.util.ArrayList;
import java.util.List;

public class Test9 {

	public static void main(String[] args) {
		final List list = new ArrayList<>(); 
		list.add(1);
		list.add(2);  
		list.add(3); 
		list.remove(2); // it removes the value 3 we add because it store in 2 index of array 
    
		System.out.println(list);
	}

}
