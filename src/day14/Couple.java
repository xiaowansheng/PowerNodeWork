package day14;
//
public class Couple {
    public static void main(String[] args) {

    }
}

abstract class People{
    private String idCard;
    private String name;
    private String dateBirth;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public People(String idCard, String name, String dateBirth) {
        this.idCard = idCard;
        this.name = name;
        this.dateBirth = dateBirth;
    }
}

class Husband{


}

class Wife{

}