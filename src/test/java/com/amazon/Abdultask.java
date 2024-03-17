package com.amazon;

public class Abdultask {
public static void main(String[] args) {
	

	String s="abdul malik";
	
	String s1="";                           //to print abdul kilam
	String[] split= s.split(" ");
	char[] cs = split[1].toCharArray();
	for(int i=split[1].length()-1;i>=0;i--) {
		s1+=cs[i];
	}

	String s2=split[0]+" "+s1;
	System.out.println(s2);


}}
