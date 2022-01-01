package week2day2;

public class Palindrome {

	public static void main(String[] args) {
		int a = 5445;
		int ori = 5445;
		int temp = 0;
for(int i=4;i>0;i--) {
	int rem = a%10;
	int quo = a/10;
	a = quo;
	temp = (temp*10) + rem;
	}
System.out.println("The given no is"+" "+temp);
if(ori==temp) {
	System.out.println("The Given No"+" "+temp+" is Palindrome");
}
else {
	System.out.println("The Given No"+" "+temp+" is not Palindrome");
}
	}

}
