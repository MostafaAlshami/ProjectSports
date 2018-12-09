/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Episode;

/**
 *
 * @author user
 */
public class seat implements IUpdate
{
    private int id;
    private ticket Ticket;
    private final ticket ticket;

   
   
    seat ( ticket Ticket )
    {
        this.ticket = Ticket ;
    }

    seat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
   public String add()
      {
          return ("ADD Seat");
      }
   public String remove()
      {
          return ("DELETE Seat");
      }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ticket getTicket() {
        return Ticket;
    }

    public void setTicket(ticket Ticket) {
        this.Ticket = Ticket;
    }
   
}
