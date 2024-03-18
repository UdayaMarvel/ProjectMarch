package com.amazon;

public class SandhiyaM {
	public static void main(String[] args) {
		int a[]= {200,600,300,500,600,1000};
		int c;
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
//					c = a[i]; 
//					a[i]=a[j];
//					a[j]=c;
				}
			}
			System.out.println(a[i]);
	}
	}

}
