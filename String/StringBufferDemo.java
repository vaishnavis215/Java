/*
=>immutuable string:
String s1 = new String("Hello");

=>mutuable String 
String Buffer/stringBuilder:
-Three way to create string buffer
1)StringBuffer sb = new StringBuffer("Hello");
-fixed size of string length

2)StringBuffer sb3 = new StringBuffer(10);
-it will create a string with specified capacity

3)StringBuffer sb2 = new StringBuffer();//default capacity 

 */
class StringBufferDemo {

    public static void main(String[] args) {
        String s1 = new String("Hello"); //immutable string

        s1.concat("Radha");
        System.out.println(s1);//hello

        StringBuffer sb = new StringBuffer("Hello");//mutable string
        sb.append(" Radha");

        System.out.println(sb);//hello radha

        //default size capacity  of string
        StringBuffer sb2 = new StringBuffer();//default capacity 

        System.out.println(sb2.capacity());

        sb2.append("Welcome to fortune cloud pimpari");
        //System.out.println(sb2.length());
        System.out.println(sb2.capacity());//(previouscapacity+1)*2

        //integer capacity
        StringBuffer sb3 = new StringBuffer(10);

        sb3.append("welcome to pune,pcmc");
        System.out.println(sb3.capacity());//o/t:(previouscapacity+1)*2=22

    }
}
