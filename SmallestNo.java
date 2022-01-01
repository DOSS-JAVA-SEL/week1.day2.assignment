package week2day2;

import java.util.Arrays;

public class SmallestNo {

	public static void main(String[] args) {
		int[] a = {23, 45, 67, 32, 89, 22};
		Arrays.sort(a);
		
		System.out.println(a[a.length-6]+" "+"is the smallest among the given nos");
	}
	

}
