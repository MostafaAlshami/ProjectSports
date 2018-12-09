/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ //// 
package GUI;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

  /* @author User*/
 
public class MainMenu extends JFrame{
    
    private final JButton[] buttons = new JButton[6];
    private  Container cont = getContentPane(); 
    
    public MainMenu  (String Menu){
  
        
        setSize(600,600);
        setTitle(Menu);
        cont.setLayout(null);
        JButton Login= new JButton("Login");
        Login.setBounds(100,50,375,60);
        JButton Registration= new JButton("Registration");
        Registration.setBounds(100,200,375,60);
        
        JButton Payment= new JButton("Pay");
        Payment.setBounds(100,250,375,60);
        cont.add(Payment);
        
        JButton Exit= new JButton("Exit");
        Exit.setBounds(100,350,375,60);
        
        cont.add(Login);
        cont.add(Exit);
        cont.add(Registration);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        Login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                GLogin log = new GLogin();
                log.setVisible(true);
                setVisible(false);
              
            }
        });
        
        Registration.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Registeration reg = new Registeration(" Registeration ");
                reg.setVisible(true);
                setVisible(false);
            }
        } );
    Payment.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Payment pay = new Payment("Pay");
                pay.setVisible(true);
                setVisible(false);
              
            }
        });
        
        Registration.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Registeration reg = new Registeration(" Registeration ");
                reg.setVisible(true);
                setVisible(false);
            }
        } );     
}
}
