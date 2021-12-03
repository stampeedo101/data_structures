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

    public void addElement(Student student){
        for(int i = elementNumber ; i < this.students.length;i++){
            if(this.students[i] == null){
                this.students[i] = student;
                elementNumber = i;
                break;
            }
        }
    }

    public void addElementPosition(){

    }


    public void addElementBegin(){

    }

    public void addElementEnd(){

    }
}
