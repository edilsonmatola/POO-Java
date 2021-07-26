import java.io.*;
import java.util.*;

public class WriteToFileExample {

public static void main(String[] args) {
    
    try {

        String content = "This is the content to write into file Samuel";

        File file = new File("filename.txt");

        // if file doesnt exists, then create it
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content+"\n");
        bw.close();

        System.out.println("Done");

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}