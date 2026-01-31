package serialiazation;

import java.io.*;

public class CustomUID implements Serializable {

    private static final long SerialVersionUID = 120L;
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
        FileOutputStream fis = new FileOutputStream("UID_student.txt");
        ObjectOutputStream os = new ObjectOutputStream(fis);

        System.out.println("serialization ended");
        os.writeObject(s);

        os.flush();
        os.close();
    }

}

