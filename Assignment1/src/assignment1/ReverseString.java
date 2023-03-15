package assignment1;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		//taking input from user 
		String s=sc.nextLine();
		
		//calling reverse method..
		System.out.println(reverse(s));
		sc.close();
		

	}
	//method to reverse the string...
	public static String  reverse(String str) {
	
	// intilizing a variable to store the reverse value of string...
	 String str1="";
	 
	 //taking character variable to strore character of string...
	 char ch;
	 for(int i=0;i<str.length();i++) {
		 //ch store the current character of string...
		 ch=str.charAt(i);
		 
		 //adding ch to str1....
		 str1=ch+str1;
	 }
	 return str1;
	 

	 
	}


}
