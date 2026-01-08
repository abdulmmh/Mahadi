
package IO;

import java.io.File;


public class RenameFileExample {
    public static void main(String[] args) {
        File oldFile = new File("G:\\My Drive\\JAVA_CW\\IO_File\\a.text");
        File newFile = new File("G://My Drive//JAVA_CW//IO_File//ab.text");
        if (oldFile.renameTo(newFile)) {
            System.out.println("Rename succesfull.");
        } else {
            System.out.println("Rename failed");
        }
    }
}
