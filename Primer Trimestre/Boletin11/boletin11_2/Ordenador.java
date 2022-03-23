package boletin11_2;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Ordenador {
    private int intento, numeroAdiviñar, partida = 0, resta;

    public Ordenador() {
    }

    public void maquina() {
        numeroAdiviñar = (int) (Math.random() * 50) + 1;
    }

    public void xogador() {
        int numeroIntroducir, intentos;
        intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza os intentos do ordenador."));
        for (intentos = 0; intentos <= intento; intentos++) {
            numeroIntroducir = Integer.parseInt(JOptionPane.showInputDialog(null, "introduza o numero"));
            while (numeroIntroducir < 1 || numeroIntroducir > 50) {
                numeroIntroducir = Integer.parseInt(JOptionPane.showInputDialog(null, "introduza un nimero entre 1 e 50"));
            }
            resta = Math.abs(numeroAdiviñar - numeroIntroducir);
            if (resta > 20) {
                JOptionPane.showMessageDialog(null, "moi lonxe.");
            } else if (resta >= 10 && resta <= 20) {
                JOptionPane.showMessageDialog(null, "lonxe.");
            } else if (resta < 10 && resta > 5) {
                JOptionPane.showMessageDialog(null, "preto.");
            } else if (resta <= 5 && resta >= 1) {
                JOptionPane.showMessageDialog(null, "moi preto.");
            } else {
                JOptionPane.showMessageDialog(null, "acertaste");
                break;
            }

            if (intentos >= intento) {
                JOptionPane.showMessageDialog(null, "perdeste");
            }
        }
    }

    public void partida() {
        while (partida <= 0) {
            maquina();
            xogador();
            partida = JOptionPane.showOptionDialog(null, "¿Xogamos de novo?", "partida", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        }

    }
}
