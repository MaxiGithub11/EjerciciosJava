package javaejercicio1;

import java.util.Scanner;

public class JavaEjercicio1 {
    
    public static void main(String[] args) {
        
        int num1, num2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese primer numero: ");
        num1 = input.nextInt();        
        System.out.print("Ingrese segundo numero: ");
        num2 = input.nextInt();
        
        System.out.println("La suma es: " + (num1 + num2));
        
    }
    
}
