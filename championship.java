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
public class championship implements IUpdate{
    private int id;
    private String name;
    private String groupStage;
    private String roundOf8;
    private String quarterFinal;
    private String semiFianl;
    private String fianl;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupStage() {
        return groupStage;
    }

    public void setGroupStage(String groupStage) {
        this.groupStage = groupStage;
    }

    public String getRoundOf8() {
        return roundOf8;
    }

    public void setRoundOf8(String roundOf8) {
        this.roundOf8 = roundOf8;
    }

    public String getQuarterFinal() {
        return quarterFinal;
    }

    public void setQuarterFinal(String quarterFinal) {
        this.quarterFinal = quarterFinal;
    }

    public String getSemiFianl() {
        return semiFianl;
    }

    public void setSemiFianl(String semiFianl) {
        this.semiFianl = semiFianl;
    }

    public String getFianl() {
        return fianl;
    }

    public void setFianl(String fianl) {
        this.fianl = fianl;
    }

    public float profit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float lost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

