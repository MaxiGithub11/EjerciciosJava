package javaejercicio15;

public class JavaEjercicio15 {

    public static void main(String[] args) {
        
        int [] vector = new int [100];
        
        llenarVector(vector);
        mostrarVector(vector);
        
    }
    
    public static void llenarVector (int [] vector){

        for (int i = 0; i < 100; i++) {
            
            vector[i] = i;
            
        }
    }
        
    public static void mostrarVector (int [] vector){

        for (int i = 99; i >= 0; i--) {
            
            System.out.print(vector[i] + " ");
            
        }

    }
    
}
