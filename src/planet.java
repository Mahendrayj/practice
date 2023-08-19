import java.util.Scanner;

public class planet {
          public static void main(String[] args) {
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("Enter the radius");
        	  double r=sc.nextDouble();
        	  double pie=3.142;
        	  double area=planet(r,pie);
        	  System.out.println("Area="+area);
			
		}

		private static double planet(double r, double pie) {
			// TODO Auto-generated method stub
			
			return Math.pow(4*r*pie, 2);
		}
}
