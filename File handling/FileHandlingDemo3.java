/*
File Handling:
various operations on file
1.create file
2.open file
3.read and write data to file
4.close file
5.append data to the file

file handling operations java supports:
1.create a file
-stream classes
-writes classes
-file class
2.get file information
-getName():get the name of the file 
-getAbsolutePath:get the path
-canRead():do we have permission for reading
-canWrite():permission for write 
-length of file
3.write a data to the file

4.read data from a file
5.delete file
-delete()
*/

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo3 {

    public static void main(String[] args) {

        try {
            File f1=new File("C:\\JAVA\\File handling\\files sample\\createFile.txt");
            File f2=new File("C:\\JAVA\\File handling\\files sample\\createFile2.txt");

            if(f2.createNewFile()){
                System.out.println("File "+f2.getName()+" is created Successfully..");
            }
            else{
                System.out.println("File is Already Exists..");
            }
             if(f2.delete()){
                System.out.println("File "+f2.getName()+" is deleted Successfully..");
            }
            else{
                System.out.println("Error occuring during deletion..");
            }
            System.out.println("Path of file:"+f1.getAbsolutePath());
            System.out.println("Do we have permission to read:"+f1.canRead());
            System.out.println("Do we have permission to write:"+f1.canWrite());
            System.out.println("Length of file:"+f1.length());
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    
    }

