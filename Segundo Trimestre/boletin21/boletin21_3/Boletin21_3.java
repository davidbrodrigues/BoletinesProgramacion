package boletin21_3;

public class Boletin21_3 {

    public static void main(String[] args) {
        String[]nombres=new String[5];
        int[]notas=new int[5];
        nombres=Metodos21_3.crearArrayString(nombres);
        notas=Metodos21_3.crearArrayInt(notas);
        Metodos21_3.visualizarAprobados(nombres, notas);
        Metodos21_3.ordenarAlumnos(nombres, notas);
//        Metodos21_3.comprobarAprobados(notas);
//        Metodos21_3.notaMedia(notas);
//        Metodos21_3.notaAlta(notas);
    }

}