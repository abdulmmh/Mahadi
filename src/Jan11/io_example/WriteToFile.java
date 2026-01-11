
package Jan11.io_example;

import java.io.*;



public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("C:\\Users\\Abdul Mannan.DESKTOP-EJ6PFLI\\Desktop\\IO\\hi.text", true);
            BufferedWriter wrtf = new BufferedWriter(file);
            wrtf.write("Hello! I am learning java Progrmming.");
            wrtf.write("\nWelcome to programming Mahadi.");
            wrtf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
