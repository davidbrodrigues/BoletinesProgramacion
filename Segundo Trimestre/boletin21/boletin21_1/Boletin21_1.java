package boletin21_1;

import javax.swing.JOptionPane;

public class Boletin21_1 {

    public static void main(String[] args) {
        //declarar array tamaño 6 
       int[] numeros = new int[6];
       //creamos obj
       MetodosArray obx = new MetodosArray();
       //metodos
       numeros=obx.crearArray(numeros);
       obx.mostrarArray(numeros);
    }
    
}
