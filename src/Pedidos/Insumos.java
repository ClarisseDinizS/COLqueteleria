package Pedidos;

public class Insumos {
    protected int cachaca;
    protected int limao;
    protected int acucar;
    protected int gelo;
    protected int cranberry;
    protected int licorLaranja;
    protected int vodka;
    protected int tequila;
    protected int sal;
 
    public void ImprimirInsumos(){
        System.out.println("\n");
        System.out.println("Cachaça:" + cachaca);
        System.out.println("Limão:" + limao);
        System.out.println("Açucar:" + acucar);
        System.out.println("Gelo:" + gelo);
        System.out.println("Cranberry:" + cranberry);
        System.out.println("Licor de Laranja:" + licorLaranja);
        System.out.println("Vodka:" + vodka);
        System.out.println("Tequila:" + tequila);
        System.out.println("Sal:" + sal);
    }

    public int getCachaca() {
        return cachaca;
    }

    public void setCachaca(int cachaca) {
        this.cachaca = cachaca;
    }

    public int getLimao() {
        return limao;
    }

    public void setLimao(int limao) {
        this.limao = limao;
    }

    public int getAcucar() {
        return acucar;
    }

    public void setAcucar(int acucar) {
        this.acucar = acucar;
    }

    public int getGelo() {
        return gelo;
    }

    public void setGelo(int gelo) {
        this.gelo = gelo;
    }

    public int getCranberry() {
        return cranberry;
    }

    public void setCranberry(int cranberry) {
        this.cranberry = cranberry;
    }

    public int getLicorLaranja() {
        return licorLaranja;
    }

    public void setLicorLaranja(int licorLaranja) {
        this.licorLaranja = licorLaranja;
    }

    public int getVodka() {
        return vodka;
    }

    public void setVodka(int vodka) {
        this.vodka = vodka;
    }

    public int getTequila() {
        return tequila;
    }

    public void setTequila(int tequila) {
        this.tequila = tequila;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

}
