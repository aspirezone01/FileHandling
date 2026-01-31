package serialiazation;

import java.io.*;

public class Student implements Serializable {

    int id;
    String name;
    int age;
    transient String password;

    public static void main(String[] args) throws Exception {

        Student s = new Student();
        s.id = 101;
        s.name = "Kaju";
        s.age = 22;
        s.password = "rampur12";

        System.out.println("Serialization started");
        FileOutputStream fis = new FileOutputStream("transient_student.txt");
        ObjectOutputStream os = new ObjectOutputStream(fis);

        System.out.println("serialization ended");
        os.writeObject(s);

        os.flush();
        os.close();
    }

}
