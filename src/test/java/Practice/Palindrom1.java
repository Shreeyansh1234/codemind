package Practice;

public class Palindrom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MOM";
		StringBuilder sb=new StringBuilder(s);
		String t=sb.reverse().toString();
		//System.out.println(t);
		if(s.equals(t)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
