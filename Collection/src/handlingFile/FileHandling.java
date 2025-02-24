package handlingFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

        public static void main(String[] args) throws IOException {
            File f1 =new File(" C:\\Users\\sneha\\OneDrive\\Desktop\\Java\\Animal.java");
             f1.exists();
            FileReader fr =new FileReader(f1);
            System.out.println(fr.read());

        }
    }

