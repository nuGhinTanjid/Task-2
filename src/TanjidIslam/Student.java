package TanjidIslam;

public class Student {
    int id;
    String name;
    static String universityName;

    Student() {
        System.out.println("Default Constructor");
    }
    Student(String name) {
        this.name = name;
        System.out.println("Name: "+this.name);
    }
    Student(int id) {
        this.id = id;
        System.out.println("Id: "+this.id);
    }

    void display() {
        System.out.println("University Name: " +universityName);
    }
}
