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
public class CoverEvent {
   private int tvFrequency;
   private boolean isVertical;
   private boolean isHorizontal;
   private String radioName;
   private float radioFrequency;
   private String tvSatellite;
    boolean getRadioName;
    boolean getTvSatellite;
    boolean getRadioFrequency;
    boolean getIsVertical;
    boolean getTvFrequency;
    boolean getIsHorizontal;

    CoverEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String getRadioName() {
        return radioName;
    }

    public void setRadioName(String radioName) {
        this.radioName = radioName;
    }

    public String getTvSatellite() {
        return tvSatellite;
    }

    public void setTvSatellite(String tvSatellite) {
        this.tvSatellite = tvSatellite;
    }

    
    public float getRadioFrequency() 
    {
        return radioFrequency;
    }
    public void setRadioFrequency(float radioFrequency) 
    {
         if (radioFrequency <=100 && radioFrequency > 0)
        this.radioFrequency = radioFrequency;
    }

     public int getTvFrequency() {
        return tvFrequency;
    }

    public void setTvFrequency(int tvFrequency) {
        if (tvFrequency <=10000 && tvFrequency >0)
        this.tvFrequency = tvFrequency;
    }

    public boolean isIsVertical() {
        return isVertical;
    }

    public void setIsVertical(boolean isVertical) {
        if(isVertical == true)
        this.isVertical = isVertical;
    }

    public boolean isIsHorizontal() {
        return isHorizontal;
    }

    public void setIsHorizontal(boolean isHorizontal) {
            if(isHorizontal == true)
        this.isHorizontal = isHorizontal;
    }
    
    private event e;
    CoverEvent( event e )
    {
        this.e = e ;
    }

    boolean getIsVertical() {
        throw new UnsupportedOperationException("Not supported yet."); }

    boolean getIsHorizontal() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

   
}
    

