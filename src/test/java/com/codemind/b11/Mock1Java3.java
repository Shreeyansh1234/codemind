package com.codemind.b11;

public class Mock1Java3 {
	

	//private static final boolean True = true;
	//private static final boolean False = false;

	public static void main(String[] arg) {
		
			//Prime no from 1-50
		
		for(int i=2;i<51;i++) {
			boolean Prime= true;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					Prime=false;
					break;				
					 }
			
			}
			if(Prime==true) {
				System.out.println(i);
			}
			
		}

}
}
/* for(int i=2; i<51; i++) {
	boolean Prime = true;
	for(int j=2; j<=Math.sqrt(i); j++) {  // Only check up to the square root of i
		if(i % j == 0) {
			Prime = false;
			break;
		}
	}
	if(Prime == true) {
		System.out.println(i);
	}
}*/