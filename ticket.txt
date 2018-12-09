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
public class ticket implements IUpdate
{  
    private double productDate;
    private double expiredDate;
    private double price;
    private double Ticket;
    private String typeTicket;
    boolean getProductDate;
    boolean getExpiredDate;
    boolean getPrice;
    boolean getTicket;
    boolean getTypeTicket;

   

    public double getProductDate() {
        return productDate;
    }

    public void setProductDate(double productDate) {
        this.productDate = productDate;
    }

    public double getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(double expiredDate) {
        this.expiredDate = expiredDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTicket() {
        return Ticket;
    }

    public void setTicket(double Ticket) {
        if(Ticket <= 3 && Ticket > 0)
            this.Ticket = Ticket;
    }

    public void setTypeTicket(String typeTicket) {
        this.typeTicket = typeTicket;
        
        if (typeTicket == "Gold" )
        Ticket =Ticket*200;
        else if (typeTicket == "Silver" )
        Ticket=Ticket*150;
        else if(typeTicket == "Black" )
        Ticket = Ticket*100;
    }
    public String getTypeTicket()
    {
        return typeTicket;
    }
            
      public String add()
      {
          return ("ADD Ticket");
      }
      public String remove()
      {
          return ("Delete Ticket");
      }
  
}
