package PrincetonAlgo.Week2;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
    private Node first = null;
    private int size=0;

    @Override
    public Iterator<T> iterator() {
        return (new StackIterator());
    }
    private class StackIterator implements Iterator<T>{
        private Node temp;
        @Override
        public boolean hasNext() {
           return size>0;
        }

        @Override
        public T next() {
            temp=first;
            first=first.next;
            size--;
            return temp.item;
        }
    }

    private class Node{
        T item;
        Node next;
    }
    public T pop(){
        Node old = first;
        first = first.next;
        old.next=null;
        this.size--;
        return old.item;
    }
    public void push(T item){
        Node oldList = first;
        this.first = new Node();
       this.first.item=item;
       this.first.next=oldList;
       this.size++;
    }
    public int Size(){
        return this.size;
    }

}
