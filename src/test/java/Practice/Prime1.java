package Practice;

public class Prime1 {

	public static void main(String[] args) {
		int a=23;
		boolean prime=true;
		for(int j=2; j<=Math.sqrt(a);j++) {
			if(a%j==0) {
				prime=false;
			break;
				
			}
			
//			
			}
		if(prime==true) {
				System.out.println("prime");
			}
		else {
			System.out.println("not prime");
		}
		
	}

}
