import java.util.Arrays;

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

        System.out.printf("" + studentsArray);

        System.out.println();
        System.out.println();

        Student josephine = new Student("Josephine", 19, 1.73);
        /*

        try{
            System.out.printf("\n\n\n search: position(1)" + studentsArray.getStudentByPosition(9).getName());
        }catch (Exception e){
            System.out.printf("\ntry another position");
        }

        try{
            System.out.printf((studentsArray.getPositionByStudent(charlotte) != -1)?
                    "\n\n\nsearch: \nstudent(" + charlotte.getName() + ") position = " + studentsArray.getPositionByStudent(charlotte):
                    "\n\n\nStudent not found"
                    );
            System.out.printf((studentsArray.getPositionByStudent(josephine) != -1)?
                    "\n\n\nsearch: \nstudent(" + josephine.getName() + ") position = " + studentsArray.getPositionByStudent(josephine):
                    "\n\n\nStudent not found"
            );
        }catch (Exception e){
            System.out.printf("\ntry another position");
        }

        //test deleteElementByPosition()
        System.out.printf("" + studentsArray);
        studentsArray.deleteElementByPosition(7);
        System.out.printf("" + studentsArray);

        //test deleteElementBegin()
        System.out.printf("" + studentsArray);
        studentsArray.deleteBegin();
        System.out.printf("" + studentsArray);

        //test deleteElementEnd()
        System.out.printf("" + studentsArray);
        studentsArray.deleteEnd();
        System.out.printf("" + studentsArray);

        //test deleteElementByStudent
        System.out.printf("" + studentsArray);
        studentsArray.deleteByStudent(dominique);
        System.out.printf("" + studentsArray);

        */

        studentsArray.sortNames();

        System.out.printf("" + studentsArray);

    }
}