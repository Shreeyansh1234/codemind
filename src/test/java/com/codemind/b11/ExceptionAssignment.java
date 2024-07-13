package com.codemind.b11;
class throwEx{
	 void NumCheck(int i) throws ArithmeticException{
		//int i=-1;
		if(i<0) {
		throw new ArithmeticException("Number is negative");
			}
		else {
			System.out.println("Number is positive");
		}
	}
}
public class ExceptionAssignment {
	
	public static void main(String[] args) {
		
		
        throwEx t=new throwEx();
        try {
		t.NumCheck(-4);
        }
        catch(ArithmeticException e) {
        	System.out.println(e);
        }
	}
}	