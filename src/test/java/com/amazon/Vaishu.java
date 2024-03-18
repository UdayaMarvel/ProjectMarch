package com.amazon;

public class Vaishu {
	public static void main (String []args) {
		String s = "Hello March";
		int vowels =0;
		int consonants =0;
		String Vowels = "";
		String Consonants ="";

		
		
		for (int i=0; i<=s.length()-1; i++) {
			char c = s.charAt(i);
				if (c =='a'|| c=='A' || c=='e'|| c=='E' || c=='i' || c=='I' || c=='o'|| c=='O'||c=='u'|| c=='U') {
//					System.out.println(c);
					Vowels = Vowels +c;
					vowels ++;
			    }
				
				else {
//					System.out.println("Consonants : " + c);
					Consonants = Consonants + c ;
					consonants ++;
				}
		}
		System.out.println("Vowels : " + Vowels);
		System.out.println("Consonants : " + Consonants);
		System.out.println("Count : ");
		System.out.println(vowels);
		System.out.println(consonants);
		
	}

}


