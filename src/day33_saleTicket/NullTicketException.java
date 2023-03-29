package day33_saleTicket;

public class NullTicketException extends Exception{
    public NullTicketException(String message) {
        super(message);
    }

    public NullTicketException() {
    }
}
