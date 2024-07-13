package com.codemind.b11;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		int array[][]= {{11,12,13}, {22,23,24}, {31,34,64}};
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
