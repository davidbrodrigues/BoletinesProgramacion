package joptionpaint;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class NewClass {
    //esto sirve para quitar el scanner
    public int leerEnteiro(){
    String resposta = JOptionPane.showInputDialog("teclea un numero enteiro");
            int num =Integer.parseInt(resposta);
            //tambien sirve e o mesmo que o de arriba ->
            //int num = Integer.parseInt(JOptionPane.showInputDialog("teclea numero"))
            return num;
    }
}
