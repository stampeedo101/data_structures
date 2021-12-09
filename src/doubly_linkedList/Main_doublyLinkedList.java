package doubly_linkedList;
import raw_data.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Main_doublyLinkedList {
    public static void main(String[] args) {

        Student mary = new Student("Mary",21,1.8);

        Student catherine = new Student("Catherine", 20,1.9);
        Student dominique = new Student("Dominique", 22,1.7);

        Student charlotte = new Student("Charlotte",21,1.7);

        Student elizabeth = new Student("Elizabeth",19,1.6);

        Student josephine = new Student("Josephine", 19, 1.73);

        MyDoublyLinkedList<Student> myDoublyLinkedList = new MyDoublyLinkedList<Student>();

        System.out.printf("\nempty: " + myDoublyLinkedList.isEmpty());
        System.out.printf("\nsize: " + myDoublyLinkedList.size());

        /*
        myDoublyLinkedList.addFirst(mary);
        System.out.printf("\nsize: " + myDoublyLinkedList.size());

        myDoublyLinkedList.addFirst(catherine);
        System.out.printf("\nsize: " + myDoublyLinkedList.size());

        myDoublyLinkedList.addLast(charlotte);
        System.out.printf("\nsize: " + myDoublyLinkedList.size());

        */

        myDoublyLinkedList.addLast(mary);

        myDoublyLinkedList.addLast(josephine);

        myDoublyLinkedList.addLast(charlotte);

        myDoublyLinkedList.add(elizabeth);
        myDoublyLinkedList.addFirst(catherine);

        System.out.printf("\nempty: " + myDoublyLinkedList.isEmpty());

        System.out.printf("\nfirst: " + myDoublyLinkedList.peekFirst().getName());

        System.out.printf("\nlast: " + myDoublyLinkedList.peekLast().getName());

//        myDoublyLinkedList.clear();

        System.out.printf("\nempty: " + myDoublyLinkedList.isEmpty());

        Iterator<Student> studentIterator = myDoublyLinkedList.iterator();

        while (studentIterator.hasNext()){
            System.out.printf("\niterator: " + studentIterator.next());
        }


        System.out.printf("\nsize " + myDoublyLinkedList.size());

        try {
            myDoublyLinkedList.addAtIndex(1,dominique);
            Iterator<Student> studentIterator2 = myDoublyLinkedList.iterator();

            while (studentIterator2.hasNext()){
                System.out.printf("\niterator: " + studentIterator2.next());
            }
            System.out.printf("\nsize " + myDoublyLinkedList.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

}
}
