package day23;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        boolean start=true;
        System.out.println("酒店服务平台启动。");
        System.out.println("请根据以下指令进行操作:");
        System.out.println("输入指令：【1】定房间，【2】退房间，【3】查看所有房间状态，【0】退出系统。");
        Scanner order=new Scanner(System.in);
        while (start){
            System.out.print("请输入指令：");
            switch (order.nextInt()){
                case 1:
                    System.out.print("请输入要预定房间号：");
                    hotel.roomReservation(order.nextInt());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("请输入要退订的房间号");
                    hotel.checkOut(order.nextInt());
                    System.out.println();
                    break;
                case 3:
                    hotel.findRooms();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("指令不正确，请重新输入：");
            }
        }
    }
}
