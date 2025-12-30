import java.util.*;
class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); //generic: creating a collection with specific data type
        list.add("Java");
        list.add("Python");
        list.add("Java"); // duplicate allowed
        System.out.println(list);
       Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
