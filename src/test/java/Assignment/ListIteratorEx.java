package Assignment;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorEx {

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(70);
		al.add(80);
		ListIterator<Integer> lt=al.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}	
	}
}
