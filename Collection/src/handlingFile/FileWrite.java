package handlingFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        File f1 =  new File("C:\\New folder\\FileHandling.docx");
        System.out.println(f1.exists());//to check file is exit in F1 object
        FileWriter fw = new FileWriter(f1);//it is a class to write in a file
        fw.write("sneha");//writing using write method

        FileReader fr =new FileReader(f1);
        System.out.println(fr.read());



    }
}
