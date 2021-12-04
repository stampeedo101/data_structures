public class Student {

    private String name;
    private int age;
    private double height;

    public Student(){

    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        if(this.getName().length() < 6){
            return "(name : " +
                    this.getName() +
                    ") \t\t\t\t\t(age: " +
                    this.getAge() +
                    ") \t\t\t(height: " +
                    this.getHeight() +
                    ")"
                    ;
        }
        if(this.getName().length() < 10){
            return "(name : " +
                    this.getName() +
                    ") \t\t\t\t(age: " +
                    this.getAge() +
                    ") \t\t\t(height: " +
                    this.getHeight() +
                    ")"
                    ;
        }else {

            return "(name : " +
                    this.getName() +
                    ") \t\t\t(age: " +
                    this.getAge() +
                    ") \t\t\t(height: " +
                    this.getHeight() +
                    ")"
                    ;

        }
    }
}
