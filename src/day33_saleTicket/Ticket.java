package day33_saleTicket;

public class Ticket{
    private static int serialNumber=1;//编号
    private String name;//票名

    public Ticket() {
    }

    public Ticket(String name) {
        this.serialNumber ++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
