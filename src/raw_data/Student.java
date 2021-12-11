package raw_data;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Student {

    private String name;
    private int id;
    private int age;
    private double height;

    public Student(){
        this.id = generateId();
    }

    public Student(String name){
        this.name = name;
        this.age = generateAge();
        this.height =generateHeight();
        this.id = generateId();
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.id = generateId();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int generateId(){
        return ThreadLocalRandom.current().nextInt(0,1000);
    }

    private int generateAge(){
        return ThreadLocalRandom.current().nextInt(17,27);
    }

    private double generateHeight(){
        return ThreadLocalRandom.current().nextDouble(1.60,2.2);
    }

    @Override
    public String toString() {
        if(this.getName().length() < 6){
            return String.format(
                    "(name : " +
                    this.getName() +
                    ") \t\t\t\t(id: " +
                    this.getId() +
                    ") \t(age: " +
                    this.getAge() +
                    ") \t\t\t(height: %,2.2f)",
                    this.getHeight()
            );
        }
        if(this.getName().length() < 10){
            return String.format(
                    "(name : " +
                    this.getName() +
                    ") \t\t\t(id: " +
                    this.getId() +
                    ") \t(age: " +
                    this.getAge() +
                    ") \t\t\t(height: %,2.2f)",
                    this.getHeight()
            );

        }else {
            return String.format(
                    "(name : " +
                    this.getName() +
                    ") \t\t(id: " +
                    this.getId() +
                    ") \t(age: " +
                    this.getAge() +
                    ") \t\t\t(height: %,2.2f)",
                    this.getHeight()
            );

        }
    }
}
