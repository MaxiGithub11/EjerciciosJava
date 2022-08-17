package javaejercicio2;

import java.util.Scanner;

public class JavaEjercicio2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String nombre;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
        
    }
    
}
