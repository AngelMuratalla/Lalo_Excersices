package Ejercicio8;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.valida(dia, mes, anio);
    }

    public void leer(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.valida(dia, mes, anio);
    }

    public boolean bisiesto() {
        return (this.anio % 4) == 0;
    }

    public int diaMes(int mes) {
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (this.bisiesto()) {
            meses[1]++;
        }
        return meses[mes - 1];
    }

    private void valida(int dia, int mes, int anio) {
        if (!(dia >= 1 && dia <= 31)) {
            this.dia = 1;
        } 
        if (!(mes >= 1 && mes <= 12)) {
            this.mes = 1;
        }
        if (!(anio >= 1900 && anio <= 2050)) {
            this.anio = 1900;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void corta(){
        System.out.printf("%02d-%02d-%4d %n", this.dia, this.mes, this.anio);
    }
    
    private int transcurridosEnAños(){
        int diferencia = this.anio - 1900;
        int bisiestos = diferencia / 4;
        int noBisiestos = diferencia - bisiestos;
        return (noBisiestos*365) + (bisiestos*366);
    }
    
    private int transcurridosEnMeses(){
        int sumatoria = 0;
        for (int i = 1; i < this.mes - 1; i++) {
            sumatoria = this.diaMes(i);
        }
        return sumatoria;
    }
    
    public int diasTranscurridos(){
        return this.transcurridosEnAños() + this.transcurridosEnMeses() + (this.dia - 1);
    }
    
    public String diaSemana(){
        String[] dias = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        return dias[this.diasTranscurridos() % 7];
    }
   
    public void larga(){
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        System.out.printf("%s %d de %s de %d", this.diaSemana(), this.dia, meses[this.mes-1], this.anio);
    }
    
    public void fechaTras(long dias){
        Fecha aux = new Fecha();
        for (int i = 0; i < dias-1; i++) {
            aux.siguiente();
        }
        this.dia = aux.dia;
        this.mes = aux.mes;
        this.anio = aux.anio;
    }
    
    public void siguiente(){
        this.dia++;
        if (this.dia > this.diaMes(this.mes)) {
            this.dia--;
            this.mes++;
            if (this.mes > 12) {
                this.dia = 1;
                this.mes = 1;
                this.anio++;
            }
        }
    }
    
    public void anterior(){
        this.dia--;
        if (this.dia == 0) {
            this.dia++;
            this.mes--;
            if (this.mes == 0) {
                this.dia = 31;
                this.mes = 12;
                this.anio--;
            }
        }
    }
   
    public static void main(String[] args) {
       Fecha a = new Fecha(1, 1, 2010);
       System.out.println(a.diaSemana());
       System.out.println(a.diaMes(12));
       System.out.println(0%4);
       System.out.println(a.diasTranscurridos());
       a.fechaTras(2);
       a.larga();
    }

}
