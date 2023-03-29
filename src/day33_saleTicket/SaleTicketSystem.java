package day33_saleTicket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleTicketSystem implements SaleTicket {

    private List<Ticket> tickets=null;

    public SaleTicketSystem() {
        this.tickets = new ArrayList<>();
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public static void main(String[] args) {
        SaleTicketSystem s=new SaleTicketSystem();
        System.out.print("总票数：");
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();
        for(int i=0;i<count;i++){
            s.tickets.add(new Ticket("演唱会门票"));
        }
        System.out.println("现有门票数："+s.tickets.size());
        Thread t1=new Thread(new SaleTicket_0(s));
        t1.setName("抢票系统1号");
        Thread t2=new Thread(new SaleTicket_0(s));
        t2.setName("抢票系统2号");
        Thread t3=new Thread(new SaleTicket_0(s));
        t3.setName("抢票系统3号");
        Thread t4=new Thread(new SaleTicket_0(s));
        t4.setName("抢票系统4号");
        System.out.println("开始售卖！");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        while(s.tickets.size()!=0){
            //每秒输出一次剩余票数
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("剩余票数："+s.getTickets().size());
        }
        System.out.println("票已售空！");
    }

    @Override
    public Ticket saleTicket() throws NullTicketException {
        if(tickets==null){
            throw new NullTicketException("售票系统未开启！");
        }
        Ticket t=null;
        synchronized (tickets){
            int count=tickets.size();
            if(count==0){
                System.out.println("抢票失败，票已售空！");
                return null;
            }
            int index=count-1;
            t=tickets.remove(index);
            System.out.println("门票还剩余"+index);
        }
        return t;
    }
}

class SaleTicket_0 implements Runnable{

    private SaleTicketSystem sale;

    public SaleTicket_0(SaleTicketSystem sale) {
        this.sale = sale;
    }

    @Override
    public void run() {
        List<Ticket> users=new ArrayList<>();
        Ticket t=null;
        while(sale.getTickets().size()>0){
            try {
                if((t=sale.saleTicket())==null){
                    break;
                }
                users.add(t);
                System.out.println(Thread.currentThread().getName()+"抢到票。");
            } catch (NullTicketException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"抢到票："+users.size()+"张");
    }
}


