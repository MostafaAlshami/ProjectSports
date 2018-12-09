/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompetitionGame;
import Entertainer.Admini;
import Entertainer.Spectator;
import GUI.GLogin;
import GUI.MainMenu;
import GUI.Administrator;
import GUI.Registeration;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;



/**
 *
 * @author Mostafa
 */
public class ProjectSports {

    /**
     *
     */
    public static ArrayList<Admini> Ad = new ArrayList<>();
    public static ArrayList<Spectator> guest = new ArrayList<>();
    public static HashMap<String,Admini> hashadmin =new HashMap<String,Admini>();
    public static HashMap<String,Spectator> hashguest =new HashMap<String,Spectator>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        MainMenu x= new MainMenu("MainMenu ");
        Administrator Admin= new Administrator();
        GLogin i= new GLogin();
        Registeration Regis= new Registeration("Registiration Menu");
        x.setVisible(true);
        i.setVisible(true);
        Regis.setVisible(true);
        Admin.setVisible(true);
        
        

        
        
        
        
/**
 *      


    /**
     * @param args the command line arguments
     */
    /*@SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args)  {
      
    CoverEvent s = new CoverEvent ();
    System.out.println(s.getRadioName);
        System.out.println(s.getTvSatellite);
    System.out.println(s.getRadioFrequency);
        System.out.println(s.getTvFrequency);
            System.out.println(s.getIsVertical);
                System.out.println(s.getIsHorizontal);
                
Date D = new Date ();
    System.out.println(D.getDay);
    System.out.println(D.getMonth);
    System.out.println(D.getYear);
    
ILogin IL = new ILogin () {};
    System.out.println(IL.getBefore);
    System.out.println(IL.getRating);
        System.out.println(IL.getYearsofExperience);

Stadium ST= new Stadium();
    System.out.println(ST.getId);
    System.out.println(ST.getName);
    System.out.println(ST.getTeam);
    System.out.println(ST.getE);
    System.out.println(ST.getR);
    System.out.println(ST.getUser);
    System.out.println(ST.getWidth);
    System.out.println(ST.getLenght);
    System.out.println(ST.getGroundType);
    System.out.println(ST.getGoalKeeper);
    


Tennis T= new Tennis ();
    System.out.println(T.getId);
    System.out.println(T.getName);
    System.out.println(T.getS);



 Time TI = new Time () {} ;
     System.out.println(TI.getMin);
          System.out.println(TI.getHr);

User U =  new User () {
        @Override
        public String username() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
Scanner x =new Scanner (System.in); 







basketBallGame BB = new basketBallGame ();
         System.out.println(BB.getId);
         System.out.println(BB.getName);
         
                System.out.println(BB.getS);
         
         

chamiopnship CH = new chamiopnship ();
         System.out.println(CH.getId);
         System.out.println(CH.getName);
         System.out.println(CH.getGroupStage);
         System.out.println(CH.getRoundof8);
         System.out.println(CH.getgetQuarterFinal);
         System.out.println(CH.getsemiFinal);
         System.out.println(CH.getFinal);
         
         
  club CU = new club ();
           System.out.println(CU.getId);
           System.out.println(CU.getProduct);
           
           
           
clubStore CS=  new clubStore()  ;

               System.out.println(CS.getId);
               System.out.println(CS.getBrand);
               System.out.println(CS.getKit);
               
               
               coach CO = new coach ();
                              System.out.println(CO.getBefore);
                              System.out.println(CO.getAfter);
                              System.out.println(CO.getRatee);


event EV = new event  ();

                              System.out.println(EV.getAddress);
                              System.out.println(EV.getDate);
                          System.out.println(EV.getTime);


fitness f= new fitness  ();
System.out.println( f.getTrainingCredit);
System.out.println( f.getHeight);
System.out.println(f.getWeight );
System.out.println(f.isNutritionSuplement );
System.out.println(f.isHealthIssues );


injury I=new injury () {};
System.out.println(I.getTypeOfInjury );
System.out.println(I.getDateOFInjurt );
System.out.println(I.getDateOfRecovery );
System.out.println( I.getMedicine);
System.out.println( I.getReport);


market m=new market ();
System.out.println(m.getProductionProductt);
System.out.println(m.getExpiredProduct );


medicalTeam mt=new medicalTeam () {};
ArrayList<String> Humandoc = new ArrayList<String>();
for  (String i : Humandoc){
    System.out.println(Humandoc);

    
}
System.out.println(mt.getDocc);
System.out.println( mt.getYearOfExp);
System.out.println( mt.getspecialty);


organizers o=new organizers ();
System.out.println(o.getname );
System.out.println( o.getBudget);


player p=new player() ;
System.out.println( p.getSport);
System.out.println( p.getGoals);


properties pr=new properties ();
System.out.println(pr.getNickName );
System.out.println(pr.getKitColor);
System.out.println(pr.getNumber);
System.out.println(pr.getRunning);


seat se=new seat ();
System.out.println(se.getId);
System.out.println(se.getTicket);


Sponsers sp=new sponsers ();
System.out.println(sp.getReport);
System.out.println(sp.getSupplies);


supplies supp=new supplies () {};
System.out.println(supp.getId);
System.out.println(supp.getName);


team te=new team (); 
System.out.println(te.getTotalGoals);
System.out.println(te.getTotalPoints);
System.out.println(te.getWin);
System.out.println(te.getLose);
System.out.println(te.getDrow);
System.out.println(te.getP);
System.out.println(te.getCoach);




ticket ti= new ticket () {
        @Override
        public void setPrice(double price) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
System.out.println(ti.getProductDate);
System.out.println(ti.getExpiredDate);
System.out.println(ti.getPrice);
System.out.println(ti.getTicket);
System.out.println(ti.getTypeTicket);




















}
    }
    
    







   */ }
    
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
