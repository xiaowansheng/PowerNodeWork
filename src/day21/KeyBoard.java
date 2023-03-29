package day21;

public class KeyBoard implements InsertDrawable{
    private String name;
    private String type;

    public KeyBoard() {
        name="键盘";
        type="机械键盘";
    }

    public KeyBoard(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void work(){
        System.out.println("键盘正在使用中。");
    }

    public boolean equals(Object obj){
        if(obj==null||!(obj instanceof KeyBoard))
            return false;
        if(obj==this)
            return false;
        KeyBoard k=(KeyBoard)obj;
        return name==k.name&&type==k.type;
    }

    public String toString(){
        return "键盘名："+name+",类型："+type;
    }
}
