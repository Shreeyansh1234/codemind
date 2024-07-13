package com.codemind.b11;

public class Mock1Java {

	public static void main(String[] args) {
		String s="Welcome to Codemind";
		String [] t=s.split("\\s");
//		for(String i:t) {
//			System.out.println(i);
//		
//		//System.out.println(t.length);
//
//		}
		System.out.println("******************************");
		for(String i:t) {        
              	for(int k=i.length()-1;k>=0;k--) {
        		System.out.print(i.charAt(k));
        	}System.out.print("\t");	
        	}
        }
	}


