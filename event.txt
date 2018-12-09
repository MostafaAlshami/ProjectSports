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
public class event {
    private String address;
    private Refree r;
    private Organizers o;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        int id;
        String name ;
        String Street;
        this.address = address;
    }

    public Refree getR() {
        return r;
    }

    public void setR(Refree r) {
        this.r = r;
    }


    public Organizers getO() {
        return o;
    }

    public void setO(Organizers o) {
        this.o = o;
    }

    public event(String address, Refree r, Organizers o) {
        this.address = address;
        this.r = r;
        this.o = o;
    }
    
    event( Refree r )
    {
        this.r = r;
    }
   event( Organizers o )
    {
        this.o = o;
    }
    
}
