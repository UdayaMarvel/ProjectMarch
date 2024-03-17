package com.amazon;

public class AmeerTask {
	
public static void main (String[] args) {
		
		String name = "mohamedameer";
		
		int vowels=0;
		int nonvowels =0;
		
		for (int i =name.length()-1;  i>=0; i--) {
			
			char c = name.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				System.out.println("vowels" +c);
				vowels++;
			}
			
			else {
				System.out.println("nonvowels" +c);
				
				nonvowels++;
			}
			
		}
		System.out.println(vowels);
		System.out.println(nonvowels);
		
	}
}

