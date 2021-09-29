package Calculadora.presenter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import Calculadora.model.Calculadora;
import Calculadora.view.CalculadoraView;
import utils.VerificaString;
import java.awt.event.*;

public class CalculadoraPresenter {

    Calculadora calculadora;
    CalculadoraView view;
    DecimalFormat df;

    public CalculadoraPresenter(CalculadoraView view){
        this.calculadora = new Calculadora();
        this.view = view;
        this.df = new DecimalFormat("0.00");
    }
    
    public void executa(String operacao) {

        String valor1 = this.view.tfValor1.getText();
        String valor2 = this.view.tfValor2.getText();

        if(!VerificaString.ehNumero(valor1) || !VerificaString.ehNumero(valor2)){
           JOptionPane.showMessageDialog(null, "Insira um número válido");
        }

        else {
            calculadora.setValor1(Double.parseDouble(valor1));    ;
            calculadora.setValor2(Double.parseDouble(valor2));   
            
            executaOperacao(operacao);
            
            String resultadoFormatado = df.format(this.calculadora.getResultado());
            this.view.tfResultado.setText(resultadoFormatado);
           
        }
        
    }

    private void executaOperacao(String operacao){
        switch(operacao){
            case "SOMA": {this.calculadora.calcSoma();}break;
            case "SUBTRACAO": {this.calculadora.calcSubtracao();} break;
            case "MULTIPLICACAO": {this.calculadora.calcMultiplicacao();}break;
            case "DIVISAO": {this.calculadora.calcDivisao();}break;
        }
    }

    public ActionListener btnAdicaoOuvinte(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                executa("SOMA");
            }
        };
    }
    public ActionListener btnSubtracaoOuvinte(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                executa("SUBTRACAO");
            }
        };
    }
    public ActionListener btnMultiplicacaoOuvinte(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                executa("MULTIPLICACAO");
            }
        };
    }
    public ActionListener btnDivisaoOuvinte(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                executa("DIVISAO");
            }
        };
    }


    
}
