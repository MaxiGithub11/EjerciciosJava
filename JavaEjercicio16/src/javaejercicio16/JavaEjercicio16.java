package javaejercicio16;

import java.util.Scanner;

public class JavaEjercicio16 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);        
        System.out.println("Ingrese tamaño de vector: ");
        int longitudVector = input.nextInt();        
        int vector [] = new int [longitudVector];   
        
        llenarVector (vector, longitudVector);
        mostrarVector (vector, longitudVector);
        
        System.out.println("Ingrese numero a buscar: ");
        int num = input.nextInt();
        
        buscarNumero(vector, longitudVector, num);
    }
    
    public static void buscarNumero(int [] vector, int longitud, int num){
        int repetidos = 0;
        for (int i = 0; i < longitud; i++) {
            if (vector[i] == num){
                System.out.println("El valor se encontro en: (" + i + ")");
                repetidos++;
            }
        }
        if (repetidos > 1){
            System.out.println("El valor se encuentra rapetido " + repetidos + " veces!");
        }else if(repetidos == 0){
            System.out.println("El valor no se encuentra en el vector");
        }
    }
    
    public static void llenarVector (int [] vector, int longitud){
        for (int i = 0; i < longitud; i++) {            
            vector[i] = (int) (Math.random() * 10);          
        }
    }
        
    public static void mostrarVector (int [] vector, int longitud){
        for (int i = 0; i < longitud; i++) {            
            System.out.print(vector[i] + " ");            
        }
        System.out.println("");
    }    
    
}
