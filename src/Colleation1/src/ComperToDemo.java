import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class ComperToDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StudentDemo s=new StudentDemo(1,"Amit",80);
        StudentDemo s1=new StudentDemo(2,"Rama",80);
        StudentDemo s2=new StudentDemo(3,"Govinda",80);
        StudentDemo s3=new StudentDemo(4,"Krishna",80);

        ArrayList<StudentDemo> list=new ArrayList<StudentDemo>();
         list.add(s);
         list.add(s1);
         list.add(s2);
         list.add(s3);
         
       Collections.sort(list);
       //System.out.println(list);
	}

}
