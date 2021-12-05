package singly_linked_list;

public class Main_singlyLinkedList {
    public static void main(String[] args) {
        System.out.printf("hello");
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
        integerMyLinkedList.addBegin(2);
        System.out.printf("\n" + integerMyLinkedList.toString());
    }
}
