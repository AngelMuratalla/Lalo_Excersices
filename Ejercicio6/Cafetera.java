package Ejercicio6;

public class Cafetera {
    //Atributos
    double capMaxima;
    double cantidadActual;

    //Constructor por defecto
    public Cafetera(){
        this.capMaxima = 1000;
        this.cantidadActual= 0;
    }

    //Constructor con capacidad maxima como parametro
    public Cafetera(double capMaxima){
        this.capMaxima = capMaxima;
        this.cantidadActual = capMaxima;
    }

    /*
    
    Pedir algo como parametro
    
    public void metodo( [tipo] nombre ){
        
    }
    
    */

}
