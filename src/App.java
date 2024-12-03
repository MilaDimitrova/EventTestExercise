public class App {
    public static void main(String[] args) {
        Concert concert1 = new Concert("NDK","12-12-2024","20:00",2500,19.99,"Ariana Grande");
        VolleyBallMatch match1 = new VolleyBallMatch("Sofia,Aleksandarv Maliinov","10-07-2025","19:30",100,5.99,"CSKA","Levski1914");

        try{
            concert1.sellTickets(240);
            System.out.println("240 tickets sold for Ariana Grande");
        }catch(NoMoreTicketException e){
            System.out.println(e.getMessage());
        }

        try{
            match1.sellTickets(3000);
            System.out.println("3000 tickets sold for CSKA/Levski");

        }catch(NoMoreTicketException e){
            System.out.printf(e.getMessage());
        }
    }
}