package com.codemind.b11;

// Defining the Printable interface with a single method
interface Printable {
    void print();
}

// Defining the Showable interface with a single method
interface Showable {
    void show();
}

// Class InterfaceEx implements both Printable and Showable interfaces
class InterfaceEx implements Printable, Showable {
    // Implementing the print method from Printable interface
    public void print() {
        System.out.println("Hello");
    }

    // Implementing the show method from Showable interface
    public void show() {
        System.out.println("Welcome");
    }

    // Main method to test the implementations
    public static void main(String args[]) {
        // Creating an instance of InterfaceEx
        InterfaceEx obj = new InterfaceEx();
        
        // Calling the print method
        obj.print();
        
        // Calling the show method
        obj.show();
    }
}
 