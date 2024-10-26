/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.practic1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Practic1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner e = new Scanner(System.in);
        System.out.println("Ingresa la edad");

        int edad=e.nextInt();

        if (edad >= 0 && edad <= 120) {
            if (edad >= 0 && edad <= 12) {
                System.out.println("hola, eres un niño");
            } else if (edad >= 13 && edad <= 35) {
                System.out.println("hola, eres un joven");
            } else {
                System.out.println("hola, eres un adulto");
            }
        } else {
            System.out.println("Error");
        }

    }
}
