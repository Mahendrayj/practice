import java.util.Scanner;

public class SwapingTwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the two numbers");
         String a=sc.nextLine();
         String b=sc.nextLine();
         System.out.println("Before swping");
         System.out.println(a+" "+b);
         
         String temp=a;
         a=b;
         b=temp;
         
         System.out.println("after swaping");
         System.out.println(a+" "+b);
         sc.close();
	}

}
