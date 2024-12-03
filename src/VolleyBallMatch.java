public class VolleyBallMatch extends Event{
    String firstTeam;
    String secondTeam;
    public VolleyBallMatch(String place, String date, String startHour,int numberOfTickets, double priceOfTicket,String firstTeam,String secondTeam){
        super(place, date, startHour,numberOfTickets,priceOfTicket);
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
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

