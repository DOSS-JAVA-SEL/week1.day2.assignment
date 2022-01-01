package week2day2;

public class Intersection {

	public static void main(String[] args) {
		int[] a = { 10, 30, 50, 70, 90};
		int[] b = {20,10,60,80,30};
		int count= 0;
		
		for(int i=0;i<=a.length-1;i++) {
			 count = 0;
			for(int j = 0;j<=b.length-1;j++) {
				if(a[i] == b[j]) {
					count++;
					System.out.println("The Intersection nos were:"+" " +a[i]);
				}
				
			}
			
		}

	}

}
