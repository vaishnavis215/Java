// create class and object for movie,mobile,room,watch,book,account,person,bike,student,shape,country,address,laptop

class Movie
{
    String Title;
    int Duration;
    String Language;

   void play()
  {  
      System.out.println("Playing...  "+Title);
  }
  void stop()
 {
     System.out.println("Stopped Playing "+Title+"..");
  }
 void displayDetails() {
        System.out.println("Title: " + Title  + ", Duration: " + Duration + " mins, Language: " + Language);
    }
public static void main(String args[])
{ 
    Movie M1=new Movie();
    M1.Title="M.S.Dhoni";
    M1.Duration=180 ;
    M1.Language="Hindi";
    M1.displayDetails();
    M1.play();
    M1.stop();
}
}