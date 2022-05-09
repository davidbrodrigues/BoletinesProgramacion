package boletin32;

public class Deportivos extends Barco{
    private int potencia;

    public Deportivos() {
    }

    public Deportivos(int potencia) {
        this.potencia = potencia;
    }

    public Deportivos (int potencia, int eslora, int dias) {
        super(eslora, dias);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Deportivas{ " + "Ten " + potencia + "cv de potencia" + super.toString() + '}';
    }
    
    @Override
    public void calcularPrecio(Barco barco) {
        int modulo = barco.getEslora()*10+this.getPotencia()*2;
        float precio = barco.getDias()*modulo;
        System.out.println("O prezo de alquiler é de " + precio + "€");
    }
    
}