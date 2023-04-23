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

/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
*/
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros para sumar:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
                
        //hago las cuentas
        int suma = num1 + num2;
        
        System.out.println("El resultado de la suma es:" + suma);
    }
    
}