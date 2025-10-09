//1. Write a Java program on traffic signal system when red show stop, yellow show ready, Green show go

class TrafficSignal{

               public static void main(String args[]){
              
               String signal="green";

               if(signal=="yello"){
                 System.out.println("Ready to go..");
                }
               else if(signal=="red"){
                 System.out.println("Stop..");
                }
               else if(signal=="green"){
                 System.out.println("Now,you can go..");
                }
               else{
                System.out.println("Traffic..");
              }

             }
           }