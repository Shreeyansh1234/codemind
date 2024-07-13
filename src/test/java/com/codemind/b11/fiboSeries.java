package com.codemind.b11;

public class fiboSeries {

	public static void main(String[] args) {
		int f=0,s=1,i,t,count=10;
		System.out.print(f+" "+s);
		
		for(i=2;i<count;i++) {
			
			t=s+f;
			System.out.print(" "+t);
			f=s;
			s=t;
		}
	}

}
