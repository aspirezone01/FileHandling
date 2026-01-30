package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {

    public static void main(String[] args) throws IOException {

//        FileReader r = new FileReader("FileWriter.txt");
//
//        int ch ;
//        while((ch = r.read()) != -1 ){
//            System.out.print((char) ch);
//        }

//        FileReader fr = new FileReader("FileWriter.txt");
//        BufferedReader br = new BufferedReader(fr);
        BufferedReader br = new BufferedReader(new FileReader("FileWriter.txt"));


        String s;
        while((s = br.readLine()) != null){
            System.out.println(s);
        }
     //   System.out.println(s);

    }
}
