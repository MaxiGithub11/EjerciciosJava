package javaejercicio11;

import java.util.Scanner;

public class JavaEjercicio11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int opcion;
        String salida = "";
        
        System.out.print("Ingrese primer numero: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int num2 = input.nextInt();
        
        do{
            
            System.out.println( "--------------------" + "\n" + 
                                "1. Sumar" + "\n" +
                                "2. Restar" + "\n" +
                                "3. Multiplicar" + "\n" +
                                "4. Dividir" + "\n" +
                                "5. Salir" + "\n" +
                                "--------------------" + "\n" +
                                "Elija opcion: ");
                    
            opcion = input.nextInt();
            
            switch(opcion){
            
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                    
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                    
                case 3: 
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;
                    
                case 4: 
                    System.out.println("La division es: " + (num1 / num2));
                    break;
                    
                case 5:
                    System.out.println("Estas seguro que desea salir del programa? (S/N)");
                    if(input.next().equalsIgnoreCase("S")){                    
                        salida = "S";                        
                    }
                    break;
                    
                default:
                    System.out.println("Ingresa una opcion correcta");
                    
            
            }
        
        }while(!salida.equalsIgnoreCase("S"));
        
        
    }
    
}
