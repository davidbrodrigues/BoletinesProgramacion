package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Sueldos {
    public Sueldos(){
    }
    public void calculos(){
    int nTrab=0, nSueldoRango=0, nMenorMil=0;
    float porcentaje=0;
    double sueldo=1;
    while(sueldo !=0) {
    sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca sueldo: "));
    if(sueldo!=0) {
    nTrab++;
    System.out.println("sueldo");
    }
    if(sueldo>=1000&&sueldo<=1750) {
    nSueldoRango++;
    }else if(sueldo<1000){
        nMenorMil++;
        porcentaje=(100/nTrab)*nMenorMil;
            }
    }
    JOptionPane.showMessageDialog(null, "Salarios entre 1000 e 1750€ = " +nSueldoRango+ "porcentaxe de traballadores que ganan menos de 1000€ : " +porcentaje);
    }
}
