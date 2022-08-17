package javaejercicio21;

public class JavaEjercicio21 {

    public static void main(String[] args) {
        
        int [][] matrizM = new int[10][10];        
        int [][] matrizP = new int[3][3];
        
        boolean condition = false;
        int auxI = 0;
        int auxJ = 0;
        
        int dimensionM = 10, dimensionP = 3;        
        
        llenarMatriz (matrizM, dimensionM);
        mostrarMatriz (matrizM, dimensionM);
        
        //llenado automatico de la matrizP        
        /* llenarMatriz (matrizP, dimensionP);
        mostrarMatriz (matrizP, dimensionP); */
        
        //llenado manual de la matrizP
        matrizP[0][0] = 4;        
        matrizP[0][1] = 4;        
        matrizP[0][2] = 4;        
        matrizP[1][0] = 5;        
        matrizP[1][1] = 3;        
        matrizP[1][2] = 5;        
        matrizP[2][0] = 6;        
        matrizP[2][1] = 6;        
        matrizP[2][2] = 6;        
        mostrarMatriz (matrizP, dimensionP);
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {                
                if(matrizP[0][0] == matrizM[i][j]){
                    condition = true;
                    auxI = i;
                    auxJ = j;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {                        
                            if (matrizM[i+k][j+l] != matrizP[k][l]){
                                condition = false;
                                break;
                            }
                        }
                    }
                }                
            }
        }
        
        if (condition){
            System.out.println("Las matrices coinciden y la posicion es:(" + auxI + "," + auxJ + ")");
        }else{
            System.out.println("Las matrices no condiciden");
        }
        
        
    }
    
        public static void llenarMatriz (int [][] matriz, int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {            
                matriz[i][j] = i;                
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
    
}
