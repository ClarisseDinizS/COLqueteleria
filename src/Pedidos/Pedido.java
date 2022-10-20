package Pedidos;

import Coqueteis.Coquetel;
import java.util.LinkedList;

public class Pedido {
    
    private int codigoPed;
    private String interessado;
    private int codigoCoqui;
    
    public Pedido(int codigoPed, String interessado, int codigoCoqui) {
        this.codigoPed = codigoPed;
        this.interessado = interessado;
        this.codigoCoqui = codigoCoqui;  
    }
    
    public void imprimirPedido(){
        System.out.println(this.codigoPed+ " " + this.interessado + " " + this.codigoCoqui);
    }

    public int getCodigoPed() {
        return codigoPed;
    }

    public void setCodigoPed(int codigoPed) {
        this.codigoPed = codigoPed;
    }

    public String getInteressado() {
        return interessado;
    }

    public void setInteressado(String interessado) {
        this.interessado = interessado;
    }

    public int getCodigoCoqui() {
        return codigoCoqui;
    }

    public void setCodigoCoqui(int codigoCoqui) {
        this.codigoCoqui = codigoCoqui;
    }
    
    public int retornarCodigo(int codigoCoqui){
        
    return codigoCoqui;
    
    }
     
}
   
    
    
    
    
    
  
