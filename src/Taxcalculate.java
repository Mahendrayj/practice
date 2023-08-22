import java.util.Scanner;

public class Taxcalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        double purchaseAmount=sc.nextDouble();
        System.out.println("Enter the tax rate");
        double taxRate=sc.nextDouble();
        double taxcost=calculateTotalWithTax(purchaseAmount,taxRate);
        System.out.println("Titalcost including tax= "+taxcost);
        sc.close();
	}

	public static double calculateTotalWithTax(double purchaseAmount, double taxRate) {
		// TODO Auto-generated method stub
		double taxAmount=purchaseAmount*taxRate;
		double TotalCost=purchaseAmount+taxAmount;
		return TotalCost;
	}

}
