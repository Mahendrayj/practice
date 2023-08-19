import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the   number");
		int num = sc.nextInt();
		if(num>=0) {
			if(num%2==0) {
		EvenNumber(num);}
		oddNmber(num);
		}else System.out.println(" number is invaild");
        sc.close();
	}

	public static void oddNmber(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.out.println("number is odd");
		for (int i = 0; i <= num; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("sum= " + sum);
	}
	

	public static void EvenNumber(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.out.println("number is odd");
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("sum= " + sum);
	}

}
