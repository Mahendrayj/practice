import java.util.Scanner;

public class ifdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the age= ");
         int age=sc.nextInt();
         if(age>=18&&age<=100) {
        	 System.out.println("Candidate is eligible for voteing");
         }
         else {
         System.out.println("Candidate is not eligible");
         sc.close();
         }
	}

}
