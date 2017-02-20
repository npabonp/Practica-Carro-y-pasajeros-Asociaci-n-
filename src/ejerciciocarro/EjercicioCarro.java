
package ejerciciocarro;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class EjercicioCarro {

    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
//Creando 
    System.out.println("Nombre del pasajero 1");
        String nombrePasajero1 =teclado.next();
    System.out.println("Apellido del pasajero 1");
        String apellidoPasajero1 =teclado.next();
        
    System.out.println("Nombre del pasajero 2");
        String nombrePasajero2 =teclado.next();
    System.out.println("Apellido del pasajero 2");
        String apellidoPasajero2 =teclado.next();
        
    System.out.println("Nombre del conductor");
        String nombreConductor =teclado.next();
    System.out.println("Apellido del conductor");
        String apellidoConductor =teclado.next();
        
//Creando los pasajeros
    Persona pasajero1 = new Persona (nombrePasajero1, apellidoPasajero1);
    Persona pasajero2 = new Persona (nombrePasajero2, apellidoPasajero2);
    Persona conductor = new Persona (nombreConductor, apellidoConductor);    
        
// Creando el carrooo
    Carro Ferrari = new Carro();
        Ferrari.setPassanger(pasajero1);
        Ferrari.setOtherPassanger(pasajero2);
        Ferrari.setDriver(conductor);
    
        System.out.println("Los pasajeros son");
        String[] nombres = Ferrari.getPassangers();
        for(int i=0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }
        System.out.println("El conductor es ");
        System.out.println(Ferrari.getDriver().getName());
    }
    
}
