package javaejercicio18;

public class JavaEjercicio18 {

    public static void main(String[] args) {
        
        int dimension = 4;
        int [][] matriz = new int [dimension][dimension];
        
        llenarMatriz(matriz, dimension);
        mostrarMatriz(matriz, dimension);
        System.out.println("-----------------");
        mostrarTranspuesta(matriz, dimension);
        
    }
        
    public static void llenarMatriz (int [][] matriz, int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {            
                matriz[i][j] = (int) (Math.random() * 10);                
            }     
        }
    }
        
    public static void mostrarMatriz (int [][] matriz, int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");            
        }
    }
    
    public static void mostrarTranspuesta (int [][] matriz, int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");            
        }
    }
    
}
