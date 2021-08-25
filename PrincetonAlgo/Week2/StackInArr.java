package PrincetonAlgo.Week2;

import java.util.Iterator;

public class StackInArr<T> implements Iterable{
    private T[] t;
    public int size=0;
    private int capacity=10;
    public StackInArr(){
       t = (T[]) new Object[capacity];
    }
    public void push(T item){
        this.t[size++]=item;
        resize();
    }
    public T pop(){
        if(!isEmpty())
{         resize();
        return this.t[--size];
 }
        else return null;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    private void resize(){
        if(size==capacity){
            capacity*=2;
           T[] tempArr = (T[]) new Object[capacity];
           for(int i =0;i<size;i++){
               tempArr[i]=t[i];
           }
           t=tempArr;
        }
        else if(size<=capacity/4){
            capacity/=2;
            T[] tempArr = (T[]) new Object[capacity];
            for(int i =0;i<size;i++){
                tempArr[i]=t[i];
            }
            t=tempArr;
        }

    }

    @Override
    public Iterator iterator() {
        return new StackIter();
    }
    public class StackIter implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return size!=0;
        }

        @Override
        public T next() {
            return t[--size] ;
        }
    }
}
