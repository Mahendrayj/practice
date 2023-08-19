import java.util.Scanner;

public class timespeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time to Journey");
        double time=sc.nextDouble();
        double speed=sc.nextDouble();
        double journeyCal=journeyCalcu(time,speed);
        
        System.out.println("the distance of traveld= "+journeyCal);
        sc.close();
        }

	public static double journeyCalcu(double time, double speed) {
		// TODO Auto-generated method stub
		double distantance=time*speed;
		return distantance;
	}

}
