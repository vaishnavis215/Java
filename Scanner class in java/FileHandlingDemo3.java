/*
File Handling:
various operations on file
1.create file
2.open file
3.read and write data to file
4.close file
5.append data to the file


*/

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo3 {

    public static void main(String[] args) {

        try {
            File f1=new File("C:\\JAVA\\Scanner class in java\\files\\createFile.txt");
            if(f1.createNewFile()){
                System.out.println("File"+f1.getName()+"is created Successfully..");
            }
            else{
                System.out.println("File is Already Exists..");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    
    }

