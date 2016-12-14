/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareatres;

/**
 *
 * @author Clariza
 */
public class Edificio {
   private int pisos;
    private String nombre;
    private int puertas;

    //Constructor 
    public Edificio(int npisos, String nom, int npuertas) {
        pisos = npisos;
        nombre = nom;
        puertas = npuertas;
    }
//Método para obtener los pisos

    public int getPisos() {
        
        return pisos;
    }

    //Método para establecer los pisos del edificio
    public void setPisos(int nuevoPisos) {
        pisos = nuevoPisos;
    }

    //Método para obtener nombre
    public String getNombre() {
        return nombre;
    }

    //Método para establecer el nombre del edificio
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    //Método para obtener las puertas
    public int getPuertas() {
        return puertas;
    }

    //Método para establecer los pisos del edificio
    public void setPuertas(int nuevoPuertas) {
        puertas = nuevoPuertas;
    }

    public void imprimir() {
        System.out.println("Pisos: " + pisos);
        System.out.println("Nombre: " + nombre);
        System.out.println("Puertas: " + puertas);
    }

    public static void main(String[] ar) {
        Edificio edificio1;
        edificio1=new Edificio(3,"Los Laureles",24);
        edificio1.imprimir();

    }  
}
