package libreria;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private double prezo;
    private int  unidades;
//consturctor por defecto
    public Libro(){}
    
    //constructor con parámetros
    public Libro(String titulo, String autor, String isbn, double prezo, int unidades){
    
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.unidades = unidades;
    }
    
    //getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    //to string (mensaje)
    @Override
     public String toString() {
        return "Titulo:" + titulo + "- Autor:" + autor + "ISBN:" + isbn + "Prezo:" + prezo + "Unidades:" + unidades ;
    }
    
    //equals del ISBN (comparador)
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return true;
    }
    
     
    
    

}
