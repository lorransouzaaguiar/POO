package Livro.presenter;
import java.awt.event.*;
import javax.swing.JOptionPane;
import Livro.model.Livro;
import Livro.view.LivroView;
import utils.VerificaString;

public class LivroPresenter {

    private LivroView view;

    public LivroPresenter(LivroView view){
        this.view = view;
    }

    public void addLivro(){
        String titulo = this.view.tfTitulo.getText();
        String qtdPaginas = this.view.tfPaginas.getText();
        
        if(!VerificaString.ehNumero(qtdPaginas)){
            mostrarMensagemDeErro();
        }
        else {
            int quantidadeDePaginas = Integer.parseInt(qtdPaginas);
            Livro livro = new Livro(titulo, quantidadeDePaginas);
            this.view.model.addElement(livro);
        }
    }

    private void mostrarMensagemDeErro(){
        JOptionPane.showMessageDialog(null, "Insira a quantidade de páginas");
    }

    private void listaLivros(){
        this.view.jList.setVisible(true);
    }

    public ActionListener btnAddOuvinte(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addLivro();
            }
        };
    }

    public ActionListener btnListarOuvinte(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                listaLivros();
            }
        };
    }
}

