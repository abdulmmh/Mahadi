
package Jan11.io_example;

import java.io.*;


public class ReadFile {
    public static void main(String[] args) {
        try {
          FileReader fr = new FileReader("C:\\Users\\Abdul Mannan.DESKTOP-EJ6PFLI\\Desktop\\IO\\hi.text");
          BufferedReader bfr = new BufferedReader(fr);
          String scurrentLine;
          
            while ((scurrentLine = bfr.readLine()) != null) {                
                System.out.println(scurrentLine);
            }
           
        } catch (IOException e) {
        }
    }
}
