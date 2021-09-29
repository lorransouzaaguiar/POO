package GameAdvinhei.presenter;
import java.awt.Color;
import java.awt.event.*;
import GameAdvinhei.Enum.Distancia;
import GameAdvinhei.model.Game;
import GameAdvinhei.view.GameView;
import utils.VerificaString;

public class GamePresenter{

    private Game game;
    private GameView view;
    
    public GamePresenter(GameView view){
        this.game = new Game();
        this.view = view;
    }
    
    public void jogando(){
        String resposta = this.view.tfResposta.getText();

        if(!VerificaString.ehNumero(resposta)){
            this.view.lblResposta.setText("Insira números entre 1 - 100");
        }
        else {
            int numero = Integer.parseInt(resposta);
            Distancia distancia = (Distancia) game.getDistanciaDoNumero(numero);
            atualizaView(distancia);
        }
    }  

    private void iniciaNovoJogo(){
        this.game = new Game();
        this.view.tfResposta.setText("");
        this.view.tfResposta.setEditable(true);
    }

    private void atualizaView(Distancia distancia){
        switch (distancia) {
            case PERTO: {
                this.view.lblResposta.setText("Vo\u00E7\u00EA esta perto!");
                this.view.tfResposta.setBackground(Color.RED);
            };break;
            case LONGE: {
                this.view.lblResposta.setText("Vo\u00E7\u00EA esta longe!");
                this.view.tfResposta.setBackground(Color.BLUE);
            };break;
            case EXATO: {
                this.view.lblResposta.setText("Vo\u00E7\u00EA acertou!!!");
                this.view.tfResposta.setBackground(Color.WHITE);
                this.view.tfResposta.setEditable(false);
            }; 
        }
    }

    public KeyListener tecladoOuvinte(){
        return new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                jogando();
            }
        };
    }

    public ActionListener botaoOuvinte(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciaNovoJogo();
            }
        };
    }
}


