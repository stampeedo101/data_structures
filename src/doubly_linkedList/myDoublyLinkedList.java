package doubly_linkedList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class myDoublyLinkedList <T> implements Iterable<T> {

    private int size = 0;
    private Node <T> head = null;

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
