
import java.io.File;

/*
1.write & Read (executable)
2.Read permission 
3.write permission

file f=new file(path)
f.setReadable(false);//permission denied
f.setReadable(true);//permission granted
f.setExecuteable(false);


*/
class ReadTestDemo{
    public static void main(String[] args) {
        try {
            File f1=new File("C:\\JAVA\\File handling\\files sample\\ReadFile2.txt");
            
            //    if(f1.createNewFile()){
            //     System.out.println("File "+f1.getName()+" is created Successfully..");
            // }
            // else{
            //     System.out.println("File is Already Exists..");
            // }
            // System.out.println("Is it Executable:"+f1.canExecute());
            // System.out.println("Do we have permission to read:"+f1.canRead());
            // System.out.println("Do we have permission to write:"+f1.canWrite());

           f1.setExecutable(true);
           f1.setReadable(false);
           f1.setWritable(true);

            System.out.println("Is it Executable:"+f1.canExecute());
            System.out.println("Do we have permission to read:"+f1.canRead());
            System.out.println("Do we have permission to write:"+f1.canWrite());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}