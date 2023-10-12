import java.util.Scanner;

public class SelectionSorting {

	private static int minIndex;

	public static void main(String[] args) {
		// Take the user input from the user
		Scanner sc=new Scanner(System.in);
		//Declretion and Creation of Array
		System.out.println("Enter the size of Array");
		int[] arr=new int[sc.nextInt()];
		//InitialZation of Array
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Data for the Array "+(i+1));
			arr[i]=sc.nextInt();
		 
		}
		System.out.println("Array Before Sorted");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++) {
			int miIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}  
			if(minIndex!=i) {
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
				
			}
		
		}
		//Trvarsing of Array
		
		System.out.println("Array After Sorted");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}

	}

}
