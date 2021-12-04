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
     getPositionByElement()

    deleteElement()
    deleteBegin()
    deleteEnd()

    getLentgh()

     */

    public Student getStudentByPosition(int position){
        return students[position];
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
                    for(int i = 0; i < relocationArray.length; i++){

                        if(relocationArray[i].getName() != null){

//                            System.out.print("\nrealocation: " + relocationArray[i].getName());

                        }

                    }

                    students[position] = student;

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

    @Override
    public String toString() {
        String out = "\n\t\t\t\t\t\tStudent Array\n\n";
        for(int i = 0;i<students.length;i++){
            if(students[i] != null){
                out = out + students[i].toString() + "\n";
            }else break;
        }
        return out;
    }
}
