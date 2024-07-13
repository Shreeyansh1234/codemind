package com.codemind.b11;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Manual Testing";
		// charAt
		char c = str.charAt(0);
		System.out.println(c);
		
		System.out.println("****************");
		
		//concat
		System.out.println(str.concat(" + Automation Testing"));
		System.out.println("****************");
		
		// compareTo
		System.out.println(str.compareTo("Automation Testing"));
		System.out.println("****************");
		
		// compareToIgnoreCase
		System.out.println(str.compareToIgnoreCase("manual testing"));
		System.out.println("****************");
		
		//contains
		System.out.println(str.contains("testing"));
		System.out.println(str.contains("Testing"));
		System.out.println("****************");
		
		//endsWith
		System.out.println(str.endsWith("g"));
		System.out.println(str.endsWith("t"));
		System.out.println("****************");
		
		//equals
		System.out.println(str.equals("Manual Testing"));
		System.out.println(str.equals("Manual"));
		System.out.println("****************");
		
		//equalsIgnoreCase		
		System.out.println(str.equalsIgnoreCase("Manual Testing"));
		System.out.println(str.endsWith("Manual"));
		System.out.println("****************");
		

	}

}
