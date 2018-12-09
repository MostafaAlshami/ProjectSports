/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author Mostafa
 */
public class Administrator extends JFrame{
    
    public Administrator(){
       setTitle("Administrator Menu");
        JPanel j1=new JPanel();
        this.add(j1);
      j1.setLayout(new FlowLayout());
      setBounds(800,300,500,200);
      final JButton addteam=new JButton("Add Team");
      final JButton addplayer=new JButton("Add Player");
      
              j1.add(addteam);
              j1.add(addplayer);
              
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
}
}
