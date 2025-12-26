/*

*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class CreateZipFileDemo{

    public static void main(String[] args) {

        String sourceFile="C:\\JAVA\\File handling\\files sample\\createFile.txt";
        String zipFile="C:\\JAVA\\File handling\\files sample\\createZipFile.zip";

        try {
          FileOutputStream fos=new FileOutputStream(zipFile);
          ZipOutputStream zos=new ZipOutputStream(fos);

          File fileToZip=new  File(sourceFile);
          FileInputStream fis=new FileInputStream(fileToZip);

          ZipEntry zipentry=new ZipEntry(fileToZip.getName());
          zos.putNextEntry(zipentry);

          byte[] bytes=new byte[1024];
          int length;
          while((length=fis.read(bytes)) >= 0){
            zos.write( bytes,0,length);
          }

          zos.close();
          fis.close();
          fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}