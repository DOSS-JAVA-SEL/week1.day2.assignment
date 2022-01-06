package week1day2;

public class Primeno {

	public static void main(String[] args) {
		
		int a = 13;
		boolean b = false;
		for(int i=2;i<(a/2);i++) {
			
			 int c=a%i;
			 if(c==0) {
					
				b= true;
				break;
					}
				}
		System.out.println("The given no is"+" "+a);
if(b==false) {
	
		System.out.println("The no is  prime no");
	}
else {
	System.out.println("The no is not a prime no");
}
}
}
