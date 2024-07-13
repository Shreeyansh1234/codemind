package Assignment;
class Class1{
	int i=2;
	String str;
	
	Class1(int i,String str) {
		this.i=i;
		 str=str; //Gives Default value ie null if we don't use this keyword
		System.out.println(i+" "+str);
		System.out.println("*************");
	}
	void show(int i,String str) {
		System.out.println(i+" "+str);//new values are already passed thats why it takes that value
		System.out.println("*************");
	}
	
	void display() {
		System.out.println(i+" "+str);//values are not passed thats why it takes constructor value
		System.out.println("*************");
	}
}

public class ThisKeywordAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 c= new Class1(3,"Ram");
		c.show(5,"tina");
		c.display();

	}

}
