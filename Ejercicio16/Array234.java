
package Ejercicio16;

public class Array234 {
    private double[][][] array = new double[2][3][4];
    
    public Array234(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    this.array[i][j][k] = Math.random() * 10;
                }
            }
        }
    }
    
    public void max_min(){
        double mayor = Double.MIN_VALUE;
        int[] indiceMayor = new int[3];
        double menor = Double.MAX_VALUE;
        int[] indiceMenor = new int[3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    if (this.array[i][j][k] > mayor) {
                        mayor = this.array[i][j][k];
                        indiceMayor[0] = i;
                        indiceMayor[1] = k;
                        indiceMayor[2] = j;
                    }
                    if (this.array[i][j][k] < menor) {
                        menor = this.array[i][j][k];
                        indiceMenor[0] = i;
                        indiceMenor[1] = k;
                        indiceMenor[2] = j;
                    }
                }
            }
        }
        System.out.printf("Mayor: %f    Indice: [%d,%d,%d] %n", mayor, indiceMayor[0], indiceMayor[1], indiceMayor[2]);
        System.out.printf("Menor: %f    Indice: [%d,%d,%d] %n", menor, indiceMenor[0], indiceMenor[1], indiceMenor[2]);
    }
    
    public void imprimir(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.printf("%.4f  ", array[i][j][k]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Array234 ar2 = new Array234();
        ar2.max_min();
        ar2.imprimir();
    }
}
