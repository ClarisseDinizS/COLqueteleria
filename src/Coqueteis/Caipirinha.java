package Coqueteis;

import Pedidos.Insumos;
import Pedidos.Pedido;
import excecoes.FaltaDeEstoqueException;

public class Caipirinha extends Coquetel {
    
    public static int qtdeCaipi = 0;

    public Caipirinha (int codigoCoq, String nome, double volume, String regiao, int anoCriacao, String tipo, Pedido pedTotal) {
        super(codigoCoq, nome, volume, regiao, anoCriacao, tipo, pedTotal);
        Caipirinha.qtdeCaipi++;
    }

    @Override
    public void produzirBebida(Insumos tirarInsumo) throws FaltaDeEstoqueException {
       
        
        if(tirarInsumo.getLimao() >= 50){
             tirarInsumo.setLimao(tirarInsumo.getLimao()- 50); 
        }
        else{
             throw new FaltaDeEstoqueException("Limão",pedTotal.getCodigoPed(), 
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
        
        if(tirarInsumo.getCachaca() >= 100){
             tirarInsumo.setCachaca(tirarInsumo.getCachaca()-100);
        }
        else{
             throw new FaltaDeEstoqueException("Cachaça",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
                    );
        }
    } 
}



