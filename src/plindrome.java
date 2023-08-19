import java.util.Scanner;

public class plindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int number=sc.nextInt();
         if(ispalindrome(number)) {
        	 System.out.println("It is the Palindrome");
         }
         else {
        	 System.out.println("Not palindrome");
         }
	}

	public static boolean ispalindrome(int number) {
		// TODO Auto-generated method stub
		int Originalno=number;
		int reverseno=0;
	while(number>0) {
		int lastdigit=number%10;
		reverseno=reverseno*10+lastdigit;
		number /=10;
	}
		return Originalno==reverseno;
	}

}
