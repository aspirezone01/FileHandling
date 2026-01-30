package file;

import java.io.IOException;
import java.io.PrintWriter;

public class Demo4 {

    public static void main(String[] args) throws IOException {

        PrintWriter pr = new PrintWriter("FileWriter.txt");

        pr.print("Printing in Console");

        pr.flush();
    }
}
