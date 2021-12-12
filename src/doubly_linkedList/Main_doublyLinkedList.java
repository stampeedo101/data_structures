package doubly_linkedList;
import raw_data.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Main_doublyLinkedList {
    private static int i =0;

    public static void main(String[] args) {

        MyDoublyLinkedList<Student> myDoublyLinkedList = new MyDoublyLinkedList<Student>();

        Student marie = new Student("Marie",21,1.8);

        Student catherine = new Student("Catherine", 20,1.9);

        Student antoinette = new Student("Antoinette", 20,1.9);

        Student dietrich = new Student("Dietrich");
        Student marlene = new Student("Marlene");
        Student michelle = new Student("Michelle");
        Student felicia = new Student("Felicia");
        myDoublyLinkedList.add(felicia);
        Student rosalie = new Student("Rosalie");
        myDoublyLinkedList.add(rosalie);
        Student ariel = new Student("Ariel");
        myDoublyLinkedList.add(ariel);
        Student elizabeth = new Student("Elizabeth");
        myDoublyLinkedList.add(elizabeth);

        Student angeline = new Student("Angeline");
        myDoublyLinkedList.add(angeline);
        Student jeanette = new Student("Jeanette");
        myDoublyLinkedList.add(jeanette);
        Student delphine = new Student("Delphine");
        myDoublyLinkedList.add(delphine);
        Student juliet = new Student("Juliet");
        myDoublyLinkedList.add(juliet);
        Student silvie = new Student("Silvie");
        myDoublyLinkedList.add(silvie);
        Student scarlet = new Student("Scarlet");
        myDoublyLinkedList.add(scarlet);
        Student sophie = new Student("Sophie");
        myDoublyLinkedList.add(sophie);
        Student marianne = new Student("Marianne");
        myDoublyLinkedList.add(marianne);
        Student ferris = new Student("Ferris");
        myDoublyLinkedList.add(ferris);
        Student ivan = new Student("Ivan");
        myDoublyLinkedList.add(ivan);
        Student george = new Student("George");
        myDoublyLinkedList.add(george);
        Student bridget = new Student("Bridget");
        myDoublyLinkedList.add(bridget);
        Student katherine = new Student("Katherine");
        myDoublyLinkedList.add(katherine);
        Student josephine = new Student("Josephine", 19, 1.73);
        Student brooke = new Student("Brooke");
        myDoublyLinkedList.add(brooke);
        Student fantini = new Student("Fantini");
        myDoublyLinkedList.add(fantini);
        Student charlemagne = new Student("Charlemagne");
        myDoublyLinkedList.add(charlemagne);
        Student porthos = new Student("Porthos");
        myDoublyLinkedList.add(porthos);
        Student dArtagnan = new Student("D'Artagnan");
        myDoublyLinkedList.add(dArtagnan);
        Student raymond = new Student("Raymond");
        myDoublyLinkedList.add(raymond);

        Student dominique = new Student("Dominique", 22,1.7);

        Student charlotte = new Student("Charlotte",21,1.7);




        System.out.printf("\nempty: " + myDoublyLinkedList.isEmpty());
        System.out.printf("\nsize: " + myDoublyLinkedList.size());

        /*
        myDoublyLinkedList.addFirst(marie);
        System.out.printf("\nsize: " + myDoublyLinkedList.size());

        myDoublyLinkedList.addFirst(catherine);
        System.out.printf("\nsize: " + myDoublyLinkedList.size());

        myDoublyLinkedList.addLast(charlotte);
        System.out.printf("\nsize: " + myDoublyLinkedList.size());

        */

        myDoublyLinkedList.addLast(marie);

        myDoublyLinkedList.addLast(josephine);

        myDoublyLinkedList.addLast(charlotte);

        myDoublyLinkedList.add(elizabeth);

        myDoublyLinkedList.add(catherine);

        myDoublyLinkedList.add(antoinette);

        myDoublyLinkedList.addFirst(dietrich);
        myDoublyLinkedList.add(marlene);
        myDoublyLinkedList.add(michelle);


        System.out.printf("\nempty: " + myDoublyLinkedList.isEmpty());

        System.out.printf("\nfirst: " + myDoublyLinkedList.peekFirst().getName());

        System.out.printf("\nlast: " + myDoublyLinkedList.peekLast().getName());

//        myDoublyLinkedList.clear();

        System.out.printf("\nempty: " + myDoublyLinkedList.isEmpty());

        Iterator<Student> studentIterator = myDoublyLinkedList.iterator();

        i =0;
        while (studentIterator.hasNext()){
            System.out.printf("\niterator: "  + i +"]\t" + studentIterator.next());
        }


        System.out.printf("\nsize " + myDoublyLinkedList.size() + "\n\n");

        try {
            myDoublyLinkedList.addAtIndex(2,dominique);
            Iterator<Student> studentIterator2 = myDoublyLinkedList.iterator();

            i=0;
            while (studentIterator2.hasNext()){
                System.out.printf("\niterator: [" + i +"]\t" +studentIterator2.next());
                i++;
            }
            System.out.printf("\nsize " + myDoublyLinkedList.size() + "\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.printf("\ntest for extractFirst\n" );
        try {

            for (int i =0; i<30;i++){

                System.out.printf("\nExtracted: " + myDoublyLinkedList.extractLast().getName());
            }


            System.out.printf("\nelement deleted: " + myDoublyLinkedList.removeElement(felicia));

            myDoublyLinkedList.removeElement(dietrich);

            Iterator<Student> studentIterator2 = myDoublyLinkedList.iterator();


            i=0;
            while (studentIterator2.hasNext()){
                System.out.printf("\niterator: [" + i +"]\t" +studentIterator2.next());
                i++;
            }
            System.out.printf("\nsize " + myDoublyLinkedList.size() + "\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
