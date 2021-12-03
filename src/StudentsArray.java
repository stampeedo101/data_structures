import java.util.Arrays;

public class StudentsArray {

    private Student[] students = new Student[200];
    private int elementNumber = 0;



    /*
    METHODS TO IMPLEMENT

    addElement()
    addElementPosition()
    addElementBegin()
    addElementEnd()

    getElement()

    deleteElement()
    deleteBegin()
    deleteEnd()

    getLentgh()

     */

    public Student getStudent(int position){
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
        if(position>students.length){

            System.out.printf("\nSorry position not allowed, too high.");

        }else if(position > elementNumber +1){

            System.out.printf("\nSorry position not allowed, too high.");

        }else{

            if(position == (elementNumber+1) ){
                this.students[position] = student;
            }

            if(students[position] != null){

                Student[] realocationArray = new Student[students.length-position];

                if(elementNumber != 0){

                    for(int i = 0; i<(elementNumber-position); i++){
                        System.out.printf("\nvai saber: " + students[i].getName());
                    }

                }

            }

        }
        /*
        1 2 3 4
        criar array com length - position


         */
    }


    public void addElementBegin(){

    }

    public void addElementEnd(){

    }

    @Override
    public String toString() {
        String out = "\nStudent Array\n";
        for(int i = 0;i<students.length;i++){
            if(students[i] != null){
                out = out + students[i].toString() + "\n";
            }else break;
        }
        return out;
    }
}
