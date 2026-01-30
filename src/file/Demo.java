package file;

import java.io.File;
import java.io.IOException;

/**
 * boolean  createNewFile() - it is used to create a new file.
 *  boolean  mkdir() - It is used to create a new empty directory.
 *  String [] list() - Read content from the given path.
 *  boolean  delete() - It is used to delete the file or directory.
 */

public class Demo {

    public static void main(String[] args) throws IOException{

        File f = new File("data.txt");

        Boolean t = f.delete();

        System.out.println(t);

    }
}
