package boletin8_2;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
class Superficie {
    private float lado;
    private float base;
    private float altura;
    private float radio;
    private int opcion;
    public void Menu(){
        opcion= Integer.parseInt(JOptionPane.showInputDialog("AREAS \n 1.CUADRADO \n 2.TRIANGULO \n 3.CIRCULO "));

        switch (opcion){
            case 1:{
                lado= Integer.parseInt(JOptionPane.showInputDialog("lado do cadrado"));
                JOptionPane.showMessageDialog(null, "o área é: " + lado*lado);
                break;
            }
            case 2: {
                base= Integer.parseInt(JOptionPane.showInputDialog("base do triangulo"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("a altura do triangulo:"));
                JOptionPane.showMessageDialog(null, "o área é: " + (base*altura)/2);
                break;
            }
            case 3: {
                radio=Integer.parseInt(JOptionPane.showInputDialog("radio da circunferencia"));
                JOptionPane.showMessageDialog(null,"o área é: " + 3.14*(radio*radio));
                break;
            }
        }
    }
}
