package boletin21_2;

public class Boletin21_2 {
    public static void main(String[] args) {
        int[]notas=new int[30];
        notas=MetodosArray.crearArrayInt(notas);
        MetodosArray.comprobarAprobados(notas);
        MetodosArray.notaMedia(notas);
        MetodosArray.notaAlta(notas);
    }
    
}
