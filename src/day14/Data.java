package day14;


public class Data {
    private int year;
    private int month;
    private int day;

    public Data(int year, int month, int day) {
        if(year>1976&&year<2099&&month<=12&&day<=31){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else {
            System.out.println("日期不和规范！");
        }
    }

    public Data() {
        year=2000;
        month=0;
        day=0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>1976&&year<2099)
            this.year = year;
        else {
            System.out.println("年份无效！");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>0&&month<=12)
            this.month = month;
        else {
            System.out.println("月份无效！");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>0&&day<=31){
            if(month==4&&month==6&&month==9&&month==11){
                this.day=day;
            }
            else if(month==2&&day<=29){
                this.day=day;
            }
            else
                this.day=day;
        }
        else {
            System.out.println("时间无效！");
        }
    }

    public String toString(){
        return year+"年"+month+"月"+day+"日";
    }

    public boolean equal(Object o){
        if(o==null||!(o instanceof Data))
            return false;
        if(this==o)
            return true;
        Data d=(Data)o;
        return this.year==d.year&&this.month==d.month&&this.day==d.day;
    }

    public static void main(String[] args) {
        Data data=new Data(2000,8,20);
        System.out.println(data);
        Data s=new Data(2000,8,20);
        System.out.println(data.equal(s));
        System.out.println(data.equal(new Data()));
        System.out.println(data.equal(data));
    }
}
