import java.util.Scanner;

public class secratemessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char a=sc.next().charAt(0); 
		int unico=unicode(a);
		System.out.println("Unicode="+unico);
		sc.close();

	}

	public static int unicode(char a) {
		// TODO Auto-generated method stub
		int b=a;
		return b;
	}

	
	}


