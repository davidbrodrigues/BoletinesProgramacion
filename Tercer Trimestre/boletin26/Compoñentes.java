package boletin26;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Compoñentes {
    JFrame marco;
    JPanel panel;
    JLabel etiqueta1, etiqueta2;
    JTextField lineatexto1, lineatexto2;
    JTextArea areatexto;
    JButton boton1, boton2;
    
    public void crearCompoñentes(){
        //instanciar compoñentes
        marco = new JFrame();
        panel = new JPanel();
        etiqueta1 = new JLabel("NOME");
        lineatexto1 = new JTextField();
        etiqueta2 = new JLabel("PASSWORD");
        lineatexto2 = new JTextField();
        areatexto = new JTextArea("Area de texto");
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        
        //Ñdir propiedades
    etiqueta1.setFont(new Font("Serif", Font.PLAIN, 17));
        etiqueta2.setFont(new Font("Serif", Font.PLAIN, 17));
        boton1.setSize(100, 50);
        boton2.setSize(100, 50);
        boton1.setToolTipText("PREMER");
        boton2.setToolTipText("LIMPAR");
        marco.setSize(650, 650);
        panel.setSize(600, 600);
        marco.setBackground(Color.GRAY);
        areatexto.setToolTipText("Area de texto.");
        
        
        //posiciones x e y de los complementos
        areatexto.setBounds(50, 250, 525, 200);
        etiqueta1.setBounds(200, 50, 100, 20);
        lineatexto1.setBounds(375, 50, 100, 35);
        etiqueta2.setBounds(200, 100, 100, 20);
        lineatexto2.setBounds(375, 100, 100, 35);
        boton1.setBounds(100, 475, 175, 50);
        boton2.setBounds(350, 475, 175, 50);
        
        //quitar layout automatico para que se posicione bien
        panel.setLayout(null);
        
        //engadimos compoñentes ao panel e o panel ao marco
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(lineatexto1);
        panel.add(lineatexto2);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(areatexto);
        marco.add(panel);
        
        
        //damoslle características
        //hacerlo visible
        marco.setVisible(true);
        
        //cerrar la aplicacion al darle a la x
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //posicion del frame en medio
        marco.setLocationRelativeTo(marco);
                
        
    }
}
