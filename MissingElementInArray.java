package week1day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 7, 6, 8} ;
		int count=1;
		Arrays.sort(a);
		System.out.println("The missing no is:");
		for(int i=0;i<a.length-1;i++) {
         if(a[i]!= i+count) {
        	
	     System.out.println(i+count);
	      break;
}
	}

}
}
