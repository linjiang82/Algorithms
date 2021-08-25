package PrincetonAlgo.Week2;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("hello");
        s.push("world");
        s.push("abc");
        s.push("def");
        s.push("ljk");
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
        Iterator<String> iterator= s.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        StackInArr<String> s1 = new StackInArr<>();
        s1.push("start");
        s1.push("star");
        s1.push("st");
        s1.push("s");
        s1.push("start");
        s1.push("star");
        Iterator iterator1 = s1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
