package GameAdvinhei.view;
import GameAdvinhei.presenter.GamePresenter;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GameView extends JFrame{

    private GamePresenter presenter;
    public JLabel lblResposta;
    public JTextField tfResposta;
    public JButton btnNovo;
    
    public GameView(){
        this.presenter = new GamePresenter(this);
        criaUI();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void criaUI(){
        this.setTitle("Game Adivinhei");
		this.setResizable(false);

        setBounds(100, 100, 716, 422);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        
		JLabel lblTituloPrincipal = new JLabel("Eu tenho um n\u00FAmero entre 1 e 100. Vo\u00E7\u00EA pode adivinha-lo?");
		lblTituloPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTituloPrincipal.setBounds(32, 23, 636, 32);
		contentPane.add(lblTituloPrincipal);
		
		this.tfResposta = new JTextField();
		this.tfResposta.setHorizontalAlignment(SwingConstants.CENTER);
		this.tfResposta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		this.tfResposta.setBounds(305, 142, 86, 49);
		contentPane.add(this.tfResposta);
		this.tfResposta.setColumns(10);
		
		this.lblResposta = new JLabel("Insira números entre 1 - 100");
		this.lblResposta.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		this.lblResposta.setBounds(32, 227, 636, 32);
		contentPane.add(this.lblResposta);
		
		this.btnNovo = new JButton("Novo Jogo");
		this.btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		this.btnNovo.setBounds(273, 288, 155, 43);
		contentPane.add(this.btnNovo);
		
		JLabel lblAviso = new JLabel("Entre com o seu chute:");
		lblAviso.setHorizontalAlignment(SwingConstants.CENTER);
		lblAviso.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAviso.setBounds(221, 81, 255, 32);
		contentPane.add(lblAviso);

        this.tfResposta.addKeyListener(this.presenter.tecladoOuvinte());
        this.btnNovo.addActionListener(this.presenter.botaoOuvinte());
    }
}
