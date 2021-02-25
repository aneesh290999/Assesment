package com.kctechasses2;
interface NewInterface { 
	  
    
    static void hello() 
    { 
        System.out.println("Hello, New Static Method Here"); 
    } 
  
    
    void overrideMethod(String str); 
} 
public class Asses2 implements NewInterface {

	public static void main(String[] args) {
		Asses2 interfaceDemo = new Asses2(); 
		  
        
        NewInterface.hello(); 
  
        
        interfaceDemo.overrideMethod("Hello, Override Method here"); 
    } 
  
   
  
    @Override
    public void overrideMethod(String str) 
    { 
        System.out.println(str); 
    } 
	}


