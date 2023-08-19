import java.util.Scanner;

public class arrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]a=new int[10];
//		a[i]=sc.nextInt();
//		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=4;i++) {
		
			System.out.println("please enter the marks of the student"+i);
			a[i]=sc.nextInt();
		} 
		System.out.println("the marks of the students");
		for(int i=0;i<5;i++) {
			System.out.println(a[i] +" ");
		}
	}

}

