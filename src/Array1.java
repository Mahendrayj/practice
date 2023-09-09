import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Take the user Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		//Decleration of array and creation of array
		int[] arr=new int[size];
		System.out.println("Enter the data ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();//10*(i+1)
		    }
			System.out.println("Data with in Array");
		    for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		 }
		    sc.close();
		}
	}


