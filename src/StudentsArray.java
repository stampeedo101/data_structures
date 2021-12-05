import java.util.Arrays;

public class StudentsArray {

    private Student[] students = new Student[200];
    private int elementNumber = 0;



    /*
    METHODS TO IMPLEMENT

    V addElement()
    V addElementPosition()
    V addElementBegin()
    V addElementEnd()

    V getElementByPosition()
    V getPositionByElement()

    V deleteElementByPosition()
    V deleteElementByElement()
    V deleteBegin()
    V deleteEnd()

    sortNames()
    sortAges()
    sortHeights()

    getLentgh()

     */

    public Student getStudentByPosition(int position){
        if(students[position] != null){
            return students[position];
        }else{
            System.out.printf("Student not found");
            return null;
        }
    }

    public int getPositionByStudent(Student student){

        for(int i =0;i<elementNumber+1;i++){
            if(students[i].equals(student)){
                return i;
            }
        }

        return -1;
    }

    public void addElement(Student student){
        for(int i = elementNumber ; i < this.students.length;i++){
            if(this.students[i] == null){
                this.students[i] = student;
                elementNumber = i;
                break;
            }
        }
    }

    public void addElementPosition(Student student, int position){
        if(position > elementNumber + 1){

            System.out.print("\nSorry position not allowed, too high.");

        }else{

            if(position == (elementNumber+1) ){//tested

                this.students[position] = student;
                elementNumber++;

            }else if(students[position] != null){

                Student[] relocationArray = new Student[elementNumber+1-position];
//                System.out.print("\nlength " + relocationArray.length);

                if(elementNumber != 0){

//                    System.out.printf("\nelementNumber " + elementNumber + "\nposition " + position);

                    //copy elements for relocation
                    for(int i = position, j = 0; i < (elementNumber+1); i++ , j++){

                        if(students[i].getName() != null){

                            relocationArray[j] = students[i];

                        }else break;


                    }


                    //print relocation
//                    for(int i = 0; i < relocationArray.length; i++){
//
//                        if(relocationArray[i].getName() != null){
//
////                            System.out.print("\nrealocation: " + relocationArray[i].getName());
//
//                        }
//
//                    }

                    students[position] = student;
                    elementNumber++;

                    for(int i = position + 1, j = 0; i < (elementNumber+1); i++ , j++){
                        students[i] = relocationArray[j];
                    }

                    students[elementNumber+1] = relocationArray[relocationArray.length -1];

                }

            }

        }
    }

    public void addElementBegin(Student student){

        this.addElementPosition(student,0);

    }

    public void addElementEnd(Student student){

        this.addElementPosition(student,elementNumber+1);

    }

    public void deleteElementByPosition(int position){
        if(position>elementNumber){

            System.out.printf("\nposition too high");

        }else if(students[position] != null){
            if(position == elementNumber){

                System.out.printf("\n" + students[position].getName() + " gone\n");
                students[position] = null;
                elementNumber--;

            }else {

                Student[] relocation = new Student[elementNumber-position];

                for (int i =position+1,j=0;i<elementNumber+1;i++,j++){
                    relocation[j] = students[i];
                }

                for (int i = position, j = 0; j<relocation.length; i++,j++){
                    students[i] = relocation[j];
                }

                System.out.printf("\n" + students[position].getName() + " gone\n");
                students[elementNumber] = null;
                elementNumber--;
            }

        }else {
            System.out.printf("\nthere is no such element");
        }

    }

    public void deleteBegin(){
       if(students[0] != null){

           System.out.printf("\n" + students[0].getName() + " gone\n");

           Student[] relocation = new Student[students.length-1];

           for (int i =1,j=0;i< students.length-1;i++,j++){
                   relocation[j] = students[i];
               }

           for (int i = 0, j = 0; j<relocation.length; i++,j++){
               students[i] = relocation[j];
           }

           elementNumber--;
       }else{
           System.out.printf("\nthere is no element [0]");
       }
    }

    public void deleteEnd(){

        if(students[elementNumber] != null){

            System.out.printf("\n" + students[elementNumber].getName() + " gone\n");
            students[elementNumber] = null;
            elementNumber--;

        }else{
            System.out.printf("\nthere is no element [0]");
        }
    }

    public void deleteByStudent(Student student){

        if(this.getPositionByStudent(student) != -1){

            deleteElementByPosition(this.getPositionByStudent(student));

        }else {
            System.out.printf("\nthere is no student to delete");
        }
    }


    public Student[] sortNames(){

        for(int i =0;i<elementNumber;i++) {
            int temp =i;
            for (int j = i + 1;j<elementNumber+1;j++){

                if (Character.getNumericValue(students[temp].getName().charAt(0)) >
                        Character.getNumericValue(students[j].getName().charAt(0))) {
                    temp = j;
                }
                Student reserve;
                reserve = students[temp];
                students[temp] = students[i];
                students[i]= reserve;

            }

        }

        return students;
    }

    @Override
    public String toString() {
        String out = "\n\t\t\t\t\t\tStudent Array\n\n";
        for(int i = 0;i<students.length;i++){
            if(students[i] != null){

                out = out + i + "\t" + students[i].toString() + "\n";

            }else break;
        }
        return out;
    }
}
