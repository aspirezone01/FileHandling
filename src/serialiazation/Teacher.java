package serialiazation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Teacher implements Serializable {

    public static void main(String[] args) throws Exception {

        FileInputStream fi = new FileInputStream("C:\\Users\\Sk\\IdeaProjects\\FileHandling\\UID_student.txt");

        ObjectInputStream ois = new ObjectInputStream(fi);

        Object o = ois.readObject();

        Student s1 = (Student) o;

        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.password);

    }
}
