package javaejercicio7;

import java.util.Scanner;

public class JavaEjercicio7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = input.nextLine();
        
        if (frase.equalsIgnoreCase("Eureka")){
        
            System.out.println("Correcto!");
        
        }else {
        
            System.out.println("Incorrecto!");
        
        }
    }
    
}
