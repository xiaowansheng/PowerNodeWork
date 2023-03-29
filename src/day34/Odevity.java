package day34;

/**
 *
 * 两个线程共享一个数字
 * 一个输出奇数，一个输出偶数
 * 每次对数字++
 */
public class Odevity {
    public static void main(String[] args) {
        Number number=new Number();
        Thread t1=new Thread(new OddNumberOutput(number));
        t1.setName("t1");
        Thread t2=new Thread(new EvenNumberOutput(number));
        t2.setName("t2");
        t1.start();
        t2.start();
    }

}

//输出奇数
class OddNumberOutput implements Runnable{
    public Number number;

    public Number getNumber() {
        return number;
    }

    public OddNumberOutput(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            while(true){
                if(number.getNumber()%2==0){
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int count=number.getNumber();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->"+count);
                number.setNumber(count+1);
                number.notify();
            }

        }
    }

}

//输出偶数
class EvenNumberOutput implements Runnable{
    public Number number;

    public Number getNumber() {
        return number;
    }

    public EvenNumberOutput(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            while (true){
                if(number.getNumber()%2!=0){
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int count=number.getNumber();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->"+count);
                number.setNumber(count+1);
                number.notify();
            }

        }
    }

}