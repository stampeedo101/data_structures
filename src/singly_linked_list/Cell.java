package singly_linked_list;

public class Cell<T> {
    private T element;
    private Cell<T> next;

    public Cell(T element) {
        this.element = element;
        this.next = null;
    }

    public Cell(T element, Cell<T> next) {
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Cell<T> getNext() {
        return next;
    }

    public void setNext(Cell<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
