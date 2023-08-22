
public class CountingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=1234,digit=0,count=0;
       while(n>0){
    	   digit=n%10;
    	   count++;
    	   n=n/10;
       }
       System.out.println("count-->"+count);
	}

}
