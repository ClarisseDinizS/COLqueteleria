package Coqueteis;

import Pedidos.Insumos;
import Pedidos.Pedido;
import excecoes.FaltaDeEstoqueException;

public abstract class Coquetel {
    private int codigoCoq;
    private String nome;
    private double volume;
    private String regiao;
    private int anoCriacao;
    private String tipo;
    public static int qtdeCoq = 0;
    protected Pedido pedTotal;

    public Coquetel(int codigoCoq, String nome, double volume, String regiao, int anoCriacao, String tipo, Pedido pedTotal2) {
        this.pedTotal = new Pedido(pedTotal2.getCodigoPed(),pedTotal2.getInteressado(),pedTotal2.getCodigoCoqui());
        this.codigoCoq = codigoCoq;
        this.nome = nome;
        this.volume = volume;
        this.regiao = regiao;
        this.anoCriacao = anoCriacao;
        this.tipo = tipo;
        this.qtdeCoq++;
        
    }

    public int getCodigoCoq() {
        return codigoCoq;
    }

    public String getNome() {
        return nome;
    }

    public double getVolume() {
        return volume;
    }

    public String getRegiao() {
        return regiao;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public String getTipo() {
        return tipo;
    }

    public static int getQtdeCoq() {
        return qtdeCoq;
    }
    
    public void imprimirBebida(int codigoCoq, String nome, double volume, String regiao, int anoCriacao, String tipo){
        System.out.println(this.codigoCoq+ " " + this.nome+ " " 
                + this.volume + " " + this.regiao+ " " + this.anoCriacao+ " " + this.tipo);
    }
    
    public abstract void produzirBebida(Insumos insumo) throws FaltaDeEstoqueException;
    
}
