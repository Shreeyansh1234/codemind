package Practice;

public class PrimeNo {

	public static void main(String[] args) {
		//finding prime between 1 to 50
		for(int i=2;i<51;i++) {
			boolean prime=true;
		for(int j=2; j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				prime=false;
			break;
				
			}
			
//			
			}
		if(prime==true) {
				System.out.println(i);
			}
		
		}

	}

}
