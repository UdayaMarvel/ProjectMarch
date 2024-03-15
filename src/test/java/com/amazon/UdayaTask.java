package com.amazon;

public class UdayaTask {

	public static void main(String[] args) {
		String name = "malayalam";
		String reverseName = "";
		for(int i=name.length()-1; i>=0;i--) {
			reverseName = reverseName+ name.charAt(i);
		}
		if (name.toLowerCase().equals(reverseName.toLowerCase())) {
		      System.out.println(name + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(name + " is not a Palindrome String.");
		    }
		
		
		
	}
}
