import java.util.Scanner;

public class hightconvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the person hight in inchas");
            double inchas=sc.nextDouble();
            System.out.println("hight in feets= "+inchaes(inchas));
	}

	public static double inchaes(double inchas) {
		// TODO Auto-generated method stub
		return inchas/12;
	}

}
