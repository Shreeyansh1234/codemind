package Practice;

public class FiboSeriesEx {
	int n1=0,n2=1,n3;    
	 
	void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1); 
	     }    
	 }  

	public static void main(String[] args) {
		  
		 FiboSeriesEx f=new FiboSeriesEx();
		 System.out.print(f.n1+" "+f.n2);//printing 0 and 1 
		 f.printFibonacci(9);
		     
	

	}

}
