public abstract class Event {
    String place;
    String date;
    String startHour;
    int numberOfTickets;
    double priceOfTicket;

    public Event(String place, String date, String startHour, int numberOfTickets, double priceOfTicket){
        this.place = place;
        this.date = date;
        this.startHour = startHour;
        this.numberOfTickets = numberOfTickets;
        this.priceOfTicket = priceOfTicket;
    }

    public boolean sellTickets(int num) throws NoMoreTicketException {
        return false;
    }
}
