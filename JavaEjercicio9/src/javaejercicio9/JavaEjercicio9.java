package javaejercicio9;

import java.util.Scanner;

public class JavaEjercicio9 {

    public static void main(String[] args) {
                
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingrese una frase: ");
        
        if(input.nextLine().substring(0,1).equals("A")){
            
            System.out.println("Correcto!");
            
        } else {
            
            System.out.println("Incorrecto!");
        }
    }
    
}
