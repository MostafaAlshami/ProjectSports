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
public class injury {
private String typeOfInjury;
private int dateOFInjurt;
private int dateOfRecovery; 
private String medicine;
private String report;

    public String getTypeOfInjury() {
        return typeOfInjury;
    }

    public void setTypeOfInjury(String typeOfInjury) {
        this.typeOfInjury = typeOfInjury;
    }

    public int getDateOFInjurt() {
        return dateOFInjurt;
    }

    public void setDateOFInjurt(int dateOFInjurt) {
        this.dateOFInjurt = dateOFInjurt;
    }

    public int getDateOfRecovery() {
        return dateOfRecovery;
    }

    public void setDateOfRecovery(int dateOfRecovery) {
        this.dateOfRecovery = dateOfRecovery;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
    
}
