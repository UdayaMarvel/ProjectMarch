package com.amazon;

public class Sophia {

	public static void main(String[] args) {
		

		int n = 123; 
		int i , j = 0 ;
		 
		while(n>0) {
			i = n%10 ; 
			j = (j*10 )+i ; 
			n=n/10 ; 
			
		}
		System.out.println("for reverse : " + j);
		
	}

}
