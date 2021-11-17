package boletin4;

/**
 *
 * @author david
 */
public class libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    //constructores
    public libro() {
    }
    public libro(String titulo, String aut, int a, short nump) {
        this.titulo = titulo;
        autor = aut;
        ano = a;
        numPaginas = nump;
    }
     public String gettitulo() {
         return titulo;
     }
    public void settitulo() {
        this.titulo = titulo;
    }
    public String getautor() {
        return autor;
    }
    public void setautor() {
        this.autor = autor;
    }
    public int getano() {
        return ano;
    }
    public void setano() {
        this.ano = ano;
    }
    public short getnumPaginas() {
        return numPaginas;
    }
    public void setnumPaginas() {
        this.numPaginas = numPaginas;
    }
    public float getvaloracion() {
        return valoracion;
    }
    public void setvaloracion() {
        this.valoracion = valoracion;
    }
    public void amosar() {
        System.out.println("titulo: "+ titulo + "\n autor: "+ autor + "\n ano: "+ ano + "\n Numero de paxinas: "+ numPaginas + "\n valorcion: "+ valoracion);
    }
    public void amosar2(String titulo, String autor) {
        System.out.println("titulo: "+ titulo + "\n autor: "+ autor + "\n ano: "+ ano + "\n Numero de paxinas: "+ numPaginas + "\n valorcion: "+ valoracion);
    }
}
