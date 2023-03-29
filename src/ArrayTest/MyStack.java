package ArrayTest;

public class MyStack {//第23天作业
    private Object[] elements;
    private int index;//指向栈顶
    public MyStack(){
        elements=new Object[20];
        index=-1;
    }
    public void push(Object o){
        if(index<elements.length){
            index++;
            elements[index]=o;
        }
        else{
            System.out.println("栈满！");
        }
    }
    public Object pop(){
        if(index>-1){
            return elements[index--];
        }
        else
        {
            System.out.println("栈里已经没有元素了！");
            return null;
        }
    }
}
