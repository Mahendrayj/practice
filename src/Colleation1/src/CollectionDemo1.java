import java.util.ArrayList;

public class CollectionDemo1 {



	private static final String Ram = null;

	public static void main(String[] args) {
      ArrayList list=new ArrayList();
      System.out.println("Size before : "+list.size());
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(11);
      list.add('m');
      list.add(12.5);
      System.out.println(list);
      System.out.println("Size after : "+list.size());
      String s1=Ram;
      String s2=Ram;
      System.out.println(s1==s2);
      //System.out.println(s1s2);
      
      
	}

}
  