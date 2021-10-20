package TanjidIslam;

public class Main {

    public static void main(String[] args) {
	Student student1 = new Student();
	Student.universityName = "Leading University";

	Student student2 = new Student("Tanjid Islam");
	Student student3 = new Student(2012020147);
	student1.display();
    }
}
