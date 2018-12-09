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
public class player extends Human implements ILogin, Iposition{
    
        private String sport;
	private int goals;
        private Preformance p;
   
    player() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
	    public String getSport() {
	        return sport;
	    }
 
	    public void setSport(String sport) {
	        this.sport = sport;
	    }
 
	    public int getGoals() {
	        return goals;
	    }
 
	    public void setGoals(int goals) {
	        this.goals = goals;
	    }
 
	    public String username()
            {
	          return super.getUsername();
            }

	    public String password() 
            {
	          return super.getPassword(); 
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
