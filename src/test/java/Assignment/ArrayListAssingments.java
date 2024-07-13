package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;


public class ArrayListAssingments {

	public static void main(String[] args) {
		System.out.println("*****ArrayList Example*****");
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ganga");
		al.add("Yamuna");
		al.add("Krishna");
		al.add("Saraswati");
		al.add("Ganga");
		al.add("Ganga");
		int c=0;
		for(String i:al) {
		if(i.equals("Ganga")) {
			c=c+1;			
		}
				}
		System.out.println("Ganga in list occurse "+c+" time");
		System.out.println();
		System.out.println("******LinkedList Example******");
		LinkedList<Integer> all=new LinkedList<Integer>();
		all.add(10);
		all.add(20);
		all.add(40);
		all.add(50);
		all.add(70);
		all.add(80);
		ListIterator<Integer> lt=all.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}	
		System.out.println();
		System.out.println("***** HashMap Example******");
		HashMap<String,Integer> h= new HashMap<String,Integer>();
		h.put("India",1);
		h.put("Nepal", 2);
		h.put("USA",1);
		h.put("CAN",4);
		System.out.println(h);
		System.out.println("Iterating Hashmap...");  
		for(Map.Entry<String,Integer> m : h.entrySet()){    
		  //System.out.println(m.getKey()+" "+m.getValue());  
		  if(m.getValue()==1) {
			  System.out.println(m.getKey());
		  }
		   }  
	}

}
