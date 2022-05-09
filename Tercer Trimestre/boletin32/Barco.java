package boletin32;

public abstract class Barco {
    private int eslora;
    private int dias;

    public Barco() {
    }

    public Barco(int eslora, int dias) {
        this.eslora = eslora;
        this.dias = dias;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int esloras) {
        this.eslora = eslora;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return " O temaño é de " + eslora + "m de eslora e os días son " + dias ;
    }
    
    public abstract void calcularPrecio(Barco barco);
}
