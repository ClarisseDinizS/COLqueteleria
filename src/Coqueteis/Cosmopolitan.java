package Coqueteis;

import Pedidos.Insumos;
import Pedidos.Pedido;
import excecoes.FaltaDeEstoqueException;

public class Cosmopolitan extends Coquetel {

    
    public static int qtdeCosmo = 0;

    public Cosmopolitan(int codigoCoq, String nome, double volume, String regiao, int anoCriacao, String tipo, Pedido pedTotal) {
        super(codigoCoq, nome, volume, regiao, anoCriacao, tipo, pedTotal);
        Cosmopolitan.qtdeCosmo++;
    }

    @Override
    public void produzirBebida(Insumos tirarInsumo) throws FaltaDeEstoqueException  {
        
        if(tirarInsumo.getLimao() >= 100){
             tirarInsumo.setLimao(tirarInsumo.getLimao()- 100);
        }
        else{
             throw new FaltaDeEstoqueException("Limão",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
             );
        }
        
        if(tirarInsumo.getCranberry() >= 100){
             tirarInsumo.setCranberry(tirarInsumo.getCranberry() - 100);
        }
        else{
             throw new FaltaDeEstoqueException("Cranberry",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
                    );
        }
        
        if(tirarInsumo.getLicorLaranja() >= 50){
             tirarInsumo.setLicorLaranja(tirarInsumo.getLicorLaranja()-50);
        }
        else{
             throw new FaltaDeEstoqueException("Licor de Laranja",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
             );
        }
        
        if(tirarInsumo.getGelo() >= 50){
             tirarInsumo.setGelo(tirarInsumo.getGelo()- 50);
        }
        else{
             throw new FaltaDeEstoqueException("Gelo",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
             );
        }
        if(tirarInsumo.getVodka() >= 50){
             tirarInsumo.setVodka(tirarInsumo.getVodka() - 50);
        }
        else{
             throw new FaltaDeEstoqueException("Vodka", pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
             );
        }  
        
    }
    
}
