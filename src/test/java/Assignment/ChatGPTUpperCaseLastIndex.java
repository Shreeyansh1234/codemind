package Assignment;

public class ChatGPTUpperCaseLastIndex {

	public static void main(String[] args) {
		String inputString = "hello hello";
        String result = convertLastLetterToUpperCase(inputString);
        System.out.println(result);

	}


public static String convertLastLetterToUpperCase(String s) {
    if (s == null || s.isEmpty()) {
        return s;  // Return the string as is if it's null or empty
    }
    int lastIndex = s.length() - 1;
    char lastChar = Character.toUpperCase(s.charAt(lastIndex));
    return s.substring(0, lastIndex) + lastChar;
}}