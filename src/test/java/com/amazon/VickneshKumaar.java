package com.amazon;

public class VickneshKumaar {
	
	public static void main(String[] args) {
		int a,b=0;    
		  int n=153;
		  int c=n;
		  
		  
		     
		  while(n>0){    
		   a=n%10;  
		   b=(b*10)+a;    
		   n=n/10;    
		  }    
		  System.out.println("Reverse Number is " +b);
		  if(c==b) {   
		   System.out.println("palindrome number ");   
		  }
		  else    {
		   System.out.println("not palindrome");  
		  }
		 
	}

}
