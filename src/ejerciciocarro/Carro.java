/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocarro;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private Persona passanger;
    private Persona otherPassanger;
    private Persona Driver;

    public Persona getPassanger() {
        return passanger;
    }

    public Persona getOtherPassanger() {
        return otherPassanger;
    }

    public Persona getDriver() {
        return Driver;
    }

    public void setPassanger(Persona passanger) {
        this.passanger = passanger;
    }

    public void setOtherPassanger(Persona otherPassanger) {
        this.otherPassanger = otherPassanger;
    }

    public void setDriver(Persona Driver) {
        this.Driver = Driver;
    }
    
    String [] getPassangers (){
        String[] names = new String [2];
            names[0]=this.passanger.getName();
            names[1]=this.otherPassanger.getName();
            return names;
    }
    
}
