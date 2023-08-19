import java.util.Scanner;

public class average {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of student");
		int sem1=sc.nextInt();
		int sem2=sc.nextInt();
		int sem3=sc.nextInt();
		int sem4=sc.nextInt();
		int sem5=sc.nextInt();
		int sem6=sc.nextInt();
		int sem7=sc.nextInt();
		int sem8=sc.nextInt();
		double avg=calcuAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		System.out.println("The average of overall sems is= "+avg);
		sc.close();
	}

	public static double calcuAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
		// TODO Auto-generated method stub
		double overallavg=(sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
		return overallavg;
	}
}
