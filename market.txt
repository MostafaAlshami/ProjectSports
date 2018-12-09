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
public class market {
  
    private double productionProduct;
    private double expirtionProduct;

    market() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public double getProductionProduct() {
        return productionProduct;
    }

    public void setProductionProduct(double productionProduct) {
        this.productionProduct = productionProduct;
    }

    public double getExpiredProduct() {
        return expirtionProduct;
    }

    public void setExpiredProduct(double expiredProduct) {
        this.expirtionProduct = expiredProduct;
    }
    
    supplies Supplies;
    market( supplies Supplies )
    {
        this.Supplies = Supplies ;
    }
}

