/*
String Methods:
1.concat()-it allow you to concat two strings
-e.g s1="hello" s2="yash"
-s1.concat(s2);//System.out.println(s1.concat(s2)); 
o/p- Hello Yash

2.length():ity used to find out the length of the string
e.g- 
System.out.println("Length of String:" + s3.length());
o/t:Length of String:9

3.charAt(int):it will return character at specific index
-HelloYash -8 character 
System.out.println(s3.charAt(5));
o/t:Y

4.subString(start index,end index):It show the specific value that we want in
our string using substring.
-HelloYash -8 character 
system.out.println(substring(5,9))
o/t:Yash

5.equals():
-compare the data within two string 
-o/t- true(if both strings are equals) or false(if strings are not equal)
e.g s1="fct" s2="fct" s3="fctp"
system.out.println(s1.equals(s2));
o/t:true
system.out.println(s1.equals(s3));
o/t:false

6.toUpperCase():convert string into upper case
-e.g s1="abc"
system.out.println(s1.toUppercase());
o/t:ABC

7.toLowerCase():conver string into lower case
-e.g s1="ABC"
system.out.println(s1.toUppercase());
o/t:abc

8.join():method will join the group of string together as per specified separator
e.g:
good morning all (space)
have-a-nice-day(dash)
10:20:2025(colon)
s5 = String.join("_", "vaishnvi", "bhagawat", "Suryawamshi");
System.out.println("Join method:" + s5);
o/t:Join method:vaishnvi_bhagawat_Suryawamshi

9.contains(String):it will verify string input is a part of string or not
e.g- s1="awesome";
s1.contains(some);
o/t:true
s1.contains(helllo);
o/t:false

10.trim():simply it remove extra space from your string
string s2="    coding id   ";
system.out.println(s1+"awesome");

system.out.println(s1.trim()+"awesome");
-o/t:
    coding is    Awesome
coding is Awesome

11.replace(oldchar,newchar):
string s1="have a nice day";
system.out.println('a','i');
o/t: hive i nice diy
 */
class StringMethods {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "Yash";
        String s5;
        String s4 = new String("hello");
        System.out.println("concat method using standard method:" + s1.concat(s2));// standard method

        String s3 = s1 + s2; //concat using + operator

        System.out.println(s3);

        System.out.println("Length of String method:" + s3.length());

        System.out.println("Character At method:" + s3.charAt(5));

        System.out.println("Substring Method:" + s3.substring(5, 9));

        System.out.println(s3.substring(5));// starting index and it return data till the end of string

        System.out.println("Equals Method:" + s1.equals(s4));

        System.out.println("Equals Method:" + s1.equals(s2));

        System.out.println("UpperCase method:" + s1.toUpperCase());

        System.out.println("LowerCase method:" + s1.toLowerCase());

        s5 = String.join("_", "vaishnvi", "bhagawat", "Suryawamshi");
        System.out.println("Join method:" + s5);

        String s6 = "vaishnavi";
        System.out.println("String contains method:" + s6.contains("navi"));

        String s7 = "    coding is    ";
        System.out.println(s7 + "Awesome");
        System.out.println("trim method," + s7.trim() + " Awesome");

        String s8 = "have a nice day";
        System.out.println("replace method:" + s8.replace('a', 'i'));

    }
}
