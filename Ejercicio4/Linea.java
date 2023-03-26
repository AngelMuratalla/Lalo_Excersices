package Ejercicio4;

public class Linea {

    private Punto _puntoA;
    private Punto _puntoB;

    public Linea() {
        this._puntoA = new Punto();
        this._puntoB = new Punto();
    }

    public Linea(Punto puntoA, Punto puntoB) {
        this._puntoA = puntoA;
        this._puntoB = puntoB;
    }
    
    public void moverDerecha(double n){
        this._puntoA.setX(this._puntoA.getX() + n);
        this._puntoB.setX(this._puntoB.getX() + n);
    }
    
    public void moverIzquierda(double n){
        this._puntoA.setX(this._puntoA.getX() - n);
        this._puntoB.setX(this._puntoB.getX() - n);
    }
    
    public void moverArriba(double n){
        this._puntoA.setY(this._puntoA.getY() + n);
        this._puntoB.setY(this._puntoB.getY() + n);
    }
    
    public void moverAbajo(double n){
        this._puntoA.setY(this._puntoA.getY() - n);
        this._puntoB.setY(this._puntoB.getY() - n);
    }

    public Punto getPuntoA() {
        return _puntoA;
    }

    public void setPuntoA(Punto _puntoA) {
        this._puntoA = _puntoA;
    }

    public Punto getPuntoB() {
        return _puntoB;
    }

    public void setPuntoB(Punto _puntoB) {
        this._puntoB = _puntoB;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", this._puntoA, this._puntoB);
    }
    
    public static void main(String[] args) {
        Linea l1 = new Linea();
        System.out.println(l1);
    }
}
