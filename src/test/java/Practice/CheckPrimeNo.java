package Practice;

public class CheckPrimeNo {

	public static void main(String[] args) {
		int n=2;
		boolean prime=true;
		for(int i=2;i<n;i++) {
			
			//boolean pr=true;
			if(n%i==0) {
				//System.out.println("Number is not prime");
				prime=false;
				break;
			}
			

		}
		if(prime) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
					
	}

}
