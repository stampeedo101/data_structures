package doubly_linkedList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyDoublyLinkedList<T> implements Iterable<T> {

      /*
    METHODS TO IMPLEMENT

    addElement()
    addElementPosition()
    addElementBegin()
    addElementEnd()

    getElementByPosition()
    getPositionByElement()

    deleteElementByPosition()
    deleteElementByElement()
    deleteBegin()
    deleteEnd()
    clear()

    sortNames()
    sortAges()
    sortHeights()

    getLentgh()

     */

    private int size = 0;
    private Node <T> head = null;
    private Node <T> tail = null;

    private class Node <T>{
        T data;
        Node<T> previous, next;

        public Node(T data, Node<T> previous, Node<T> next){
            this.data = data;
            this.previous = previous;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public void clear(){
        Node<T> traverser = head;

        while (traverser != null){
            Node<T> next = traverser.next;
            traverser.previous = traverser.next = null;
            traverser.data = null;
            traverser = next;
        }

        head = tail = traverser = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else return false;
    }

    public int size(){
        return size;
    }

    public void add(T element){
        addLast(element);
    }

    public void addFirst(T element){

        if(isEmpty()){
            //FIRST CASE
            //previous always will be null
            //next always null too
            //head and tail are the same

            head = tail = new Node<T>(element,null,null);

        }else {
            //save reference to previous of old head
            head.previous = new Node<T>(element,null,head);
            //change old head for new one
            head = head.previous;
        }

        size++;
    }

    public void addLast(T element){

       if(isEmpty()){
           //FIRST CASE
           //previous always will be null
           //next always null too
           //head and tail are the same

           System.out.printf("\nentrou\n");
           head = tail = new Node<T>(element,null,null);

       }else {
           tail.next = new Node<T>(element,tail,null);
           tail = tail.next;
       }
       size++;
    }

    public T peekFirst(){
       if(isEmpty()) throw new RuntimeException("Empty List");
       return head.data;
    }

    public T peekLast(){
        if(isEmpty()) throw new RuntimeException("Empty List");
        return tail.data;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
