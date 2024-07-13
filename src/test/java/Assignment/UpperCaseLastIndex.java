package Assignment;

public class UpperCaseLastIndex {

	public static void main(String[] args) {
		String s="Codemind Technology Pune";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++) {
				if(!(Character.isUpperCase(s.charAt(j)))&& s.charAt(j) == ' ')
			//System.out.println(s.valueOf(s.charAt(arr[j].length()-1)));
			System.out.println(s.valueOf(s.charAt(arr[j].length()-1)).toUpperCase());
		}
		}
		System.out.println("**************");

	}

}
