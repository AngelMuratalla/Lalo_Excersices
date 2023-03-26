package Matrices;

public class Amplificador {
        public static void main(String[] args) {
            double R1 = 1; //1k
            double R2 = 300; //235k
            double R3 = 200; //132k
            double R4 = 15; //10k
            
            double resultado = ( R2*(R3+R4) ) / ( (R2*R4)-(R1*(R3+R4))+(R1*R4) );
            System.out.println("Ganancia: "+resultado);
        }
}
