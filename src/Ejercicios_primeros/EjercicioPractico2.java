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
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerTexto = new Scanner (System.in);
        
        //ingreso nombre
        System.out.println("Ingrese su nombre:");
        String nombre= leerTexto.nextLine();
        
        //mensaje salida
        System.out.println("Bienvenido a JAVA " + nombre);
    }
    
}
