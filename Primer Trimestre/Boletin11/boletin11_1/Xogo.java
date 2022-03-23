package boletin11_1;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Xogo {
    private int numIntroducir, intento, numAdiviñar, partida= 0;

    public Xogo() {
    }

    public void xogador1() {
        int intentos;
        int numAdivinar1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Xogador 1 Introduce un numero entre 1 e 50."));
        while (numAdivinar1 < 1 || numAdivinar1 > 50) {
            numAdivinar1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Xogador 1 Introduce un numero entre 1 e 50."));
        }
        numAdiviñar = numAdivinar1;
        intentos = Integer.parseInt(JOptionPane.showInputDialog(null, "Intentos limitados"));
        intento = intentos;
    }

    public void xogador2() {
        int numIntro1, intentos1;
        for (intentos1 = 1; intentos1 <= intento; intentos1++) {
            numIntro1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Xogadro 2 Introduce un numero"));
            while (numIntro1 < 1 || numIntro1 > 50) {
                numIntro1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Xogador 2 Introduce un numero entre 1 e 50."));
            }
            if (numIntro1 > numAdiviñar) {
                JOptionPane.showMessageDialog(null, "O numero e menor.");
            } else if (numIntro1 < numAdiviñar) {
                JOptionPane.showMessageDialog(null, "O numero e maior.");
            } else {
                JOptionPane.showMessageDialog(null, "Acertaste");
                break;
            }
            if (intentos1 >= intento) {
                JOptionPane.showMessageDialog(null, "Perdeste");
            }

        }
    }

    public void partida() {
        while (partida <= 0) {
            xogador1();
            xogador2();
            partida = JOptionPane.showOptionDialog(null, "¿Xogamos de novo?", "partida", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        }
    }
}
