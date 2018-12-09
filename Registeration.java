/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.util.Calendar;
import javax.swing.JLabel;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Registeration extends JFrame{    
   private JFrame frame;
   private JLabel labelFirst;
   private JLabel labelLast;
   private JLabel labelsex;
   private JLabel labeldob;
   private JLabel labelday;
   private JLabel labelmonth;
   private JLabel labelyear;
   private JLabel labelPhonenumb;
   private JLabel labelemail;
   private JTextField textfield_First;
   private JTextField textField_Last;
   private JTextField textfieldphonenumb;
   private JTextField textfieldemail;
   private JCheckBox checkmale;
   private JCheckBox checkFemale;
   private JComboBox combomonth;
   private JComboBox comboyear;
   private JComboBox comboday;
   private JRadioButton male; 
   private JRadioButton female; 
   private final JButton reg;

   ButtonGroup Gender = new ButtonGroup(); 	
   
   
   private  Container cont = getContentPane();

   
   @SuppressWarnings("empty-statement")
        public Registeration (String Registeration)
        {
            setSize(380,400);
            setTitle(Registeration);
            cont.setLayout(null);
            labelFirst = new JLabel("First Name");
            labelFirst.setBounds(15,15,200,60);
            labelLast = new JLabel("Last Name");
            labelLast.setBounds(15, 50 ,200,60);
            labelsex = new JLabel("Gender");
            labelsex.setBounds(15,95 ,200,60);
            labelday = new JLabel("Day");
            labelday.setBounds(250, 140 , 200, 60);
            labelmonth= new JLabel("Month");
            labelmonth.setBounds(130, 140 , 200, 60);
            labelyear = new JLabel ("Year");
            labelyear.setBounds(15, 140 , 200, 60);
            labelPhonenumb = new JLabel("Phone");
            labelPhonenumb.setBounds(15, 190, 200, 60);
            labelemail = new JLabel("E-mail");
            labelemail.setBounds(15, 230, 200, 60);
           
            String Days [] = { "1" , "2" , "3" , "4" , "5" , "6" , "7 ", "8" , "9" , "10" , "11" , "12" , "13" , "14" , "15" ,  "16" , "17" , "18" , "19" , "20" , "21" , "22" , "23" , "24" , "25" , "26" , "27" , "28" , "29" , "30" , "31"};    
            String months [] = {"Jan" , "Feb" , "Mar" , "April" ,"May" ,"June" , "July" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec" }; 
            String Years [] = {"2018","2017","2016","2015","2014","2013","2012", "2011", "2010", "2009" ,"2008", "2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990","1989","1988"};
            
            textfield_First = new JTextField ();
            textfield_First.setBounds(95, 30 , 200, 22);
            textField_Last = new JTextField ();
            textField_Last.setBounds(95, 70 , 200, 22);
            
            
            textfieldphonenumb = new JTextField();
            textfieldphonenumb.setBounds(105, 210 , 100, 21);
                if (textfieldphonenumb.getText().length() ==11)
                {
                    JOptionPane.showMessageDialog(this,"invalid number");
            
                }
                   
            textfieldemail = new JTextField();
            textfieldemail.setBounds (105, 250 , 200, 21);
            
            
            combomonth = new JComboBox(months);
            combomonth.setBounds(175,155,55,30);
            comboyear = new JComboBox (Years);
            comboyear.setBounds(50,155,55,30);
            comboday = new JComboBox(Days);
            comboday.setBounds(280,155,45,30);
               
               
               
            male=new JRadioButton("Male");
            male.setBounds(90,100 ,80,50);
            female=new JRadioButton("Female");
            female.setBounds(200,95 ,80,60);
            
            
            
            
             reg=new JButton("Register");
             reg.setBounds(250,300,90,30);
            
	
              
              
                    cont.add(labelFirst);
                    cont.add(labelLast);
                    cont.add(labelsex);
                    cont.add(labelday);
                    cont.add(labelmonth);
                    cont.add(labelyear);
                    cont.add(labelPhonenumb);
                    cont.add(labelemail);
                    cont.add(textfield_First);
                    cont.add(textField_Last);
                    cont.add(combomonth);
                    cont.add(comboyear);
                    cont.add(comboday);
                    cont.add(male);
                    cont.add(female);
                    cont.add(textfieldphonenumb);
                    cont.add(textfieldemail);
                    cont.add(reg);
                    Gender.add(male);
	            Gender.add(female); 
                    
        }    
}
