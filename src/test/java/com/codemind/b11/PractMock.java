package com.codemind.b11;

public class PractMock {

	

		public static void main(String[] args) {

			String s2 = "Welcome to CodemiNd";
			// can you please reverse given String
			// dnimedoc ot emocleW
			// dnimedoc ot emocleW

			for (int i = s2.length() - 1; i >= 0; i--) {
				System.out.print(s2.charAt(i));
			}
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

			System.out.println("#######################################");

			// can you please reverse given String words
			// emocleW ot dnimedoc
			String a[] = s2.split(" ");

			for (int i = 0; i < a.length; i++) {
				String sss = a[i];
				for (int j = sss.length() - 1; j >= 0; j--) {
					System.out.print(sss.charAt(j));
				}
				System.out.print(" ");
			}
			System.out.println();
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

			// find capital letters count
			for (int i = 0; i < s2.length(); i++) {
				char cc = s2.charAt(i);

				if (cc >= 'A' && cc <= 'Z') {
					System.out.println(cc);
				}
			}

			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println();

			int count = 0;
			for (int i = 0; i < s2.length(); i++) {
				char c = s2.charAt(i);
				if (c == 'd') {
					count++;
				}
			}

			System.out.println("Count of given character is = " + count);

			System.out.println("##########################################");

			String s = "1234$#%#$%$DDFGaAS#$678kLKDN123";

			System.out.println(s.replaceAll("[12]", ""));

			System.out.println(s.replaceAll("[^12]", ""));

			System.out.println(s.replaceAll("[0-9]", ""));

			System.out.println(s.replaceAll("[^0-9]", ""));

			System.out.println(s.replaceAll("[^0-9a-zA-Z]", ""));

			System.out.println(s.replaceAll("[0-9a-zA-Z]", ""));

			System.out.println(s.replaceAll("[0-9a-zA-Z%]", ""));

			System.out.println("#########################################");
			System.out.println();
			// 1234678123

			// 37
			String number = s.replaceAll("[^0-9]", "");

			int sum = 0;

			for (int i = 0; i < number.length(); i++) {
				char c = number.charAt(i);

				sum = sum + Character.getNumericValue(c);

			}
			System.out.println("sum of all digits from given String is = " + sum);
			System.out.println("number of characters in given String is = " + number.length());

			int num = Integer.parseInt(number);

			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

			// character count from given String
			String str = "Welcome to codemind";
			int count1 = 1;
			String str_1 = "";

			for (int i = 0; i < str.length(); i++) {
				char cc = str.charAt(i);
				if (str_1.contains(String.valueOf(cc))) {
					continue;
				}

				for (int j = i + 1; j < str.length(); j++) {

					if (str.charAt(j) == cc) {
						count1++;
					}

				}
				str_1 = str_1 + cc;
				System.out.println("Character = " + cc + " and count = " + (count1));
				count1 = 1;

			}

		}

	}
