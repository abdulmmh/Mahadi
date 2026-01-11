
package Jan11.io_example;

import java.io.*;


public class DeleteFile {
    public static void main(String[] args) {
        try {
              File newFile = new File("C:\\Users\\Abdul Mannan.DESKTOP-EJ6PFLI\\Desktop\\IO\\hi.text");
              if (newFile.delete()) {
                  System.out.println("Deleted successfully");
            } else {
                  System.out.println("Delete failed");
            }
        } catch (Exception e) {
        }
        
    }
}
