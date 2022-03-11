package boletin24;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import libreria.Libreria;
import libreria.Libro;

public class Boletin24 {

    public static void main(String[] args) {
        int opcion;
        
        Libreria obx = new Libreria();
        ArrayList<Libro> lista = new ArrayList<Libro>();
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog("***MENU ARRAY*** \n 1--> ENGADIR \n 2--> VENDER \n 3--> AMOSAR \n 4--> DAR DE BAIXA \n 5--> SAIR"));
                switch (opcion) {
                    case 1: obx.engadirLibro(lista);
                            break;
                    case 2: obx.venderLibro(lista);
                            break;
                    case 3: obx.amosar(lista);
                            break;
                    case 4: Libreria.darDeBaixa(lista);
                            break;
                    case 5: obx.sair();
                }
        }while(opcion <5);
    }
    
}
