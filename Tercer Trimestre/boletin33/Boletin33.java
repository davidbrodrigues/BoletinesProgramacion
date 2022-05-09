package boletin33;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin33 {
    public static void main(String[] args) {
        
        ArrayList <Integer> listaInt = new ArrayList <>();
        listaInt.add(3);
        listaInt.add(16);
        listaInt.add(9);
        listaInt.add(23);
        XenericaOperacions obj = new XenericaOperacions();
        int op;
 do{
            op = Integer.parseInt(JOptionPane.showInputDialog("----- MENU -----\n1. Menor\n2. Maior\n3. Buscar\n4. Borrar\n5. Cerrar"));
            switch(op){
                case 1 : obj.calcularMenor(listaInt);
                break;
                case 2 : obj.calcularMaior(listaInt);
                break;
                case 3 : obj.buscarObxeto(listaInt);
                break;
                case 4 : obj.borrar(listaInt);
                break;
                case 5 : System.exit(0);
                break;
            }
        }while(op != 0);
        
    }
    
}
