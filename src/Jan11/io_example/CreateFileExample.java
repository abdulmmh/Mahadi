
package Jan11.io_example;

import java.io.*;



public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File newFile = new File("C:\\Users\\Abdul Mannan.DESKTOP-EJ6PFLI\\Desktop\\IO\\hello.text");
            if (newFile.createNewFile()) {
                System.out.println("File created successfully.");
            } else System.out.println("File creation failed.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
