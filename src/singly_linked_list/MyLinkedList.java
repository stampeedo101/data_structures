package singly_linked_list;

public class MyLinkedList<T> {
    private Cell<T> begin;


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

    sortNames()
    sortAges()
    sortHeights()

    getLentgh()

     */

    public void addBegin(T elemento){
        Cell cell = new Cell<T>(elemento);
        this.begin = cell;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "begin=" + begin +
                '}';
    }
}
