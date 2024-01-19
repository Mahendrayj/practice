import java.util.ArrayList;

public class CollectionDemo2 {

	public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
      System.out.println("List 1 data= "+list);
      list.add(2,790);
      System.out.println("After Insertin="+list);
      System.out.println("List 1 data= "+list);
        ArrayList list2=new ArrayList();
        list2.add("one");
        list2.add("two");
        list2.add("Three");
        list2.add("four");
        list2.add("Five");
       System.out.println("List 2 data="+list2);
       System.out.println();
       list.addAll(list2);
       System.out.println("After the adding the data for list2 to list1");
       System.out.println(list);
       list.set(3, 100);
       System.out.println("Afetr replacing Element at specified index");
       System.out.println(list);

	}

}
