package javaejercicio13;

import java.util.Scanner;

public class JavaEjercicio13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingrese lado: ");
        int lado = input.nextInt();
        
        for (int i = 0; i < lado; i++) {
            
            for (int j = 0; j < lado; j++) {
                
                if(i == 0 || i == lado-1 || j == 0 || j == lado-1){
                
                    System.out.print("*");
                
                }else{
                
                    System.out.print(" ");
                }
                
            }
            
            System.out.println("");
            
        }
        
        
    }
    
}
