package boletin21_4;
public class Boletin21_4 {

    public static void main(String[] args) {
          char letra[]=new char[22];
        char letras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int dni=Metodos.pedirDni();
        int resto=Metodos.calcularResto(dni);
        Metodos.calcularLetra(letras, resto);
    }
    
}
