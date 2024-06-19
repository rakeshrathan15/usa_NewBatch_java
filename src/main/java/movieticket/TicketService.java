package movieticket;

import java.util.Date;

public class TicketService {

    public Ticket bookTickets(Ticket ticket,Row[] rows){
        Ticket bookTicket=new Ticket();
            bookTicket.movieName=ticket.movieName;
            bookTicket.showTime=ticket.showTime;
            bookTicket.time=new Date();
            bookTicket.price=ticket.price;
            bookTicket.numberOfTickets=ticket.numberOfTickets;
            bookTicket.rows=rows;

        return  bookTicket;
    }


    public Ticket bookTicket1(Row[] seats,  String movieName, Date date){
        Ticket ticket2=new Ticket();
        ticket2.movieName=movieName;
        ticket2.time=date;




        return ticket2;
    }
}
