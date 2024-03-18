package com.amazon;
import java.util.*;


public class AshlinTask {
	public static void main(String[] args) {
		String s="Ashlinjoshna";
		String u ="";
		Set<Character> d = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			d.add(ch);
		}
		for(Character x:d) {
			u =u+x;
		}
		System.out.println(u);
		}

}
