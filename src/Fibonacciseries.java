import java.util.Scanner;

public class Fibonacciseries {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the num of terms");
    	   int terms=sc.nextInt();
    	   System.out.println("Fibnoacciseris");
    	   printfibonacciseris(terms);
    	   sc.close();
       }

	public static void printfibonacciseris(int terms) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
	for(int i=0;i<terms;i++) {
		System.out.println(first+" ");
		int next=first+second;
		first=second;
		second=next;
	}
	}
}
