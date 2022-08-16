package javaejercicio10;

import java.util.Scanner;

public class JavaEjercicio10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int limite;
        int suma = 0;
        
        do{  
            System.out.print("Ingrese un valor entero y positivo para establecer el limite: ");
            limite = input.nextInt();
        }while(limite <= 0);
        
        do{
        
            System.out.print("Ingrese un numero: ");
            suma += input.nextInt();
            
        }while(suma <= limite);
        
        
    }
    
}
