package boletin32;

public class Veleros extends Barco{
    private int mastiles;

    public Veleros() {
    }

    public Veleros(int mastiles) {
        this.mastiles = mastiles;
    }

    public Veleros(int mastiles, int dias, int eslora) {
        super(dias, eslora);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Veleros{ " + "Ten " + mastiles + "mástiles" +super.toString() + '}';
    }
    
    @Override
    public void calcularPrecio(Barco barco){
        int modulo = barco.getEslora()*10+this.getMastiles()*8;
        float precio = barco.getDias()*modulo;
        System.out.println("O prezo de alquiler é de " + precio + "€");
    }
}
