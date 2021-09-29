package Calculadora.view;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Calculadora.presenter.CalculadoraPresenter;

public class CalculadoraView extends JFrame{

    private CalculadoraPresenter presenter;
	public JButton btnAdicao, btnSubtracao, btnMultiplicacao, btnDivisao;
	public JTextField tfValor1, tfValor2, tfResultado;

    public CalculadoraView() {
		this.presenter = new CalculadoraPresenter(this);
        criaUI();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
    }

	private void criaUI(){
		this.setTitle("Calculadora");
		this.setBounds(100, 100, 450, 300);
		this.setResizable(false);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		this.setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(70, 178, 295, 49);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.btnAdicao = new JButton("+");
		this.btnAdicao.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(this.btnAdicao);
		
		this.btnSubtracao = new JButton("-");
		this.btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(this.btnSubtracao);
		
		this.btnMultiplicacao = new JButton("*");
		this.btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(this.btnMultiplicacao);
		
		this.btnDivisao = new JButton("/");
		this.btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(this.btnDivisao);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(70, 35, 295, 132);
		contentPane.add(panel_1);
		
		JLabel lblValor1 = new JLabel("Valor 1:");
		lblValor1.setBounds(53, 11, 67, 19);
		lblValor1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblValor1);
		
		this.tfValor1 = new JTextField();
		this.tfValor1.setBounds(158, 12, 86, 20);
		this.tfValor1.setColumns(10);
		panel_1.add(this.tfValor1);
		
		JLabel lblValor2 = new JLabel("Valor 2:");
		lblValor2.setBounds(53, 50, 68, 19);
		lblValor2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblValor2);
		
		this.tfValor2 = new JTextField();
		this.tfValor2.setBounds(158, 51, 86, 20);
		this.tfValor2.setColumns(10);
		panel_1.add(this.tfValor2);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(53, 89, 68, 19);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblResultado);
		
		this.tfResultado = new JTextField();
		this.tfResultado.setBounds(158, 90, 86, 20);
		this.tfResultado.setColumns(10);
        this.tfResultado.setEditable(false);
		panel_1.add(this.tfResultado);

		this.btnAdicao.addActionListener(presenter.btnAdicaoOuvinte());
		this.btnSubtracao.addActionListener(presenter.btnSubtracaoOuvinte());
		this.btnMultiplicacao.addActionListener(presenter.btnMultiplicacaoOuvinte());
		this.btnDivisao.addActionListener(presenter.btnDivisaoOuvinte());
	}
	
	
}
