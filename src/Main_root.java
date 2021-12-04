
public class Main_root {
    public static void main(String[] args) {
//        System.out.printf("test");

        Student mary = new Student("Mary", 21,1.8);

        Student christopher = new Student("Christopher", 23,1.6);
        Student catherine = new Student("Catherine", 20,1.9);
        Student dominique = new Student("Dominique", 22,1.7);


        StudentsArray studentsArray = new StudentsArray();

        studentsArray.addElement(mary);

        studentsArray.addElement(christopher);
        studentsArray.addElement(catherine);
        studentsArray.addElement(dominique);


        Student ronald = new Student("Ronald",19,1.6);
        studentsArray.addElementPosition(ronald,3);


        Student charlotte = new Student("Charlotte",21,1.7);
        studentsArray.addElementBegin(charlotte);

        Student elizabeth = new Student("Elizabeth",19,1.6);
        studentsArray.addElementEnd(elizabeth);

        System.out.printf("" + studentsArray.toString());

        try{
            System.out.printf("\n\n\n search: position(1)" + studentsArray.getStudentByPosition(9).getName());
        }catch (Exception e){
            System.out.printf("\ntry another position");
        }

        Student josephine = new Student("Josephine", 19, 1.73);

        try{
            System.out.printf("\n\n\nsearch: \nstudent(" + charlotte.getName() + ") position = " + studentsArray.getPositionByStudent(charlotte));
            System.out.printf("\n\n\nsearch: \nstudent(" + josephine.getName() + ") position = " + studentsArray.getPositionByStudent(josephine));
        }catch (Exception e){
            System.out.printf("\ntry another position");
        }


    }
}