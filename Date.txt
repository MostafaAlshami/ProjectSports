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
public class Date implements IUpdate{
    private int Day ;
    private int Month;
    private int Year;
    boolean getDay;
    boolean getMonth;
    boolean getYear;

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    @Override
    public String add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

