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
public class Circulo {

    private double radio;
    double pi = 3.14;
    double area;
    double perimetro;

    public double calculaArea(double radio) {
        area = pi * radio * radio;
        return area;
    }

    public double calculaPerimetro(double radio) {
        perimetro = 2 * pi * radio;
        return perimetro;
    }

    public void imprimir() {

        System.out.println("El radio del circulo es : " + radio);
        System.out.println("Su area es: " + area);
        System.out.println("Y su circunferencia es: " + perimetro);
    }

    public static void main(String[] ar) {
        Circulo circ = new Circulo();
        circ.radio = 2.5;
        circ.calculaArea(2.5);
        circ.calculaPerimetro(2.5);
        circ.imprimir();
    }
}

/*
public class circulo{
        float radio;
        public static final double PI= 3.14159;
       
        public circulo(float radio){
            this.radio = radio;
        }
        public double area(){
            return PI*this.radio*this.radio;
        }
        public double perimetro(){
            return 2*PI*this.radio;
        }
        public circulo compara(circulo a, circulo b){
            if (a.radio>b.radio)
                return a;
            return b;
                       
        }
    }

 public static void main(String[] args) {
       
         circulo cir = new circulo((float) 3.0);
         circulo cir2 = new circulo((float) 8.0);
        System.out.println("el perimetro es "+ cir.perimetro());
       
        System.out.println("el area es "+ cir.area());
        circulo cir3 = cir.compara(cir,cir2);
        System.out.println("el mayor es "+ cir3.radio );
       
       

    }
*/