/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entertainer;

import java.io.Serializable;
import CompetitionGame.ProjectSports;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author Mostafa
 */
public abstract class Admini implements ILogin,Serializable{
      private String username;
    private String password;
    private String position;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean LoginIn(String username, String password) {
       for (String i:ProjectSports.hashadmin.keySet())
{
    if(username.equals(i))
    {
        if(password.equals(ProjectSports.hashadmin.get(i)))
            return true;
    }

}
return false;
    }
    
    public boolean Writingintofile () throws IOException{
    try {
        ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("C:\\project"));
        OOS.writeObject(ProjectSports.Ad);
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
            ProjectSports.Ad=(ArrayList<Admini>) OIS.readObject();
            OIS.close();
            return true;
        }
        catch(IOException ex){
            return false;
        }
    }
    }
            
    
        
    
    

