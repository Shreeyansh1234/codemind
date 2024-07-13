package Practice;

public class ArrayProgramEx {

	public static void main(String[] args) {
		//Java Program to copy all elements of one array into another array
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = arr.clone();

		for (int i : arr2) {
			System.out.print(i);
		}
	}

}

/*
public class ArrayCopy {
public static void main(String[] args) {
    // Initialize the original array
    int[] originalArray = {1, 2, 3, 4, 5};
    
    // Create a new array of the same length
    int[] newArray = new int[originalArray.length];
    
    // Copy elements from originalArray to newArray
    for (int i = 0; i < originalArray.length; i++) {
        newArray[i] = originalArray[i];
    }
    
    // Print the new array to verify the copy
    System.out.print("New array: ");
    for (int i : newArray) {
        System.out.print(i + " ");
    }
}
} */