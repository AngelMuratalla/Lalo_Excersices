
package Matrices;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*String[][] productos = { { "Frutas", "Uva", "Mango", "Manzana" },
                { "Lacteos", "Leche", "Queso", "Yogurt" },
                { "Verduras", "Brocoli", "Tomate", "Zanahoria" },
                { "Acompañamientos", "Mermelada", "Cajeta", "Nutella" },
                { "Dulces", "Paleta", "Chicle", "Chocolate" } };*/

        String matriz[][] = { { "Berenice", "9" },{ "Roberto", "5" },{ "Juan", "7" },{ "Guillermo", "8" },
                { "Luis", "7" },{ "Diego", "7" },{ "Armando", "10" },{ "Ignacio", "4" } };
        int key = 0;
        
                do {
                    System.out.println("Elige una opcion: ");
                    key = entrada.nextInt();
                    switch (key) {
                        case 1:
                            mayor(matriz);
                            break;
                        case 2:
                            menor(matriz);
                            break;
                        case 3:
                            pideCalificacion(matriz);
                            break;
                        case 4:
                            imprimeNombre(matriz);
                            break;
                        case 5:
                            aprobados(matriz);
                            break;
                        case 6:
                            System.out.println("Salir");
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }

                } while (key != 6);
        
        
        
        
        
        System.out.println("");
        mostrarLista(matriz);
    }

    public static void mayor(String[][] matriz) {
        int calificacion;
        int mayorCalificacion = 0;
        for (int i = 0; i < matriz.length; i++) {

            calificacion = Integer.parseInt(matriz[i][1]);

            if (calificacion > mayorCalificacion) {
                mayorCalificacion = calificacion;
            }

        }

        System.out.println("La calificacion mayor es: " + mayorCalificacion);

    }

    public static void menor(String[][] matriz) {
        int calificacion;
        int mayorCalificacion = 10;
        for (int i = 0; i < matriz.length; i++) {

            calificacion = Integer.parseInt(matriz[i][1]);

            if (calificacion < mayorCalificacion) {
                mayorCalificacion = calificacion;
            }

        }

        System.out.println("La calificacion menor es: " + mayorCalificacion);

    }

    public static void pideCalificacion(String[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        int calificacionDelUsuario = 0;
        int cantidad = 0;
        System.out.println("Ingresa una calificacion valida: ");
        calificacionDelUsuario = entrada.nextInt();


        if(calificacionDelUsuario >= 0 && calificacionDelUsuario <= 10){
             for (int i = 0; i < matriz.length; i++) {
                    if(calificacionDelUsuario == Integer.parseInt(matriz[i][1])){
                        cantidad++;
                    }
              }
                    System.out.println("Cantidad de alumnos que coinciden:  " + cantidad);
        }else{
            System.out.println("Ingresa una calificacion valida... ¡¡¡ESTUPIDO HUMANO!!!");   
        }
    }

    public static void imprimeNombre(String[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        int calificacionDelUsuario = 0;
        String nombre = " ";
        System.out.println("Ingresa una calificacion valida: ");
        calificacionDelUsuario = entrada.nextInt();


        if(calificacionDelUsuario >= 0 && calificacionDelUsuario <= 10){
             for (int i = 0; i < matriz.length; i++) {
                    if(calificacionDelUsuario == Integer.parseInt(matriz[i][1])){
                        nombre = matriz[i][0];
                        System.out.println("Nombre de los alumnos que coinciden:  " + nombre);
                    }
                    
              }
                    
        }else{
            System.out.println("Ningun alumno tiene esa calificación... ¡¡¡ESTUPIDO HUMANO!!!");   
        }
    }

    public static void aprobados(String[][] matriz) {
        //declaracion de variales 
        int aprobado = 0;
        int reprobado = 0;
        //
        for(int i = 0; i < matriz.length; i++){
            
                if(Integer.parseInt(matriz[i][1]) > 5){
                   aprobado++; 
                   
                }else{
                    reprobado++;
                    
                }
            
        }
        System.out.println("Alumnos aprobados:  " + aprobado);
        System.out.println("Alumnos reprobados:  " + reprobado);
    }

    public static void mostrarLista(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%10s", matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
