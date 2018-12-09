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
public class fitness {
    
   private double trainingCredit;
   private double height;
   private double weight;
   private boolean nutritionSupplement ;
   private boolean healthIssues;
   
    public double getTrainingCredit()
    {
        return trainingCredit;
    }

    public void setTrainingCredit(double trainingCredit) {
        this.trainingCredit = trainingCredit;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

   
    public boolean isNutritionSupplement() {
        return nutritionSupplement;
    }

    public void setNutritionSupplement(boolean nutritionSupplement) {
        if(nutritionSupplement= true)
        this.nutritionSupplement = nutritionSupplement;
    }

    public boolean isHealthIssues() {
        return healthIssues;
    }

    public void setHealthIssues(boolean healthIssues) {
        if (healthIssues=true)
         this.healthIssues = healthIssues;
    }
}
