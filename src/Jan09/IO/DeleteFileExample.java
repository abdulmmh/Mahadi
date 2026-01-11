
package Jan09.IO;

import java.io.File;


public class DeleteFileExample {
    public static void main(String[] args) {
        try {
            File newFile = new File("G:\\My Drive\\JAVA_CW\\IO_File//ab.text");
             if (newFile.delete()) {
            System.out.println(newFile.getName()+" Delete succesfull.");
            } else {
            System.out.println("Delete failed.");
            }
        } catch (Exception e) {
            
        }
        
    }
}
