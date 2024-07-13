package Assignment;

import java.util.HashMap;
import java.util.Map;
public class HashMapEx {

	public static void main(String[] args) {
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
