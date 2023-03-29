package day21;

public class Computer {
    public static void main(String[] args) {
        KeyBoard keyBoard=new KeyBoard();
        Mouse mouse=new Mouse();
        System.out.println(keyBoard.toString());
        System.out.println(mouse.toString());
        mouse.work();
        keyBoard.work();
    }
}
