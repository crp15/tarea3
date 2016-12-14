/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Para correr debo hacerlo con F6 o el boton de Play
*/

package tareatres;


import static java.lang.Integer.parseInt;
import java.util.Arrays;

/**
 *
 * @author Clariza
 */
public class OrdenNumerico {

    public static void main(String[] args) {

        System.out.println("Orden numerico");
        int i;
        for (i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
//Investiguemos a ver si estan en orden
        if (parseInt(args[0]) < parseInt(args[1]))
        {if (parseInt(args[1])< parseInt(args[2])) {
            System.out.println("Las cantidades introducidas están en orden numérico ");
        } 
        }
        else {System.out.println("Las cantidades introducidas no están en orden numérico ");
            System.out.println("El orden correcto es");
            Arrays.sort(args);
            for (String s : args) {
                System.out.println(s);
            }
        }
    }
}
