package Livro.model;

public class Livro {
    private String titulo;
    private int quantidadeDePaginas;
    
    
    public Livro(String titulo, int quantidadeDePaginas){
        this.titulo = titulo;
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getQuantidadeDePaginas(){
        return this.quantidadeDePaginas;
    }

    @Override
    public String toString(){
        return "Título: " +titulo+ " Páginas " + quantidadeDePaginas;
    }
}
