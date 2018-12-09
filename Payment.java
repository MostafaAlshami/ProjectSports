/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Payment extends JFrame {
   private JFrame frame;
   private JLabel creditLabel;
   //private JLabel cashLabel;
   private JTextField creditText;
   private JTextField cashText;
   private JRadioButton Cash; 
   private JRadioButton Credit; 
   private JLabel payment;
   private JComboBox creditType; 
   private JButton done;
   ButtonGroup Ways = new ButtonGroup(); 	

   private  Container cont = getContentPane();
   
   
       public Payment (String Payment)
       {
           this.setSize(400, 300); 
           setTitle(Payment);
           cont.setLayout(null);
        
         
       creditLabel = new JLabel ();
       creditLabel.setBounds(40 ,100, 350, 350);
      
       
       creditText = new JTextField();
       creditText.setBounds(115, 60, 150, 30);
       
       
       JRadioButton Cash = new JRadioButton ("Cash" ,false);
       Cash.setBounds(20, 90, 90, 90);
       JRadioButton Credit = new JRadioButton("Credit" ,true );
       Credit.setBounds(20, 30, 90, 90);
       Ways.add(Cash);
       Ways.add(Credit);
       
       String creditTypes[] ={"Master Card ","CIB","HSBC","QNB", "CNB","NBD","ATM"};
       creditType= new JComboBox(creditTypes);
       creditType.setBounds(280, 50, 100, 50);
      
       done = new JButton ("Done");
       done.setBounds(260, 175, 100, 50);
    
       
       
       payment = new JLabel("pay");
       payment.setBounds(30,40 ,40,30);
        
       
                    cont.add(creditLabel);
                    cont.add(creditText);
                    cont.add(creditType);
                    cont.add(Cash);
                    //cont.add(cashLabel);
                    // cont.add(cashText);
                    cont.add(Credit);
                    //payment.add(Cash);
                    //payment.add(Credit);
                    cont.add(done);
                    
       }

}
