
public class Main_root {
    public static void main(String[] args) {
//        System.out.printf("test");

        Student mary = new Student("Mary", 21,1.8);
        Student ronald = new Student("Ronald",19,1.6);

        StudentsArray studentsArray = new StudentsArray();

        studentsArray.addElement(mary);

        System.out.printf("\n a student: " + studentsArray.getStudent(0));

        studentsArray.addElementPosition(ronald,1);

        System.out.printf("" + studentsArray.toString());

    }
}