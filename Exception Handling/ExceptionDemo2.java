/*
=>Exception: 
-event which occurs in java program and it interrupt normal flow of execution of your program
-


=>Exception Handling:
-is the way to manage checked and unchecked exception that comes in java program
-try{
    //We always write exception prone code
}
catch(Exception(Specific exception type/general exception type) e){


}
 */
class ExceptionDemo2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println("Welcome to exception handling...");
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code of my program..");
    }
}
