package Ejercicio5;

public class Cuenta {

    private final long numCuenta;
    private long DNI;
    private double saldoActual;
    private double interesAnual;

    public Cuenta() {
        this.numCuenta = 100001;
    }

    public Cuenta(long DNI, double saldoActual, double interesAnual) {
        this.numCuenta = 100001;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    public long getDNI() {
        return DNI;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public void actualizarSaldo(double saldo) {
        this.saldoActual += (this.interesAnual / 365);
    }

    public void ingresar(double saldo) {
        this.saldoActual += saldo;
    }

    public double retirar(double cantidad) {
        if (this.getSaldoActual() > cantidad) {
            this.saldoActual -= cantidad;
            return cantidad;
        }
        return 0.0;
    }
}
