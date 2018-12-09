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
public class Prizes implements IUpdate {
    private int id;
    private String nameOfPrizes;
    private float cashWon;
    private championship champ;

    Prizes( championship champ )
    {
        this.champ = champ ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfPrizes() {
        return nameOfPrizes;
    }

    public void setNameOfPrizes(String nameOfPrizes) {
        this.nameOfPrizes = nameOfPrizes;
    }

    public float getCashWon() {
        return cashWon;
    }

    public void setCashWon(float cashWon) {
        this.cashWon = cashWon;
    }

    public championship getChamp() {
        return champ;
    }

    public void setChamp(championship champ) {
        this.champ = champ;
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
