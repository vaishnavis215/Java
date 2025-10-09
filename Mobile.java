class Mobile{
     String brand;
     double price;
     String color;
    void MobileDetails(){
        System.out.println("Brand: " + brand  + ", Price : " + price+ " rs, Color : " + color);
    }
    void powerOn(){ 
      System.out.println(brand + " is now ON.");
   }
   void powerOFF(){  
      System.out.println(brand+ " is now OFF.");
   }
  void SendMassage(){
     System.out.println("Send massage to someone...");
   }
  public static void main(String args[])
  {
    Mobile Mo1=new Mobile();
    Mo1.brand="i-phone 17";
    Mo1.price=150000.00;
    Mo1.color="Black";
    Mo1.MobileDetails();
    Mo1.powerOn();
    Mo1.SendMassage();
   }
}