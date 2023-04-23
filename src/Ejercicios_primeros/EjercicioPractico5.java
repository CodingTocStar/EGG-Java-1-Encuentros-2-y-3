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
public class EjercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre
        por pantalla el doble, el triple y la raíz cuadrada de ese número.
        Nota: investigar la función Math.sqrt().
        */
        
        Scanner leerNumero = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        int numero = leerNumero.nextInt();
        
        //calculos
        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);
        
        //muestro
        System.out.println("Su numero es: " + numero);
        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
        System.out.println("Su raiz cuadrada es: " + raizCuadrada);
                
    }
    
}
