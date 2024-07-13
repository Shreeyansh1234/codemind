package Practice;
import java.util.Arrays;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String git1="Learning git";
		String git2="Learning git commit";
		String git3="Created new git branch madhuriBranch commit";
		String s="dog";
		String s1="gor";
		char arr[]=s.toCharArray();
		char arr1[]=s1.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		if(Arrays.equals(arr, arr1)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("not Anagram");
		}

	}

}
