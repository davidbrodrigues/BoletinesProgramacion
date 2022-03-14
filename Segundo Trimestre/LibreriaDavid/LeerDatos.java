package LibreriaDavid;
import javax.swing.JOptionPane;

public class LeerDatos {
    
     public static float leerFloat(String mensaxe){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
    }
     
    public static int leerInt(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static String leerString(String mensaxe){
        return (JOptionPane.showInputDialog(mensaxe));
    }
    
}
