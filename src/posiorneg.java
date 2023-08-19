import java.util.Scanner;

public class posiorneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if(number>0)
           if (number%2==0){
        	System.out.println("number is even");
        }
        System.out.println();
	}

}
