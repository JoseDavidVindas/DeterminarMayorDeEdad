/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */
import java.util.Scanner;
public class MayorDeEdad {
      
    /**
     * Método principal que solicita al usuario ingresar la edad de una persona
     * y determina si es mayor de edad o no.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        // Se verifica si la edad ingresada es mayor o igual a 18 años.
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
    }
}
