
public class Main_root {
    public static void main(String[] args) {
//        System.out.printf("test");

        Student mary = new Student("Mary", 21,1.8);

        Student christopher = new Student("Christopher", 23,1.6);
        Student catherine = new Student("Catherine", 20,1.9);
        Student dominique = new Student("Dominique", 22,1.7);

        Student ronald = new Student("Ronald",19,1.6);

        StudentsArray studentsArray = new StudentsArray();

        studentsArray.addElement(mary);

        studentsArray.addElement(christopher);
        studentsArray.addElement(catherine);
        studentsArray.addElement(dominique);


        studentsArray.addElementPosition(ronald,2);

        System.out.printf("" + studentsArray.toString());

    }
}