package file.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        FileInputStream fs = new FileInputStream("C:\\Users\\Sk\\IdeaProjects\\FileHandling\\src\\file\\propertiesfile\\application.properties");

        p.load(fs);

        String s = p.getProperty("db.password");
        String g = p.getProperty("db.username");
        String d = p.getProperty("db.url");

        System.out.println(s);
        System.out.println(g);
        System.out.println(d);
    }
}
