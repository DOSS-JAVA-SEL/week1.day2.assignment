package week2day2;

import java.util.Arrays;

public class DuplicateNo {

	public static void main(String[] args) {
		int[] a = {10, 20, 10, 50, 25, 50};
		
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++){
			 
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("The Duplicated Nos were:"+" "+a[i]+" ");
					
				}
				
				}
			}
			
				
		

	}

}
