package Coqueteis;

import Pedidos.Insumos;
import Pedidos.Pedido;
import excecoes.FaltaDeEstoqueException;


public class Capivodka extends Coquetel {
    
    public static int qtdeCapi = 0;
    public Insumos tirarInsumo;

    public Capivodka(int codigoCoq, String nome, double volume, String regiao, int anoCriacao, String tipo, Pedido pedTotal) {
        super(codigoCoq, nome, volume, regiao, anoCriacao, tipo, pedTotal);
        Capivodka.qtdeCapi++;
    }

    @Override
    public void produzirBebida(Insumos tirarInsumo) throws FaltaDeEstoqueException {
        
        if(tirarInsumo.getLimao() >= 50){
             tirarInsumo.setLimao(tirarInsumo.getLimao()- 50); 
        }
        else{
             throw new FaltaDeEstoqueException("Limão", pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
             );
        }
        
        if(tirarInsumo.getAcucar() >= 30){
             tirarInsumo.setAcucar(tirarInsumo.getAcucar()- 30);
        }
        else{
             throw new FaltaDeEstoqueException("Açúcar",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
             );
        }
        
        if(tirarInsumo.getGelo() >= 100){
             tirarInsumo.setGelo(tirarInsumo.getGelo()- 100);
        }
        else{
             throw new FaltaDeEstoqueException("Gelo",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
                    );
        }
        
        if(tirarInsumo.getVodka() >= 100){
             tirarInsumo.setVodka(tirarInsumo.getVodka() - 100); 
        }
        else{
             throw new FaltaDeEstoqueException("Vodka",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
             );
        }   
    }

}
