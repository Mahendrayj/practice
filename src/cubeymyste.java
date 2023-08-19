import java.util.Scanner;

public class cubeymyste {
         public static void main(String[] args) {
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("Enter the numbers to cube");
        	 int a=sc.nextInt();
        	 cube(a);
        	 sc.close();
        	 
         }

		public static void cube(int a) {
			// TODO Auto-generated method stub
		   	System.out.println("cube= "+a*a*a);
		}
}
