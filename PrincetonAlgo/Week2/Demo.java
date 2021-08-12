package PrincetonAlgo.Week2;

public class Demo {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("hello");
        s.push("world");
        s.push("abc");
        s.push("def");
        s.push("ljk");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
