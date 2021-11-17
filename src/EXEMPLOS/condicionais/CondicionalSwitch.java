package exemplo.condicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class CondicionalSwitch {
    
    public String Amosardias(String dia){
        switch(dia){
        case "Luns": System.out.println("Luns");
            break;
        case "Martes": System.out.println("Martes");
            break;
        case "Mercores": System.out.println("Mercores");
            break;
        case "Xoves": System.out.println("Xoves");
            break;
        case "Venrres": System.out.println("Venrres");
            break;
        case "Sábado": System.out.println("Sábado");
            break;
        case "Domingo": System.out.println("Domingo");
            break;
      }
    
    
    String resultado=JOptionPane.showInputDialog(null,"teclea día");
            return resultado;
}
}