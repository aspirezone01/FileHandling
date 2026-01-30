package file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args) throws IOException {

        FileWriter f = new FileWriter("Filewriter.txt");

        f.write("This is a file writer concept");
        f.flush();

        System.out.println();

    }
}
