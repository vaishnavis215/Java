
import java.util.ArrayList;
import java.util.Collections;

 class ArrayListDemo2{

    public static void main(String[] args) {
        ArrayList l1=new ArrayList<>();

        l1.add(14540);
        l1.add(250);
        l1.add(3440);
        l1.add(50);
        System.out.println(l1);

        Collections.sort(l1);// used to sort the array elements
        System.out.println("Element at l1.get(2):"+l1.get(2));//it allow to retrive element from arraylist

        System.out.println("Sorted list:"+l1);


        ArrayList l2=new ArrayList<>();
        l2.add("Radha");
        l2.add("Veera");
        l2.add("Eshan");
        l2.add("Eshika");

        System.out.println("\nOriginal List:"+l2);
        Collections.sort(l2);
        System.out.println("Sorted List:"+l2);

        l2.remove("Veera");// used to remove array element from the array list

        System.out.println("\nAfter remove method:"+l2);

        l1.addAll(l2);

        System.out.println("\nAfter AddAll:"+l1);

        l1.removeAll(l2);// used to remove all new added elements

        System.out.println("After RemoveAll l2 elements: "+l1);


        System.out.println("\nIndexOf Method, index of 50:"+l1.indexOf(50));// used to find the index of arraylist elements 

        System.out.println("\ncontains Method, Radha name is available in l2:"+l2.contains("Radha"));//used to check is element is available in collection or not and give boolean value in answer

        l2.clear();//used to delete all elements in our collection
        System.out.println("\nClear Method, on l2"+l2);

        //isEmpty(),lastindexof(),toArray(),subList(),size()
}
 }