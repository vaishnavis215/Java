
class Address {
    String city;
    int pincode;
    String state;

    void DisplayAddress(){
        System.out.println("Good Morning  "+city+  "...\nHere is my  pincode "+pincode+  "\nAnd \n" +state+  " is my state");
    }

    public static void main(String args[]) {
        Address A1= new Address();      
        A1.city = "Pune";        
        A1.pincode=411018;
        A1.state="Maharashtra";
        A1.DisplayAddress();
    }
}
