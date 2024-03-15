package com.amazon;

public class UdayaTask {

	public static void main(String[] args) {
		String name = "Udaya";
		String rev = "";
		for (int i = name.length()-1; i >=0 ; i--) {
			char ch = name.charAt(i);
			rev = rev+ch;
		}
		System.out.println(rev);
		
		
		
		
	}
}
