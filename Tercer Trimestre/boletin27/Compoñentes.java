package boletin27;

import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Compoñentes implements ActionListener{
    JFrame marco;
    JPanel panel1, panel2;
    JLabel etiqueta1, etiqueta2;
    JTextField lineatexto1, lineatexto2;
    JTextArea areatexto, areatexto2;
    JButton boton1, boton2, boton3;
    JList listaElementos;
    String lista[] = { " ElementoLista1", " ElementoLista2", " ElementoLista3"};
    
    
    public void crearCompoñentes(){
        //instanciar compoñentes
        marco = new JFrame();
        panel1 = new JPanel();
        panel2 =new JPanel();
        etiqueta1 = new JLabel("NOME");
        lineatexto1 = new JTextField();
        etiqueta2 = new JLabel("PASSWORD");
        lineatexto2 = new JTextField();
        areatexto = new JTextArea(" Area de texto");
        areatexto2 = new JTextArea(" Area de texto");
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        boton3 = new JButton("BOTON");
        listaElementos = new JList(lista);
        
        
        //Añadir propiedades
        etiqueta1.setFont(new Font("Serif", Font.PLAIN, 17));
        etiqueta2.setFont(new Font("Serif", Font.PLAIN, 17));
        boton1.setSize(100, 50);
        boton2.setSize(100, 50);
        boton3.setSize(100, 50);
        boton1.setToolTipText("PREMER");
        boton2.setToolTipText("LIMPAR");
        boton3.setToolTipText("BOTON");
        marco.setSize(650, 1300);
        panel1.setSize(600, 600);
        panel2.setSize(600, 600);
        marco.setBackground(Color.GRAY);
        areatexto.setToolTipText(" Area de texto.");
        areatexto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        areatexto2.setToolTipText(" Area de texto.");
        areatexto2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        listaElementos.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        //posiciones x e y de los complementos
        areatexto.setBounds(50, 250, 525, 200);
        etiqueta1.setBounds(200, 50, 100, 20);
        lineatexto1.setBounds(375, 50, 100, 35);
        etiqueta2.setBounds(200, 100, 100, 20);
        lineatexto2.setBounds(375, 100, 100, 35);
        boton1.setBounds(100, 475, 175, 50);
        boton2.setBounds(350, 475, 175, 50);
        listaElementos.setBounds(25, 700, 200, 200);
        boton3.setBounds(250, 770, 120, 40);
        areatexto2.setBounds(400, 700, 200, 200);
        
        
        //quitar layout automatico para que se posicione bien
        panel1.setLayout(null);
        panel2.setLayout(null);
        
        //engadimos compoñentes ao panel1 e o panel1 ao marco
        panel1.add(etiqueta1);
        panel1.add(etiqueta2);
        panel1.add(lineatexto1);
        panel1.add(lineatexto2);
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(areatexto);
        marco.add(panel1);
        
        //engadimos compoñentes ao panel2 e o panel2 ao marco
        panel2.add(areatexto2);
        panel2.add(boton3);
        panel2.add(listaElementos);
        marco.add(panel2);
        
        
        //damoslle características
        //hacerlo visible
        marco.setVisible(true);
        
        //cerrar la aplicacion al darle a la x
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //posicion del frame en medio
        marco.setLocationRelativeTo(marco);
        
        
        
        //XESTION DE EVENTOS
        boton1.addActionListener((ActionListener) this);//this porque o action performer esta na mesma clase
        boton2.addActionListener((ActionListener) this);//this porque o action performer esta na mesma clase
             
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object ob= ae.getSource();
        if(ob == boton1)
            areatexto.setText("Hola " + lineatexto1.getText() );
        else
            areatexto.setText("");
            
    }
}
