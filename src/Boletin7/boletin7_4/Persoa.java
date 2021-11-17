package boletin7_4;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Persoa {
String nombre1 = JOptionPane.showInputDialog("Escribe el nombre1");
String nombre2 = JOptionPane.showInputDialog("Escribe el nombre2");
String peso1 = JOptionPane.showInputDialog("Escribe el peso1");
String peso2 = JOptionPane.showInputDialog("Escribe el peso2");
public void peso(){
if (peso1>peso2){
JOptionPane.showMessageDialog(cmpnt, this, peso1, 0);
}
}
}