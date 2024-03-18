package com.amazon;

public class Martin {

	public static void main(String[] args) {
		String name = "MartinStanly67251778@%$&*Y&*";
		int small= 0;
		int upper= 0;
		int number= 0;
		int special= 0;
		
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (c>='a'&& c<='z') {
				System.out.println("small "+c);
				small++;
			} else if (c>='A'&&c<='Z') {
				System.out.println("upper "+c);
				upper++;

			} else if (c>='0'&&c<='9') {
				System.out.println("number "+c);
				number++;
				
			} else {
				System.out.println("special "+c);
				special++;
				
			}
			
			
			
		}

	}

}
