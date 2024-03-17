package com.amazon;

public class Bharath {
	public static void main(String[] args) {
		int a[]= {100,23,45,200,74,65};
		int c;
		
		System.out.println("assending order");
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
					System.out.println(a[i]);	
				}}
			
		
					

				}
			
				}
	}
	

