package com.codemind.b11;

public class stringmethos {

	public static void main(String[] args) {
		String str = "1234@#$&*()456&*()%6784";
		String d=str.replaceAll("\\D","");
		System.out.println("All extracted digits: " +d);
		char arr[]=d.toCharArray();
		System.out.println(arr);
		 int sum = 0;
	        for (char c : arr) {
	            // Convert char to int and add to sum
	            sum += Character.getNumericValue(c);
	        }
	        
	        //Character.getNumericValue()
	        System.out.println("Sum of alldigits is: " + sum);
	}

}
