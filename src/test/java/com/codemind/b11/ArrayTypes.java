package com.codemind.b11;

public class ArrayTypes {

	public static void main(String[] args) {
		
	
		int arr[]= {10,20,30,40,70,90,25};
		
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if (arr[i]>arr[j]) {
						int k=arr[i];
						arr[i]=arr[j];
						arr[j]=k;					
					}
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
		}
		}
}
