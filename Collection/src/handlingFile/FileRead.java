package handlingFile;

import java.io.*;

public class FileRead {

        public static void main(String[] args) throws IOException {
            File f1 =new File("C:\\Users\\sneha\\OneDrive\\Desktop\\Java\\read.txt");
            if(f1.exists())
            {
                BufferedReader  bufferedReader =new BufferedReader(new FileReader(f1));//it is a class to read a file
                String line=null;
                while((line=bufferedReader.readLine())!=null)
                {
                    System.out.println(line);//reading a file using read method
                }

            }


        }
    }

