package javaejercicio3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class JavaEjercicio3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        String frase; 
        
        System.out.println("Ingrese una frase: ");
        frase = input.nextLine();
        
        System.out.println("Mayuscula: " + toUpperCase(frase) + "\n" 
                         + "Minuscula: " + toLowerCase(frase));
        
    }
    
}
