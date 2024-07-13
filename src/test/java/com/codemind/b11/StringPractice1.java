package com.codemind.b11;

public class StringPractice1 {

	public static void main(String[] args) {
		String str="Madhuria";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println("##################");
		int c=1;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					c+=1;
					
					
				}
				System.out.println(str.charAt(i)+c);
				//System.out.println(c);
				
			}
			
		}
		System.out.println();
		System.out.println("BBBBBBBBBBB");
	}

}
