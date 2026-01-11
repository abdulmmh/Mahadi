
package Jan09.IO;

import java.io.File;
import java.io.IOException;


public class CreateFileExample {
    public static void main(String[] args) {
        
        try {
            File file = new File("G:\\My Drive\\JAVA_CW\\IO_File\\a.text");
            if (file.createNewFile()) {
                System.out.println("File is created.");
            } else {
                System.out.println("File already created.");
            }
        }
        catch(IOException io){
            io.printStackTrace();
        }
    }
}
