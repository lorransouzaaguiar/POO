package GameAdvinhei.model;

import GameAdvinhei.Enum.Distancia;

public class Game {
    private int numeroAleatorio;
    private int areaMin;
    private int areaMax;

    public Game() {
        gerarNovoNumAleatorio();
    }

    public Distancia getDistanciaDoNumero(int numero){
        if(numero == numeroAleatorio){
            return Distancia.EXATO;
        }
        else if((numero > areaMin && numero < areaMax)){
            return Distancia.PERTO;
        }else {
            return Distancia.LONGE;
        }
    }

    public void gerarNovoNumAleatorio() {
        this.numeroAleatorio = (int) (Math.random() * 100);
        setAreaProxima();
    }

    private void setAreaProxima() {
        this.areaMin = numeroAleatorio - 5;
        this.areaMax = numeroAleatorio + 5;
    }
}
