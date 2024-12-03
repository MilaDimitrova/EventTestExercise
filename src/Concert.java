public class Concert extends Event {
    String starName;
    public Concert(String place, String date, String startHour,int numberOfTickets, double priceOfTicket,String starName){
        super(place, date, startHour,numberOfTickets,priceOfTicket);
        this.starName = starName;
    }


    @Override
    public boolean sellTickets(int num) throws NoMoreTicketException{
        if(numberOfTickets >= num){
            this.numberOfTickets -= num;
            return true;
        }else{
            throw new NoMoreTicketException("Not enough tickets");
        }
    }
}
