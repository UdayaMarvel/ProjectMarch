package com.amazon;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter The Number");
	     int n= v.nextInt();
		int i ,j=0;
		int p=n;
		while(n>0) {
			i=n%10;
			j=(j*10)+i;
			n=n/10;
			}
		if(p==j) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("notpalindrome");
		}

	}

}
