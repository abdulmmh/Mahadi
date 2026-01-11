
package Jan11.io_example;

import java.io.*;

public class RenameFileExample {
    public static void main(String[] args) {
        try {
           File oldFile = new File("C:\\Users\\Abdul Mannan.DESKTOP-EJ6PFLI\\Desktop\\IO\\hello.text");
           File newFile = new File("C:\\Users\\Abdul Mannan.DESKTOP-EJ6PFLI\\Desktop\\IO\\hi.text");
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed succesfully.");
            } else {
                System.out.println("File renamed failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
