package Practice;

import com.codemind.b11.SringFinding;

public class impEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to new job";
		String result=reverse1(s);
		System.out.println(result);

	}
	
	public static String reverse1(String ss) {
		StringBuilder sb=new StringBuilder(ss);
		return sb.reverse().toString();
	}

}
