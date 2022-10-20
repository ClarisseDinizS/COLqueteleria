package Coqueteis;

import Pedidos.Insumos;
import Pedidos.Pedido;
import excecoes.FaltaDeEstoqueException;

public class Marguerita extends Coquetel {
    
    public static int qtdeMarg = 0;

    public Marguerita(int codigoCoq, String nome, double volume, String regiao, int anoCriacao, String tipo, Pedido pedTotal) {
        super(codigoCoq, nome, volume, regiao, anoCriacao, tipo, pedTotal);
        Marguerita.qtdeMarg++;
    }

    @Override
    public void produzirBebida(Insumos tirarInsumo) throws FaltaDeEstoqueException{
             
        if(tirarInsumo.getSal() >= 5){
            tirarInsumo.setSal(tirarInsumo.getSal() - 5);
        }
        else{
            throw new FaltaDeEstoqueException("Sal",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
            );
        }
        if(tirarInsumo.getTequila() >= 100){
           tirarInsumo.setTequila(tirarInsumo.getTequila() - 100); 
        }
        else{
            throw new FaltaDeEstoqueException("Tequila",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui());
        }
        
        if(tirarInsumo.getLimao() >= 100){
           tirarInsumo.setLimao(tirarInsumo.getLimao() - 100); 
        }
        else{
            throw new FaltaDeEstoqueException("Limão",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui());
        }
        if(tirarInsumo.getAcucar() >= 10){
            tirarInsumo.setAcucar(tirarInsumo.getAcucar() - 10);
        }
        else{
            throw new FaltaDeEstoqueException("Açúcar",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui());
        } 
        if(tirarInsumo.getGelo() >= 100){
           tirarInsumo.setGelo(tirarInsumo.getGelo() - 100); 
        }
        else{
            throw new FaltaDeEstoqueException("Gelo",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui());
        }
        if(tirarInsumo.getLicorLaranja() >= 100){
            tirarInsumo.setLicorLaranja(tirarInsumo.getLicorLaranja() - 100);  
        }
        else{
            throw new FaltaDeEstoqueException("Licor de Laranja",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui());
        }
    }
    
}

