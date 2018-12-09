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
public class Refree {
   
    private String before;
    private int YearsOfExperience;
    private float rating ;
   
    
    
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
      
       if(rating <= 5 && rating > 0)
      this.rating = rating;
    }
    
  
    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(int YearsOfExperience) 
    {
        if(YearsOfExperience <=5)
        this.YearsOfExperience = YearsOfExperience;
    }
    
}
