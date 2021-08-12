package PrincetonAlgo.Week2;

public class Stack<T> {
    private Node first = null;
    private class Node{
        T item;
        Node next;
    }
    public T pop(){
        Node old = first;
        first = first.next;
        old.next=null;
        return old.item;
    }
    public void push(T item){
        Node oldList = first;
        this.first = new Node();
       this.first.item=item;
       this.first.next=oldList;
    }

}
