package boletin21_3;
public class Boletin21_3 {

    public static void main(String[] args) {
         String[]nombres=new String[5];
        int[]notas=new int[5];
        nombres=Metodos.crearArrayString(nombres);
        notas=Metodos.crearArrayInt(notas);
        Metodos.visualizarAprobados(nombres, notas);
        Metodos.ordenarAlumnos(nombres, notas);
//        Metodos.comprobarAprobados(notas);
//        Metodos.notaMedia(notas);
//        Metodos.notaAlta(notas);
    }
    
}
