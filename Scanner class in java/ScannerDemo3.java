/*
The Method Start with next() are use to take input
next(): take input irrespective of datatype (int string float also as tokan)
e.g 56 is trainer
o/p:56
nextLine(): allow to take string input as a sentances
e.g i love india
o/p:i love india

nextInt():Integer input

nextFloat():float Input

hasNext():these use to validate and return boolean value

hasNextToken():use to varify next token is available or not

hasNextLine():use to verify next line is available or not

hasNextInt():use to verify next int is avalilable or not

hasNextFloat():use to verify next float is avalaible or not

Explore methods of scanner class with example? 

reader and writer 
streams(input/output)
console/command line arguments/scanner class
*/
import java.util.Scanner;

public class ScannerDemo3 {

    public static void main(String[] args) {

         Scanner sc2=new Scanner("My name: vaishnavi suryawanshi");
         
            boolean hasNextToken=sc2.hasNext();

            System.out.println("Does My String Contains Next Tokens?:"+hasNextToken);
         }
    }

