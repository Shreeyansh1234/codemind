package Assignment;
class Parent{
	String L="Parent Class";
	void care() {
		System.out.println("Parent Class Care Method");
	}
	
	Parent(){
		System.out.println("Parent Class Constructor");		
	}
}

class Child extends Parent{
	String L="Child class";
	void care() {
		System.out.println("Child Class Care Method");
		super.care();//Without super it gives StackOverflowError
		System.out.println("*************");
	}
	void show() {
		System.out.println(L);
		System.out.println(super.L);
	}
	Child(){
		super();//Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
		System.out.println("Child Class Constructor");
		
	}
}

public class SuperAssignment {

	public static void main(String[] args) {
		Child n=new Child();
		n.show();
		n.care();
	
	}

}
