package Calculadora.model;

public class Calculadora {

    private double valor1;
    private double valor2;
    private double resultado;

    public Calculadora(){
        this.valor1 = 0;
        this.valor2 = 0;
        this.resultado = 0;
    };

    public void calcSoma(){
        this.resultado = this.valor1 + this.valor2;
    }

    public void calcSubtracao(){
        this.resultado = this.valor1 - this.valor2;
    }

    public void calcMultiplicacao(){
        this.resultado = this.valor1 * this.valor2;
    }

    public void calcDivisao(){
        this.resultado = this.valor1 / this.valor2;
    }

    public double getResultado(){
        return this.resultado;
    }

    
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }


    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

}
