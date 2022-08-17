/* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos). */

package javaejercicio17;

import java.util.Scanner;

public class JavaEjercicio17 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int cantidadDigitos, uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
        
        System.out.println("Ingrese longitud del vector");
        int longitudVector = input.nextInt();
        
        int vector [] = new int [longitudVector];
        
        llenarVector(vector, longitudVector);
        vector[3] = 0;
        mostrarVector(vector, longitudVector);
        
        for (int i = 0; i < longitudVector; i++) {
            if(vector[i] == 0) vector[i]++;
            cantidadDigitos = (int) Math.floor(Math.log10(Math.abs(vector[i])) + 1);
            switch(cantidadDigitos){            
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;            
            }
        }
        
        System.out.println("Un digito: " + uno);
        System.out.println("Dos digitos: " + dos);
        System.out.println("Tres digitos: " + tres);
        System.out.println("Cuatro digitos: " + cuatro);
        System.out.println("Cinco digitos: " + cinco);
        
    }
    
    public static void llenarVector (int [] vector, int longitud){
        for (int i = 0; i < longitud; i++) {            
            vector[i] = (int) (Math.floor(Math.random() * (99999-1+1)) + 1);          
        }
    }
        
    public static void mostrarVector (int [] vector, int longitud){
        for (int i = 0; i < longitud; i++) {            
            System.out.print(vector[i] + " ");            
        }
        System.out.println("");
    }   
       
}
