import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp");
		double temp=sc.nextDouble();
		double celsius=FahrenheitToCelsius(temp);
		System.out.println("the celsius temp= "+celsius);
		sc.close();
	}

	public static double FahrenheitToCelsius(double temp) {
		// TODO Auto-generated method stub
		double c=temp*5/9;
		return c;
	}

}
