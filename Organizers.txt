/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Planner;

/**
 *
 * @author user
 */
public class Organizers implements InetProfit, Ipayment  {
  
 private String name;
 private double budget; 
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    
supplies Supplies;
    Organizers ( supplies Supplies )
    {
        this.Supplies = Supplies ;
    }
     sponsers Sponsers;
    Organizers( sponsers Sponsers )
    {
        this.Sponsers = Sponsers ;
    }
    
     CoverEvent Channel;
     Organizers (CoverEvent Channel)
    {
        this.Channel = Channel ;
    }
    

      public String username()
      {
          return ("Username");
      }
    public String password()
      {
          return ("Passwod");
      }

    @Override
    public float profit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float lost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double cash() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double credit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

 
}

