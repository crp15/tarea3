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
public class Estudiante {
   //Atributos de la clase
    private String matricula;
    private String nombre;
    private String carrera;
    private int edad;
    
    //Constructor 

    /**
     *
     * @param mat
     * @param nom
     * @param carr
     * @param ed
         */
    public Estudiante(String mat, String nom, String carr, int ed) {
        matricula = mat;
        nombre = nom;
        carrera = carr;
        edad = ed;
        
    }

    //Métodos de la clase	
    public static void main(String[] args) {
        //Creamos un objeto con constructor
        //Establecemos los valores de los atributos usando métodos set de cada uno
        Estudiante e1 = new Estudiante("1981-0151", "Clariza", "ISC", 45);
        Estudiante e2 = new Estudiante("1982-0152", "Joan", "IC", 25);
        Estudiante e3 = new Estudiante("1983-0153", "Manuel", "Adm", 46);
        Estudiante e4 = new Estudiante("1998-0141", "Diego", "PSI", 45);
        Estudiante e5 = new Estudiante("1991-0651", "Carmen", "Edu", 38);

        System.out.println(e1.matricula + ", " + e1.nombre + ", " + e1.carrera + ", " + e1.edad );//Mostramos el valor de los atributos de e1
        System.out.println(e2.matricula + ", " + e2.nombre + ", " + e2.carrera + ", " + e2.edad );
        System.out.println(e3.matricula + ", " + e3.nombre + ", " + e3.carrera + ", " + e3.edad );
        System.out.println(e4.matricula + ", " + e4.nombre + ", " + e4.carrera + ", " + e4.edad );
        System.out.println(e5.matricula + ", " + e5.nombre + ", " + e5.carrera + ", " + e5.edad );
    }  
}
