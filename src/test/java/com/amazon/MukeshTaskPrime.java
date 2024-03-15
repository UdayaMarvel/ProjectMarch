package com.amazon;

public class MukeshTaskPrime {
	public static void main(String[] args) {
		int c;
		
		for(int a=1;a<=30;a++) {
			c=0;
			for(int b=2;b<=a/2;b++) {
				if(a%b==0) {
					c=1;
				}
			}
				if(c==0) {
					System.out.println("Prime no "+a);

			}
				else {
					System.out.println("Not Prime no "+a);
				}
			
			}
	}

}
