package Assignment;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class LinkedHashSetAssignment {

	public static void main(String[] args) {
		TreeSet<Integer> S = new TreeSet<Integer>();
		/*We can use Set<Integer> S = new LinkedHashSet<Integer>(); Bcoz set is parent class of LinkedHashSet*/
		S.add(1);
		S.add(2);
		S.add(3);
		System.out.println("S: " + S);
		System.out.println("******Iterating TreeSet using Iterator*******");
		Iterator<Integer> it=S.iterator();	//Iterator it=S.ierator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("******Iterating TreeSet using For-Each Loop*******");
		for(Integer i:S) {
			System.out.println(i);
		}
		TreeSet<Integer> S1=new TreeSet<Integer>();
		S1.add(4);
		S1.add(4);//Removes duplicates
		S1.add(5);
		S1.add(6);
		S1.add(7);
		S1.add(8);
		
		System.out.println("S1: " + S1);
		
		S1.addAll(S);
		System.out.println("S1 After Adding S Elements: " + S1);//Adds elements at end
		S1.remove(8);//if element present it will delete that element, else gives output as it is.
		System.out.println("S1 After removing element 8: " + S1);
		S1.removeAll(S);
		System.out.println("S1 After removing S Elements: " + S1);
		S1.clear();
		System.out.println("S1 After Clearing Elements: " + S1);
		System.out.println("********Creating new S*********");
		TreeSet<Integer> S2=new TreeSet<Integer>();
		S2.add(10);
		S2.add(20);
		S2.add(30);
		S2.add(40);
		S2.add(50);
		System.out.println("S2: " + S2);
		System.out.println("Size of arrayS2= " + S2.size());
		System.out.println("Checking whether  the S2 contains specified element or not:  " + S2.contains(10));
		System.out.println("Checking whether  the S2 contains specified element or not:  " + S2.contains(100));
		System.out.println("Is S2 Empty: " + S2.isEmpty());
		System.out.println("Is S1:Empty " + S1.isEmpty());
		//Get And Set are not applicable
		System.out.println("Setting element at Index 1 S2: " + S2);
		

	}

}
