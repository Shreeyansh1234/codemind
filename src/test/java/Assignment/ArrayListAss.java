package Assignment;
import java.util.*;

public class ArrayListAss {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("List: " + list);
		System.out.println("******Iterating ArrayList using Iterator*******");
		Iterator<Integer> it=list.iterator();	//Iterator it=list.ierator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("******Iterating ArrayList using For-Each Loop*******");
		for(Integer i:list) {
			System.out.println(i);
		}
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(4);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		
		System.out.println("List1: " + list1);
		
		list1.addAll(list);
		System.out.println("List1 After Adding List Elements: " + list1);//Adds elements at end
		list1.remove(4);//It is used to remove the element present at the specified position in the list.
		System.out.println("List1 After removing 4th Elements: " + list1);
		list1.removeAll(list);
		System.out.println("List1 After removing List Elements: " + list1);
		list1.clear();
		System.out.println("List1 After Clearing Elements: " + list1);
		System.out.println("********Creating new List*********");
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		System.out.println("List2: " + list2);
		System.out.println("Size of arrayList2= " + list2.size());
		System.out.println("Checking wether the list2 contains specified element or not:  " + list2.contains(10));
		System.out.println("Checking wether the list2 contains specified element or not:  " + list2.contains(100));
		System.out.println("Is List2 Empty: " + list2.isEmpty());
		System.out.println("Is List1:Empty " + list1.isEmpty());
		System.out.println("Getting perticular Element:  " + list2.get(0));
		list2.set(1,200);
		System.out.println("Setting element at Index 1 List2: " + list2);
		
		
	}

}
