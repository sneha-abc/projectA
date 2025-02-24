package handlingFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        File f1 =  new File(" C:\\New folder\\FileHandling.txt");
        System.out.println(f1.exists());
        FileWriter fw = new FileWriter(f1);
        fw.write("sneha");

        FileReader fr =new FileReader(f1);
        System.out.println(fr.read());



    }
}
