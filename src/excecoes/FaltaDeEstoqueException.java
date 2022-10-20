package excecoes;

import Coqueteis.Coquetel;
import Pedidos.Insumos;
import Pedidos.Pedido;


public class FaltaDeEstoqueException extends Exception {
    
    private String nomeInsumoFaltante;
    private int codPed;
    private String interessadoPed;
    private int codCoq;
    
    
    public FaltaDeEstoqueException(String nomeInsumoFaltante, int codPed, String interessadoPed, int codCoq) {
        this.nomeInsumoFaltante = nomeInsumoFaltante;
        
        this.codPed = codPed;
        this.interessadoPed = interessadoPed;
        this.codCoq = codCoq;
    }

    public int getCodPed() {
        return codPed;
    }

    public String getInteressadoPed() {
        return interessadoPed;
    }

    public int getCodCoq() {
        return codCoq;
    }
    
    public String getNomeInsumoFaltante() {
        return nomeInsumoFaltante;
    }
  
}
