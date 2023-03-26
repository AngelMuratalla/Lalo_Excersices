
package Ejercicio15;

public class ProbabilidadCalculos {
    private final double[] numeros;
    
    public ProbabilidadCalculos(){
        numeros = rellenar();
    }
    
    public final double[] rellenar(){
        double[] salida = new double[30];
        for (int i = 0; i < salida.length; i++) {
            salida[i] = Math.random() * 10;
        }
        return salida;
    }
    
    public double media(){
        double sumatoria = 0;
        for (int i = 0; i < this.numeros.length; i++) {
            sumatoria += this.numeros[i];
        }
        return sumatoria/this.numeros.length;
    }
    
    public double desviacion(){
        double media = media();
        double sumatoria = 0;
        for (int i = 0; i < this.numeros.length; i++) {
            sumatoria += Math.pow(this.numeros[i] - media, 2);
        }
        return Math.sqrt(sumatoria/(this.numeros.length - 1));
    }
}
