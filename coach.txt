/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entertainer;

/**
 *
 * @author user
 */
public class coach extends Human implements ILogin{
 
     private team Team;
    private String Before;
    private String After;
    private double rate;
    private Preformance p;
    
    coach( team Team )
    {
        this.Team = Team ;
    }

    public team getTeam() {
        return Team;
    }

    public void setTeam(team Team) {
        this.Team = Team;
    }

    public Preformance getP() {
        return p;
    }

    public void setP(Preformance p) {
        this.p = p;
    }
    
    public String getBefore() {
        return Before;
    }

    public void setBefore(String Before) {
        this.Before = Before;
    }

    public String getAfter() {
        return After;
    }

    public void setAfter(String After) {
        this.After = After;
    }
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate <=3.5)
        this.rate = rate;
    }
     coach (Preformance p)
    {
        this.p = p ;
    }
    public String add()
      {
          return ("ADD Coach");
      }
    public String remove()
      {
          return ("DELETE Coach");
      }

    @Override
    public String username() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String password() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
