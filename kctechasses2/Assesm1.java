package com.kctechasses2;

public class Assesm1 {

	public static void main(String[] args) {
		int i,total;
	      int a[] = {5,3,4,55,2,12,34};
	      int n = 7;
	      total = 0;

	      for(i=0; i<n; i++) {
	         total += a[i];
	      }
	      System.out.println("Average ::"+ total/(float)n);
	   }

	}


