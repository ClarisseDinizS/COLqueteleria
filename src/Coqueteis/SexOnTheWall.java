package Coqueteis;

import Pedidos.Insumos;
import Pedidos.Pedido;
import excecoes.FaltaDeEstoqueException;

public class SexOnTheWall extends Coquetel {
    
    public static int qtdeSex = 0;

    public SexOnTheWall(int codigoCoq, String nome, double volume, String regiao, int anoCriacao, String tipo, Pedido pedTotal) {
        super(codigoCoq, nome, volume, regiao, anoCriacao, tipo, pedTotal);
        SexOnTheWall.qtdeSex++;
    }
    
    @Override
    public void produzirBebida(Insumos tirarInsumo) throws FaltaDeEstoqueException {
        
        if(tirarInsumo.getSal() >= 5){
            tirarInsumo.setSal(tirarInsumo.getSal() - 5);
        }
        else{
            throw new FaltaDeEstoqueException("Sal", pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
            );
        }
        if(tirarInsumo.getTequila() >= 20){
           tirarInsumo.setTequila(tirarInsumo.getTequila() - 20); 
        }
        else{
            throw new FaltaDeEstoqueException("Tequila",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui() 
            );
        }
        
        if(tirarInsumo.getLimao() >= 20){
           tirarInsumo.setLimao(tirarInsumo.getLimao() - 20); 
        }
        else{
            throw new FaltaDeEstoqueException("Limão",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
            );
        }
        if(tirarInsumo.getAcucar() >= 50){
            tirarInsumo.setAcucar(tirarInsumo.getAcucar() - 50);
        }
        else{
            throw new FaltaDeEstoqueException("Açúcar",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
            );
        } 
        if(tirarInsumo.getGelo() >= 50){
           tirarInsumo.setGelo(tirarInsumo.getGelo() - 50); 
        }
        else{
            throw new FaltaDeEstoqueException("Gelo",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
            );
        }
        if(tirarInsumo.getLicorLaranja() >= 50){
            tirarInsumo.setLicorLaranja(tirarInsumo.getLicorLaranja() - 50);  
        }
        else{
            throw new FaltaDeEstoqueException("Licor de Laranja",pedTotal.getCodigoPed(), 
            pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
            );
        }
        if(tirarInsumo.getCachaca() >= 100){
           tirarInsumo.setCachaca(tirarInsumo.getCachaca() - 100); 
        }
        else{
            throw new FaltaDeEstoqueException("Cachaça",pedTotal.getCodigoPed(), 
           pedTotal.getInteressado(), pedTotal.getCodigoCoqui()
            );
        }
        if(tirarInsumo.getCranberry() >= 50){
           tirarInsumo.setCranberry(tirarInsumo.getCranberry() - 50); 
        }
        else{
            throw new FaltaDeEstoqueException("Cranberry",pedTotal.getCodigoPed(), 
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
