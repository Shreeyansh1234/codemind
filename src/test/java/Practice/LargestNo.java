package Practice;

public class LargestNo {

	public static void main(String[] args){
	int arr[] = { 1, 3, 2, 5, 4 };
		int max = la(arr);
		/*for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];

			}

		} */
		System.out.println(max);
		
	}
public static int la(int arr[]) {
	int max=arr[0];
	
	for (int num:arr) {

		if (num > max) {
			max = num;
		}
	}return max;
	
	}}

	

