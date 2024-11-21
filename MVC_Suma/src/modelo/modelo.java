package modelo;

public class modelo {
    
    //Declarar los atributos
    private int valor1 = 0;
    private int valor2 = 0;
    private int total = sumar();

    public modelo() {
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getSumar() {
        return this.total;
    }

    public int sumar() {
        this.total = this.valor1 + this.valor2;
        return this.total;
    }
    
    
    
}