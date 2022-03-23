
package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Garaxe {
    private int numeroCoches, numeroPlazas = 5; 
    private String matricula;
    private long horaEntrada, horaSalida, horas;
    private double precio, cantidadIntroducida, cambio;

    public Garaxe() {
    }
    public void aparcar() {
        if(numeroPlazas == 0){
            JOptionPane.showMessageDialog(null, "COMPLETO");
        }else{
            JOptionPane.showMessageDialog(null, "Hay sitios dispoñibles");
            matricula = JOptionPane.showInputDialog(null, "Escriba a matricula");
            numeroCoches ++; 
            numeroPlazas --;
            horaEntrada = System.currentTimeMillis() /1000 /60 /60; 
        }
    }
    
    
    public void retirar(){
        if(numeroPlazas == 5){
            JOptionPane.showMessageDialog(null, "Non hai coches");
        }else{
            horaSalida = System.currentTimeMillis() /1000 /60 /60; 
            if((horaSalida - horaEntrada)< 3){
                precio = 1.5;
            }else{
                horas = (horaSalida - horaEntrada) - 3;
                Math.floor(horas);
                precio = 1.5 + (0.2 * horas);
            }
            cantidadIntroducida = Double.parseDouble(JOptionPane.showInputDialog(null, "INTRODUZA PAGO"));
            while(cantidadIntroducida < precio){
                JOptionPane.showMessageDialog(null, "PAGO INSUFICIENTE");
            }
            cambio = cantidadIntroducida - precio;
            JOptionPane.showMessageDialog(null, "FACTURA\nMATRICULA COCHE: " + matricula + "\nTIEMPO: " + (horaSalida - horaEntrada) + "\nPRECIO: " + precio + "\nDINERO RECIBIDO: " + cantidadIntroducida + "\nDINERO DEVUELTO: " + cambio);
            
            
            numeroPlazas++;
            numeroCoches--;
            
        }
        
    }
    
    
    public void programa(){
        int eleccion; 
        String[] opciones = {"Aparcar", "Retirar", "Salir"}; 
            eleccion = JOptionPane.showOptionDialog(null, "¿Que queres facer?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);
       
        while (eleccion <= 1){ 
            switch(eleccion){
                case 0:
                    aparcar();
                    eleccion = JOptionPane.showOptionDialog(null, "¿Que queres facer?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);
                    break;
                case 1:
                    retirar();
                    eleccion = JOptionPane.showOptionDialog(null, "¿Que queres facer?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);
                    break;
                
            }
        }
    }
}
