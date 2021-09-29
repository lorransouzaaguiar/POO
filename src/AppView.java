import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import Calculadora.view.CalculadoraView;
import GameAdvinhei.view.GameView;
import Livro.view.LivroView;

public class AppView extends JFrame{

    JPanel contentPane;
    
    public AppView(){
		criaUI();
		this.setLocationRelativeTo(null);
	}
    
	private void criaUI(){
		this.setTitle("App Principal");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 557, 401);		
		this.setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		this.setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 541, 22);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("Exercicios");
		menuBar.add(menu);
		
		JMenuItem menuItem_01 = new JMenuItem("01 - Calculadora");
		menu.add(menuItem_01);

		JMenuItem menuItem_02 = new JMenuItem("02 - Game Advinhei");
		menu.add(menuItem_02);

		JMenuItem menuItem_03 = new JMenuItem("03 - Livro");
		menu.add(menuItem_03);
		
		menuItem_01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new CalculadoraView();
            }
		});
		
		menuItem_02.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				new GameView();
			}
		});
		
		menuItem_03.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				new LivroView();
			}
		});
		
       this.setVisible(true);
    }
}
