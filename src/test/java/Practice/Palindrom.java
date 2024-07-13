package Practice;

public class Palindrom {

	public static void main(String[] args) {
		String s="popopopopopp";
		boolean pali=true;
		for(int i=0;i<s.length();i++) {
			//System.out.println(s.charAt(i));
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				
				pali=false;
				break;
			}
			
		}
		if(pali) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}

}
