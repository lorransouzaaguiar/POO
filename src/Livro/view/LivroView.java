package Livro.view;

import java.awt.*;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Livro.model.Livro;
import Livro.presenter.LivroPresenter;

public class LivroView extends JFrame{

    private LivroPresenter presenter;
    public JTextField tfTitulo, tfPaginas;
    public JList<Livro> jList;
    public JButton btnAdd, btnListar;
    public DefaultListModel<Livro> model = new DefaultListModel<>();


    public LivroView(){
        this.presenter = new LivroPresenter(this);
        criaUI(); 
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void criaUI(){
        this.setResizable(false);
        this.setSize(new Dimension(575, 600));
        getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quantidade de p\u00E1ginas:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 114, 250, 30);
		getContentPane().add(lblNewLabel);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTtulo.setBounds(10, 11, 81, 37);
		getContentPane().add(lblTtulo);
		
		this.tfTitulo = new JTextField();
		this.tfTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.tfTitulo.setBounds(10, 63, 543, 40);
		getContentPane().add(this.tfTitulo);
		this.tfTitulo.setColumns(10);
		
		this.tfPaginas = new JTextField();
		this.tfPaginas.setHorizontalAlignment(SwingConstants.RIGHT);
		this.tfPaginas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.tfPaginas.setBounds(10, 155, 153, 40);
		getContentPane().add(this.tfPaginas);
		this.tfPaginas.setColumns(10);
		
		this.btnAdd = new JButton("Adicionar");
		this.btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.btnAdd.setBounds(309, 154, 117, 40);
		getContentPane().add(this.btnAdd);
		
		this.btnListar = new JButton("Listar");
		this.btnListar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.btnListar.setBounds(436, 154, 117, 40);
		getContentPane().add(this.btnListar);
		
        this.jList = new JList<Livro>();
        this.jList.setBounds(10, 228, 543, 226);
        this.jList.setModel(model);
        this.jList.setVisible(false);;
        getContentPane().add(jList);

        btnAdd.addActionListener(presenter.btnAddOuvinte());
        btnListar.addActionListener(presenter.btnListarOuvinte());
    }
    
}
