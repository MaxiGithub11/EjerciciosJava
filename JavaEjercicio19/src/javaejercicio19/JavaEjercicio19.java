package javaejercicio19;

public class JavaEjercicio19 {

    public static void main(String[] args) {
        
        int dimension = 3;
        int [][] matriz = new int [dimension][dimension];
        int [][] matrizB = new int [dimension][dimension];
        
        llenarMatriz(matriz, dimension);
        mostrarMatriz(matriz, dimension);
        generarTranspuesta(matriz, matrizB, dimension);
        mostrarMatriz(matrizB, dimension);
        
        
        if(compararMatriz(matriz,matrizB, dimension)){
            System.out.println("La matriz B es antisimetrica de A");
        } else {
            System.out.println("No hay anti simetria");
        }
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
    
    public static boolean compararMatriz (int [][] matriz,int [][] matrizB,  int dimension){
        boolean esAntisimetrica = true;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if ((matriz[j][i])*-1 != matrizB[i][j]){
                    esAntisimetrica = false;
                    break;
                }
            }         
        }
        return esAntisimetrica;
    }
    
    public static void generarTranspuesta (int [][] matrizA, int [][] matrizB, int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrizB[i][j] = matrizA [j][i];
                matrizB[i][j] *= -1;
            }           
        }
    }
    
    
}
