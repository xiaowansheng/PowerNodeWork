package day23;

public class Room {
    private int roomId;//房间号
    private String type;//房间类型
    private Boolean empty;//是否为空

    public Room() {
    }

    public Room(int roomId, String type, Boolean empty) {
        this.roomId = roomId;
        this.type = type;
        this.empty = empty;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        roomId = roomId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getEmpty() {
        return empty;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public boolean equale(Object o){
        if(o==null&&!(o instanceof Room))
            return false;
        if(o==this)
            return false;
        if(this.roomId==((Room)o).roomId)
            return true;
        else
            return false;
    }

    public String toString(){
        return "[房间号："+roomId+"，房间类型："+type+"，房间状态："+(empty?"空。":"满。")+"]";
    }

}

