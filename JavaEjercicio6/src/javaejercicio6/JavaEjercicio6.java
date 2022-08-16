package javaejercicio6;

import java.util.Scanner;

public class JavaEjercicio6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num;
        
        System.out.print("Ingrese num: ");
        num = input.nextInt();
        
        if (num % 2 == 0){
        
            System.out.println("El numero es par");
            
        }else{
        
            System.out.println("El numero es impar");
            
        }
        
    }
    
}
