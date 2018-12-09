/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author User
 */
public class GLogin extends JFrame{
    
    private JComboBox comboPerson;
    private Container cont = getContentPane();
    private JLabel userLabel;
    private JLabel passLabel;
    private JPasswordField textPass;
    private JTextField textUser;
    private final JButton log;
    
    public GLogin()
    {
     
   
        setSize(300,300);
        setTitle ("Login");
        cont.setLayout(null);

        userLabel= new JLabel("Username: ");
        userLabel.setBounds(15 , 25 , 400 , 50);
        passLabel= new JLabel("Password: ");
        passLabel.setBounds(15, 75, 400, 50);
        
        textUser = new JTextField();
        textUser.setBounds(150, 40, 100, 20);
        
        textPass =  new JPasswordField();
        textPass.setBounds(150, 90, 100, 20);
      
        String person [] = {"Guest", "Admin", "Player", "Orgnizers"};
        comboPerson = new JComboBox(person); 
        comboPerson.setBounds(15,170,80,30);
        
        
       log=new JButton("Login");
       log.setBounds(150,170,80,30);
        
       
       
       JLabel commUser = new JLabel ("User is required");
       commUser.setBounds(148, 60, 100, 20);
       commUser.setForeground(Color.red);
       JLabel commPass= new JLabel("Password is required");
       commPass.setBounds(148, 110, 200, 20);
       commPass.setForeground(Color.red);
       
       
       
        cont.add(textPass);
        cont.add(textUser);
        cont.add(userLabel);
        cont.add(passLabel);
        cont.add(comboPerson);
        cont.add(log);
        cont.add(commPass);
        cont.add(commUser);
        
        setVisible(false);
        commUser.setVisible(false);
        commPass.setVisible(false);
        
        textUser.addFocusListener( new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {

                  if(textPass.getText().isEmpty())
                  {
                      commPass.setVisible(true);
                      commUser.setVisible(false);
                  }   
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
      
        textPass.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                if(textUser.getText().isEmpty())
                  {
                      commPass.setVisible(false);
                      commUser.setVisible(true);
                  }
            }

            @Override
            public void focusLost(FocusEvent e) {
                           
                }     
    });
                }
}
                
    
    
    

