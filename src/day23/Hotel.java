package day23;

public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms=new Room[3][12];
        for(int i=0;i<3;i++){
            for(int j=0;j<12;j++){
                if(i==0)
                    rooms[i][j]=new Room((i+1)*100+j+1,"单人间",true);
                if(i==1)
                    rooms[i][j]=new Room((i+1)*100+j+1,"标准间",true);
                if(i==2)
                    rooms[i][j]=new Room((i+1)*100+j+1,"总统套间",true);
            }
        }
    }

    public void findRooms(){
        System.out.println("房间状态：");
        for(int i=0;i<3;i++){
            for(int j=0;j<12;j++){
                System.out.println(rooms[i][j]);
            }
        }
    }

    public void roomReservation(int roomId){
        if(roomId<=100||roomId>999){
            System.out.println("房间号错误。");
            return;
        }
        int floor=roomId/100-1;//楼层
        int number=roomId%100-1;
        if(rooms[floor][number].getEmpty()){
            rooms[floor][number].setEmpty(false);
            System.out.println("订房成功！");
        }
        else if(rooms[floor][number].getEmpty()==false){
            System.out.println("您预定的房间不空！请换个房间");
        }
        else {
            System.out.println("预定的房间不存在！");
        }
    }
    public void checkOut(int roomId){
        if(roomId<=100&&roomId>999){
            System.out.println("房间号错误。");
            return;
        }
        int floor=roomId/100-1;//楼层
        int number=roomId%100-1;
        if(rooms[floor][number].getEmpty()==false){
            rooms[floor][number].setEmpty(true);
            System.out.println("退房成功！");
        }
        else if(rooms[floor][number].getEmpty()){
            System.out.println("房间为空，退订错误！");
        }
        else {
            System.out.println("退订的房间不存在！");
        }
    }
}
