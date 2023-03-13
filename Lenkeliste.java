import java.util.Iterator;

class Lenkeliste<E> implements Iterable<E> {
    private Node first = null;
    private Node last = null;
    private int size = 0;

    private class Node {
        Node next = null;
        E data;

        Node(E data) {
            this.data = data;
        }
    }

    private class LenkelisteIterator implements Iterator<E> {
        int counter = 0;

        @Override
        public boolean hasNext() {
            return counter < size;            
        }

        @Override
        public E next() {
            counter++;
            return get(counter-1);
        }
    }

    public void add(E data) {
        Node newNode = new Node(data);
        size++;
        if(first == null) {
            first = last = newNode;
            return;
        }
        last.next = newNode;
        last = newNode;
    }

    public E get(int pos) {
        if(pos >= size) return null;
        Node pointer = first;
        for(int i = 0; i < pos; i++) {
            pointer = pointer.next;
        }
        return pointer.data;
    }

    public E remove() {
        if(size == 0) return null;
        
        E firstValue = first.data;
        if(first != last) {
            first = first.next;
        } else {
            first = last = null;
        }
        
        size--;
        return firstValue;
    }

    public int getSize() { return size; }
    public Node getFirst() { return first; }
    public Node getLast() { return last; }

    public Iterator<E> iterator() {
        return new LenkelisteIterator();
    }

}