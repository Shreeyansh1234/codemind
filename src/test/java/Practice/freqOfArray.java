package Practice;

import java.util.HashSet;
import java.util.Set;

public class freqOfArray {

    public static void main(String[] args) {
        // Java Program to find the frequency of each element in the array
        int arr[] = { 1, 2, 1, 1, 2, 2, 2, 2, 9 };

        // Use a Set to keep track of elements that have been processed
        Set<Integer> processed = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            // Check if the element has already been processed
            if (!processed.contains(element)) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == element) {
                        count++;
                    }
                }
                System.out.println("Element " + element + " occurs " + count + " times");
                // Add the element to the set of processed elements
                processed.add(element);
            }
        }
    }
}

/* package Practice;

import java.util.Set;

public class freqOfArray {

	public static void main(String[] args) {
		// Java Program to find the frequency of each element in the array
		int arr[] = { 1, 2,1,1, 2, 2,2,2,9 };
		
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				c+=1;
			
			}
			}System.out.println(c);
		}
	}

} */
