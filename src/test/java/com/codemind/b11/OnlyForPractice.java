package com.codemind.b11;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class ExceptionHanding {
	
	void show() throws FileNotFoundException {
		
		File f = new File("C://Users//Desktop//Codemind//abc.txt");
		
		
		FileInputStream fi = new FileInputStream(f);
		
	}
	
	}

public class OnlyForPractice {

	public static void main(String[] args) {
	ExceptionHanding e = new ExceptionHanding();
		
		try {
			e.show();
		} catch (FileNotFoundException e1) {
			System.out.println(e1);
			//e1.printStackTrace();
		}
				
	}

}
