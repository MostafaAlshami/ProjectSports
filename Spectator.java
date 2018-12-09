/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entertainer;

import CompetitionGame.ProjectSports;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public abstract class Spectator implements ILogin,Serializable {
   
    private String username;
    private String password;
    private String position;

    Spectator(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Spectator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String username() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String password() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean LoginIn(String username, String password) {
       for (String i:ProjectSports.hashguest.keySet())
{
    if(username.equals(i))
    {
        if(password.equals(ProjectSports.hashguest.get(i)))
            return true;
    }

}
return false;
    }
    
    public boolean Writingintofile () throws IOException{
    try {
        ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("C:\\project"));
        OOS.writeObject(ProjectSports.guest);
        OOS.close();
        return true;
    }
         catch(IOException ex){
        return false;
    }
    }
    public boolean Readingfromfile() throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("C:\\project"));
            ProjectSports.guest=(ArrayList<Spectator>) OIS.readObject();
            OIS.close();
            return true;
        }
        catch(IOException ex){
            return false;
        }
    }
    
}


