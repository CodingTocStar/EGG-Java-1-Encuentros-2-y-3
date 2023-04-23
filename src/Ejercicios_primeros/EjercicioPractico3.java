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
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas
        y después toda en minúsculas.
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        */
        
        Scanner leerTexto = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        
        String nombre = leerTexto.nextLine();
        
        //a minuscula
        String nombreMinuscula = nombre.toLowerCase();
        System.out.println("Su nombre en minuscula es: " + nombreMinuscula);
        
        //MAYUSCULA
        String nombreMayuscula = nombre.toUpperCase();
        System.out.println("Y su nombre en mayuscula es: " + nombreMayuscula);
    }
    
}
