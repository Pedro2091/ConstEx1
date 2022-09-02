package model;

public class Ventilador {
    private Long velocidade;
    private String cor;
    private boolean ligado;

    public Ventilador(String cor){
        this.cor = cor;
        velocidade = 0l;
        ligado = false;
    }
    public Ventilador(Long velocidade, String cor, boolean ligado){
        this.velocidade = velocidade;
        this.cor = cor;
        this.ligado = ligado;
    }

    public Long getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(Long velocidade){
        if(velocidade < 0 ) return;
        this.velocidade = velocidade;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public boolean isLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public void ligar(){
        if (isLigado()) return;

        this.velocidade = 1l;
        this.ligado = true;
    }
    public void desligar(){
        if (!isLigado()) return;

        this.velocidade = 0l;
        this.ligado = false;
    }
    public String verVelocidade(){
        if (!isLigado() ) return "O ventilador está desligado";
        return "O ventilador está na velocidade " + this.velocidade;
    }


}
