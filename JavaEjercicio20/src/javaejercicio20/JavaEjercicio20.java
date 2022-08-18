package javaejercicio20;

import java.util.Scanner;

public class JavaEjercicio20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dimension = 3;
        int[][] matriz = new int[dimension][dimension];
        
        llenarMatriz (matriz, dimension);
        
        if(comprobarMagica (matriz, dimension)){
            System.out.println("La matriz es magica");
        } else {
            System.out.println("No es magica");
        }      

    }
    
    public static void llenarMatriz (int [][] matriz, int dimension){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    do {
                        System.out.println("Ingrese un numero");
                        matriz[i][j] = input.nextInt();
                    } while (matriz[i][j] < 1 || matriz[i][j] > 9);
                }
        }    
    }

    public static boolean comprobarMagica (int [][] matriz, int dimension){
        boolean esMagica = true;
        int [] vector = new int [dimension * 2 + 2];
        int sumaLinea;
        //sumo filas
        for (int i = 0; i < dimension; i++) {
            sumaLinea = 0;
            for (int j = 0; j < dimension; j++) {
                    sumaLinea += matriz[i][j];
            }
            vector[i] = sumaLinea;
        }
        //sumo columnas
        for (int i = 0; i < dimension; i++) {
            sumaLinea = 0;
            for (int j = 0; j < dimension; j++) {
                    sumaLinea += matriz[j][i];
            }
            vector[i+dimension] = sumaLinea;
        }
        //diagonal principal
        sumaLinea = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                    if (i == j) {
                        sumaLinea += matriz[i][j];
                    }
            }
        }    
        vector[dimension*2] = sumaLinea;
        //diagonal secundaria
        sumaLinea = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                    if (i + j == dimension-1) {
                        sumaLinea += matriz[i][j];
                    }
            }
        }    
        vector[dimension*2+1] = sumaLinea;
        //recorro vector
        for (int i = 0; i < dimension + 1; i++) {
            if (vector[i] != vector[i+1]){
                esMagica = false;
            }
        }
        //muestro el vector solo para demostracion
        for (int i = 0; i < dimension * 2 + 2; i++) {
            System.out.print(vector[i] + " ");
        }
        
        return esMagica;
    }
}
