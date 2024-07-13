package com.codemind.b11;

public class SringFinding {

	public static void main(String[] args) {
		String str[] = {"Amit", "Sunil", "Diksha", "Madhuri", "Diksha", "Neha", "Diksha"};
		int c=0;
		for(int i=0;i<str.length;i++) {
			if(str[i]=="Diksha") {
				c++;
				
			}
		}
		System.out.println("The Occurrence of String Diksha: "+c);
	}

}
