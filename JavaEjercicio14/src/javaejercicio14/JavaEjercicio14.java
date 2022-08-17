/*  Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 € */

package javaejercicio14;

import java.util.Scanner;

public class JavaEjercicio14 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        int euros;
        String monedaCambio;
        
        System.out.print("Introduzca cantidad de euros: ");
        euros = input.nextInt();
        System.out.print("Ingrese moneda de cambio: ");
        monedaCambio = input.next();
        
        convertirEuros(euros, monedaCambio);
    
    }
    
    public static void convertirEuros(int euros, String monedaCambio){
    
        if (monedaCambio.equalsIgnoreCase("libras")){
        
            System.out.print("La cantidad de euros a libras es: " + (euros * 0.86) + "\n");
        
        }else if (monedaCambio.equalsIgnoreCase("dolar")){
        
            System.out.print("La cantidad de euros a dolares es: " + (euros * 1.28611 + "\n"));
            
        }else{
        
            System.out.print("La cantidad de euros a yenes es: " + (euros * 129.852 + "\n"));
        
        }   
    }
    
}
