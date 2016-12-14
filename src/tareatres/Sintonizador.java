/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareatres;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Clariza
 */
public class Sintonizador {

    public double frec = 80.0;
    
    public double subir() {
                if (frec + 0.5 > 108) {
            frec = 80;
        } else {
            frec = frec + 0.5;
        }
                System.out.println("Usted escucha la frecuencia"+frec);
        return frec;
    }

    public double bajar() {
        if (frec - 0.5 < 80) {
            frec = 108;
        } else {
            frec = frec - 0.5;
        }
        System.out.println("Usted escucha la frecuencia"+frec);
        return frec;
    }

    public void display() {
        System.out.println("Usted escucha la frecuencia"+frec);       
               
       ;
    }

    public static void main(String[] args) {
             Scanner resp = new Scanner(System.in);
        Sintonizador sintoniza = new Sintonizador();
             sintoniza.display();
       //  resp.nextLine();
           System.out.println("Desea bajar la frecuencia? (s/n)");
          String opc;
        opc = resp.nextLine();

        if (Objects.equals(opc, "s")){
        sintoniza.subir();}
        else
        {sintoniza.bajar();
    }
    }

}