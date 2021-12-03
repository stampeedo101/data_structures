
public class Main_root {
    public static void main(String[] args) {
//        System.out.printf("test");

        Student mary = new Student("Mary", 21,1.8);

        StudentsArray studentsArray = new StudentsArray();

        studentsArray.addElement(mary);

        System.out.printf("\n a student: " + studentsArray.toString());

    }
}