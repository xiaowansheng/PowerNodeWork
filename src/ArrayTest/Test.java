package ArrayTest;

public class Test {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        MyStack myStack=new MyStack();
        myStack.push(o1);
        myStack.push(o2);
        System.out.println(myStack.pop());
    }
}
