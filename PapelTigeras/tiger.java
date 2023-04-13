package PapelTigeras;

import java.security.SecureRandom;
import java.util.Scanner;

public class tiger {

    static String[] opciones = {"Tijera","Papel","Piedra"};

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ELige una opción: ");
        System.out.println("1. Tijera ");
        System.out.println("2. Papel ");
        System.out.println("3. Piedra ");
        int eleccionUS = lector.nextInt();


        int eleccionPC  =  eleccionPC();


        ganador(eleccionUS, eleccionPC);
        
    }

    public static void ganador(int opcionUs, int opcionPc){
        if(opcionUs == 1 && opcionPc == 2){
            System.out.println("GANASTE WUU!!");
        }else if(opcionUs == 2 && opcionPc == 3){
            System.out.println("GANASTE WUU!!");
        }else if(opcionUs == 3 && opcionPc == 1){
            System.out.println("GANASTE WUU!!");
        } else {
            System.out.println("PERDISTE MAMA HUEVO GLUGLGUGLU!!");
        }
    }

    public static int eleccionPC(){
        SecureRandom aletorio = new SecureRandom();

        int eleccionPC = (int)aletorio.nextInt(3);

        if(eleccionPC == 0){
            eleccionPC++;
        }

        System.out.printf("Eleccion de la PC: %s %n", opciones[eleccionPC - 1]);
        return eleccionPC; 
    }


} 
