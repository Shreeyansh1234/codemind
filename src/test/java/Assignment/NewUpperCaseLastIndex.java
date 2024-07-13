package Assignment;

public class NewUpperCaseLastIndex {

	public static void main(String[] args) {
		String s="Pune Codemind Technology";
		String arr[]=s.split(" ");
		StringBuilder result = new StringBuilder(); 
				
		for(String word:arr) {
			
		int last_Index=word.length()-1;
		
		char last=Character.toUpperCase(word.charAt(last_Index));
		String ss=word.substring(0,last_Index)+last;
		
		result.append(ss).append(" ");
		
		}
		System.out.println(result.toString().trim());
	}

}

//package Assignment;
//
//public class NewUpperCaseLastIndex {
//
//    public static void main(String[] args) {
//        String s = "Pune Codemind Technology";
//        String[] arr = s.split(" ");
//        StringBuilder result = new StringBuilder();
//
//        for (String word : arr) {
//            if (word.length() > 0) {
//                int lastIndex = word.length() - 1;
//                char lastCharUpper = Character.toUpperCase(word.charAt(lastIndex));
//                String modifiedWord = word.substring(0, lastIndex) + lastCharUpper;
//                result.append(modifiedWord).append(" ");
//            }
//        }
//
//        // Trim the trailing space and print the result
//        System.out.println(result.toString().trim());
//    }
//}
//
