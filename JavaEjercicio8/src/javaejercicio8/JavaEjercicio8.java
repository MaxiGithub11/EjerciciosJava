package javaejercicio8;

import java.util.Scanner;

public class JavaEjercicio8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingrese una frase de 8 letras: ");
        
        if(input.nextLine().length() == 8){
        
            System.out.println("Correcto!");
        
        } else {
        
            System.out.println("Incorrecto!");
        }
        
    }
    
}
