
import java.util.ArrayList;
import java.util.Iterator;



public class Demo {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();//different types of data add

        l1.add(101);
        l1.add("Radha");
        l1.add("Female");
        l1.add("Pune");

        ArrayList l2=new ArrayList<>();
        l2.add("Krushna");
        l2.add("Dwaraka");
        l2.add(2000);

        l1.addAll(l2);//Adding multiple data from another collection
        l1.add(1, 1001);
        System.out.println(l1);
        Iterator itr=l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }

        l1.set(2, "Vaishnavi");//replace element at specific location
                System.out.println(l1);

    }
    
}
