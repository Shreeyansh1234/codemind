package Assignment;
class apple{
	apple(){
		System.out.println("Apple Class Constructor");
	}
	apple(int s){
		this();
		System.out.println("Second constructor class");
	}
	void show(apple obj) {
		
		System.out.println("*******Show Method***********");
	}
	void display() {
		show(this);
		System.out.println("********Display Method**********");
		//this.show();
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		apple a= new apple();
		//a.show();
		a.display();
		
	}

}
