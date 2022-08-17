package javaejercicio4;

import java.util.Scanner;

public class JavaEjercicio4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float grados;
        
        System.out.print("Ingrese los grados: ");
        grados = input.nextFloat();
        
        System.out.println("Grados Fahrenheit: " + (32+(9*grados)/5));
    }
    
}
