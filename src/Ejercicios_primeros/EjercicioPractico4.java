/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_primeros;

import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class EjercicioPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su
        equivalente en grados Fahrenheit. La fórmula correspondiente es:*/ 
        //F = 32 + ((9/5) * C).
                
        System.out.println("Ingrese una temperatura en grados celsius");
        
        Scanner leerTemperatura = new Scanner(System.in);
        
        double celsius = leerTemperatura.nextDouble();
        
        //calculo
        double fahrenheit = 32 + ((9.0/5.0) * celsius);
        
        //muestro
        System.out.println("Su temperatura en Fahrenheit es: " + fahrenheit);
    }
    
}
