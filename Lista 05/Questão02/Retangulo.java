package ListasPOO_Java.Lista 05.Questão02;

public class Retangulo {
    private Double Base;
    private Double Altura;
    
    // Construtor
    public Retangulo(Double Base, Double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }
    
    // Métodos
    Double Area() {
        return Base * Altura;
    }
    
    Double Perimetro() {
        return 2 * (Base + Altura);
    }
    
    // Get e Set
    public Double getBase() {
        return this.Base;
    }

    public void setBase(Double base) {
        this.Base = base;
    }

    public Double getAltura() {
        return this.Altura;
    }

    public void setAltura(Double altura) {
        this.Altura = altura;
    }
}
