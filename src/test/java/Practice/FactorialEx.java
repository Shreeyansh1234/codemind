package Practice;

public class FactorialEx {

	public static void main(String[] args) {
		int n=5;
		int f=1;
		//for(integer i:n) {----gives error
		for(int i=1;i<=n;i++) {
			f=i*f;
			
		}
System.out.println("Factoria of 5 is: " + f);
	}

}
