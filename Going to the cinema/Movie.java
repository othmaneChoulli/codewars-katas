public class Movie {
    
    public static int movie(int card, int ticket, double perc) {
        int ticketPrice = 0; 
        double percPrice =  card; 
        int visits = 0;
        
        do {
        visits = visits + 1; 
        
          ticketPrice = ticketPrice + ticket;  
          percPrice = percPrice + (ticket*Math.pow(perc, visits)); 
       
        } while(ticketPrice <= Math.ceil(percPrice)); 
     
     return visits;
    }
}
