
package Ejercicio12;

public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion(){
        this.titulo = "";
        this.autor = "";
    }
    
    public Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String dameAutor() {
        return autor;
    }

    public void ponAutor(String autor) {
        this.autor = autor;
    }

    public String dameTitulo() {
        return titulo;
    }

    public void ponTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
