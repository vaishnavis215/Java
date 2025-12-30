
import java.util.ArrayList;
import java.util.Iterator;
//reatinAll(),clone(),ensureCapacity(),10 exapmles for practice on arraylist from simple to hard level with solution
class PersonInfo{
    int id;
    String name;
    int age;
    String city;


    public PersonInfo( int id,String name,int age,String city ) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.city=city;

    }
}    
class TestPersonList{
    public static void main(String[] args) {
        PersonInfo p1=new PersonInfo(101, "Radha", 23, "Pune");
        PersonInfo p2=new PersonInfo(102, "Riya", 22, "Pune");
        PersonInfo p3=new PersonInfo(103, "Neha", 24,"Pune");
        PersonInfo p4=new PersonInfo(104, "Nea", 25,"Mumbai");

        ArrayList<PersonInfo> l1=new ArrayList<PersonInfo>();
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        l1.add(p4);

        Iterator itr=l1.iterator();

        while(itr.hasNext()){
            PersonInfo p=(PersonInfo)itr.next();
            System.out.println("\nId:"+p.id+"\nName:"+p.name+"\nAge:"+p.age+"\nCity:"+p.city);
        }
    }

}
    
