package boletin21_2;
public class Boletin21_2 {

    public static void main(String[] args) {
             int[]notas=new int[30];
        notas=Metodos.crearArrayInt(notas);
        Metodos.comprobarAprobados(notas);
        Metodos.notaMedia(notas);
        Metodos.notaAlta(notas);
    }
    
}
