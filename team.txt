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
public class team implements Iposition {
  
    private String typeOfBall;
    private int totalGoals;
    private int totalPoints;
    private int win =0;
    private int lose=0;
    private int drow=0;
    private String typeOfSports;
    private String cup;

    public int getTotalGoals() {
        return totalGoals;
    }
    
    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        if(totalPoints==0)
        this.totalPoints = totalPoints+3;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        if ( win == 0)
           
        this.win = win+1;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDrow() {
        return drow;
    }

    public void setDrow(int drow) {
        this.drow = drow;
    }

    public player getP() {
        return p;
    }

    public void setP(player p) {
        this.p = p;
    }

    public coach getCoach() {
        return Coach;
    }

    public void setCoach(coach Coach) {
        this.Coach = Coach;
    }
    
      player p;
     team (player p)
    {
        this.p = p ;
    }
       coach Coach;
     team (coach Coach)
    {
        this.Coach = Coach ;
    }  

    @Override
    public String MiddleFeild() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String GoalKeeper() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Defense() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}