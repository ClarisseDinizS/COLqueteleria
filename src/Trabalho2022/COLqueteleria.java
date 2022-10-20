package Trabalho2022;

import Coqueteis.Caipirinha;
import Coqueteis.Caipirinha;
import Coqueteis.Capivodka;
import Coqueteis.Capivodka;
import Coqueteis.Coquetel;
import Coqueteis.Coquetel;
import Coqueteis.Cosmopolitan;
import Coqueteis.Cosmopolitan;
import Coqueteis.Marguerita;
import Coqueteis.Marguerita;
import Coqueteis.SexOnTheWall;
import Coqueteis.SexOnTheWall;
import Pedidos.Insumos;
import Pedidos.Pedido;
import excecoes.FaltaDeEstoqueException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// TRABALHO POO 2022 - CLARISSE DINIZ SILVA
// PROFESSOR: GIOVANY
public class COLqueteleria {
    
    // FUNÇÃO LETRA C
    public static void imprimirPorTipo(LinkedList<Coquetel> listaBebidas, 
        LinkedList<Pedido> listaPedido, int acidos, int doces, int fortes){
        
        
        LinkedList<Pedido> acido = new LinkedList();
        LinkedList<Pedido> doce = new LinkedList();
        LinkedList<Pedido> forte = new LinkedList();
        
        
        for (int i = 0; i < listaPedido.size(); i++) {
         
                if(listaBebidas.get(i).getTipo().equals("Ácido")){
                    acido.add(listaPedido.get(i));
                }
                if (listaBebidas.get(i).getTipo().equals("Doce")){
                    doce.add(listaPedido.get(i));
                }
                if (listaBebidas.get(i).getTipo().equals("Forte")){
                    forte.add(listaPedido.get(i));
                }
        }
        
        System.out.println("Doces: " + doces + "(pedidos)" );
        for (int i = 0; i < doce.size(); i++) {
            doce.get(i).imprimirPedido();
        }
        System.out.println("\n");
        System.out.println("Ácidos: " + acidos + "(pedidos)");
        for (int i = 0; i < acido.size(); i++) {
            acido.get(i).imprimirPedido();
        }
        System.out.println("\n");
        System.out.println("Fortes: " + fortes + "(pedidos)");
        for (int i = 0; i < forte.size(); i++) {
            forte.get(i).imprimirPedido();
        }
    }
    
    // ------------------------------------------------------------------------------- //
    // FUNÇÕES PARA A LETRA B
    public static void verificarQtdeZero(int menor, LinkedList menosPedido, LinkedList quantidadePedido,int verificar){
        // Verifica se nenhuma outra bebida tem o valor de 0 pedidos
        if (Caipirinha.qtdeCaipi < menor && Caipirinha.qtdeCaipi != 0) {
            menor = Caipirinha.qtdeCaipi;
            menosPedido.add("Caipirinha");
            quantidadePedido.add(Caipirinha.qtdeCaipi);
            verificar = 1;
        } else if (Cosmopolitan.qtdeCosmo < menor && Cosmopolitan.qtdeCosmo != 0) {
            menor = Cosmopolitan.qtdeCosmo;
            menosPedido.add("Cosmopolitan");
            quantidadePedido.add(Cosmopolitan.qtdeCosmo);
            verificar = 2;
        } else if (Capivodka.qtdeCapi < menor && Capivodka.qtdeCapi != 0) {
            menor = Capivodka.qtdeCapi;
            menosPedido.add("Capivodka");
            quantidadePedido.add(Capivodka.qtdeCapi);
            verificar = 3;
        } else if (Marguerita.qtdeMarg < menor && Marguerita.qtdeMarg != 0) {
            menor = Marguerita.qtdeMarg;
            menosPedido.add("Marguerita");
            quantidadePedido.add(Marguerita.qtdeMarg);
            verificar = 4;
        }

        if (SexOnTheWall.qtdeSex < menor && SexOnTheWall.qtdeSex != 0) {
            menor = SexOnTheWall.qtdeSex;
            menosPedido.add("SexOnTheWall");
            quantidadePedido.add(SexOnTheWall.qtdeSex);
            verificar = 5;
        } 
    }
    public static void verificaCoqMenos(int menor, LinkedList menosPedido, LinkedList quantidadePedido ){
        // VERIFICA SE ALGUM OUTRO COQUETEL É IGUAL O VALOR DO MENOR. 
        //PARA VERIFICAR SE EXISTEM MAIS DE UM COQUETEL MENOS 
        // PEDIDO
        if (Caipirinha.qtdeCaipi == menor && Caipirinha.qtdeCaipi != 1) {
            quantidadePedido.add(Caipirinha.qtdeCaipi);
        }
        if (Cosmopolitan.qtdeCosmo == menor && Cosmopolitan.qtdeCoq != 4) {
            quantidadePedido.add(Cosmopolitan.qtdeCosmo);
        }
        if (Capivodka.qtdeCapi == menor && Capivodka.qtdeCapi != 3) {
            quantidadePedido.add(Capivodka.qtdeCapi);
        }
        if (Marguerita.qtdeMarg == menor && Marguerita.qtdeCoq != 2) {
            quantidadePedido.add(Marguerita.qtdeMarg);
        }
        if (SexOnTheWall.qtdeSex == menor && SexOnTheWall.qtdeCoq != 5) {
            quantidadePedido.add(SexOnTheWall.qtdeSex);
        }
        
    }
    public static void coquetelMenosPedido(LinkedList<Pedido> listaPedido){
        int menor = 99;
        
            LinkedList<String> menosPedido = new LinkedList();
            LinkedList quantidadePedido = new LinkedList();
            
            // IFs e ELSEs PARA COMPARAR SE A QUANTIDADE DE CADA COQUETEL É IGUAL 
            // A ZERO
            if (Caipirinha.qtdeCaipi == 0) {
                menosPedido.add("Caipirinha");
                quantidadePedido.add(Caipirinha.qtdeCaipi);
            }
            else if (Cosmopolitan.qtdeCosmo == 0) {
                menosPedido.add("Cosmopolitan");
                quantidadePedido.add(Cosmopolitan.qtdeCosmo);
            }
            else if (Capivodka.qtdeCapi == 0) {
                menosPedido.add("Capivodka");
                quantidadePedido.add(Capivodka.qtdeCapi);
            }
            else if (Marguerita.qtdeMarg == 0) {
               menosPedido.add("Marguerita");
                quantidadePedido.add(Marguerita.qtdeMarg);
            }
            else if (SexOnTheWall.qtdeSex == 0) {
                menosPedido.add("SexOnTheWall");
                quantidadePedido.add(SexOnTheWall.qtdeSex);
            }
            else {
                //FOR PARA ACHAR O MENOR NUMERO DE COQUETEL MENOS PEDIDO
                int verificar = 0;
                for (int i = 0; i < listaPedido.size(); i++) {
                    verificarQtdeZero(menor,menosPedido,quantidadePedido,verificar);
                }
                 verificaCoqMenos(menor,menosPedido,quantidadePedido);
            }
            // IFs PARA PRINTAR OS COQUETEIS 
            //DE ACORDO COM A CONCORDÂNCIA E VALORES
            
            if (menosPedido.size() == 1 ) {
                System.out.println("O coquetel menos pedido foi o " 
                    + menosPedido.get(0) + " (" + quantidadePedido.get(0) + " pedidos)");
            }
            if (menosPedido.size() == 2){
                System.out.println("Os coquetéis menos pedidos foram " + menosPedido.get(0) 
                    + "( " + quantidadePedido.get(0) + " pedidos) e " 
                    + menosPedido.get(1) + " (" + quantidadePedido.get(1) + " pedidos)");       
            }
            if (menosPedido.size() > 2){
               int cont = 0;
               System.out.print("Os coquetéis menos pedidos foram " + menosPedido.get(cont) 
                    + "(" + quantidadePedido.get(0) + " pedidos)");
               while(cont < (menosPedido.size()- 2)){ 
                    System.out.print("," + menosPedido.get(cont+1) + "(" + quantidadePedido.get(cont+1) + " pedidos)"); 
                    cont++; 
                }
                System.out.println(" e " + menosPedido.get(cont+1) + "(" + quantidadePedido.get(cont+1) + " pedidos)");
            }
    }
    
    // ------------------------------------------------------------------------//
    // FUNÇÃO LETRA A
    public static void nomeMaisRepetido(LinkedList<Pedido> listaPedido){
        
    LinkedList<String> nomes = new LinkedList();
    
    String vetNomes[];
    vetNomes = new String[listaPedido.size()];
    
    int vetQt[];
    vetQt = new int[listaPedido.size()];
    
    // variável pra pegar a quantidade de pedido sem repetição de nome
    int totalReal = 0; 
        
        // ADICIONA TODOS OS NOMES EM UMA LISTA
        for (int i = 0; i < listaPedido.size(); i++) {
            nomes.add(listaPedido.get(i).getInteressado());
        }
        // PEGA UM NOME E COMPARA COM TODOS OS OUTROS USANDO I
        for (int nome1 = 0; nome1 < nomes.size(); nome1++){
            boolean nomeIgual;
            int nomeRep = 0;
            String nomeAux = null;
            //O segundo for anda a lista para comparar todos os nomes com o nome da posição i através de j. 
            for (int j = 0; j < nomes.size(); j++){
                nomeIgual = nomes.get(j).equals(nomes.get(nome1));
                
                if (nomeIgual == true){
                    //nomeRep conta as repetições dos nomes SE O A FOR IGUAL A TRUE
                    nomeRep++;
                    // COPIA O NOME REPETIDO PARA DENTRO DO VETOR
                    nomeAux = String.copyValueOf(nomes.get(j).toCharArray());
                       
                }
                if ((j+1) == nomes.size() && nomeRep > 0){
                    int teste = 0, var =0;
                    
                    if(nomeRep > 1){
                        // WHILE PARA EVITAR QUE TENHA REPETIÇÃO DE NOMES NO VETOR
                        while(teste < vetNomes.length && totalReal > 0){
                            nomeIgual = nomeAux.equals(vetNomes[teste]);
                            if(nomeIgual == true){
                                var++;
                            }
                            teste++;
                        }
                        // Se não tiver repetição ele apenas armazena    
                        if(var == 0){
                            vetNomes[totalReal] = nomeAux;
                            vetQt[totalReal] = nomeRep;
                            totalReal++;
                        } 
                    //Caso aux seja igual a 1 (nunca será igual a zero ou menor), 
                    //aciona o else e insere a única correspondência nos vetores.
                    }else{
                        vetNomes[totalReal] = nomeAux;
                        vetQt[totalReal] = nomeRep;
                        totalReal++;
                    } 
                }
            }
        }
        //ORDENAR DO MENOR PARA O MAIOR O VETOR
        for (int i = 1; i < totalReal; i++) {
            for (int j = 0; j < i; j++) {
                if (vetQt[i] > vetQt[j]) {
                    int temp = vetQt[i];
                    String aux = vetNomes[i];

                    vetQt[i] = vetQt[j];
                    vetNomes[i] = vetNomes[j];

                    vetQt[j] = temp;
                    vetNomes[j] = aux;
                }
            }
        }
        // IFs PARA PRINTAR DE ACORDO COM A CONCORDÂNCIA
        if(vetQt[0] == vetQt[1] && vetQt[1] == vetQt[2]){
            System.out.println(vetNomes[0] + ", " + vetNomes[1]+ " e " + vetNomes[2] + " possuem " + vetQt[0] + " pedidos realizados");
        }else if(vetQt[0] == vetQt[1] && vetQt[1] > vetQt[2]){ 
            System.out.println(vetNomes[0] + " e " + vetNomes[1]+ " possuem mais pedidos (" + vetQt[0] + " pedidos)");
        }else{
            System.out.println(vetNomes[0] + " possui mais pedidos (" + vetQt[0] + " pedidos)");
        } 
    }
    // VERIFICA SE POSSUI INSUMOS PARA FAZER A BEBIDA
    public static void verificaBebida(Insumos insumo, Coquetel bebida) throws FaltaDeEstoqueException{
        
        bebida.produzirBebida(insumo); 
    }
    // BEBIDA DISPONÍVEL É UM MÉTODO PARA PRODUZIR A BEBIDA DE CADA CÓDIGO.     
    public static void bebidaDisponivel(LinkedList<Pedido> listaPedido, Insumos insumo, LinkedList<Coquetel> listaBebidas) 
    throws FaltaDeEstoqueException{
        for (int i = 0; i < listaPedido.size(); i++) {
            if (listaPedido.get(i).getCodigoCoqui() == 1) {
                verificaBebida(insumo, listaBebidas.get(0));

            } else if (listaPedido.get(i).getCodigoCoqui() == 2) {
                verificaBebida(insumo, listaBebidas.get(1));
            } else if (listaPedido.get(i).getCodigoCoqui() == 3) {
                verificaBebida(insumo, listaBebidas.get(2));
            } else if (listaPedido.get(i).getCodigoCoqui() == 4) {
                verificaBebida(insumo, listaBebidas.get(3));
            } else if (listaPedido.get(i).getCodigoCoqui() == 5) {
                verificaBebida(insumo, listaBebidas.get(4));
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, FaltaDeEstoqueException {

        LinkedList listaInsumos = new LinkedList();
        LinkedList listaInsumosNome = new LinkedList();
        //LEITURA DOS INSUMOS
        try{
           
        FileReader arqInsumos = new FileReader("insumos.txt");
        Scanner lerArqInsumos =  new Scanner(arqInsumos);

        do{
              listaInsumosNome.add(lerArqInsumos.next());
              listaInsumos.add(lerArqInsumos.nextInt());

        } while(lerArqInsumos.hasNextLine());
            
            // SETAR OS VALORES DE CADA NEXTINT DO ARQUIVO EM CADA VARIÁVEL
            // DOS INSUMOS DA CLASSE INSUMO
            Insumos pegarInsumo = new Insumos(); 
            
            pegarInsumo.setCachaca((int)listaInsumos.get(0));
            pegarInsumo.setLimao(((int)listaInsumos.get(1)));
            pegarInsumo.setAcucar(((int) listaInsumos.get(2)));
            pegarInsumo.setGelo(((int) listaInsumos.get(3)));
            pegarInsumo.setCranberry(((int) listaInsumos.get(4)));
            pegarInsumo.setLicorLaranja(((int) listaInsumos.get(5)));
            pegarInsumo.setVodka(((int) listaInsumos.get(6)));
            pegarInsumo.setTequila(((int) listaInsumos.get(7)));
            pegarInsumo.setSal(((int) listaInsumos.get(8)));

        lerArqInsumos.close();
        // LISTAS DOS  PEDIDOS
        LinkedList <Pedido> listaPedido = new LinkedList();
        LinkedList <Coquetel> listaBebidas = new LinkedList();

        //TIPOS DOS COQUETEIS
        int acidos = 0;
        int fortes = 0;
        int doce = 0;
        
        int codX = 0,codCoqX =0;
        String interessadoX = "";

        //LEITURA DOS PEDIDOS
          FileReader arqPedidos = new FileReader("pedidos.txt");
          Scanner lerArqPedidos =  new Scanner(arqPedidos); 
          
          String[] pedido = new String[0];
          
            while(lerArqPedidos.hasNext()){
                
              String linha = lerArqPedidos.nextLine();
                
              pedido = linha.split(" ");

              codX = Integer.parseInt(pedido[0]);
              interessadoX = pedido[1];
              codCoqX = Integer.parseInt(pedido[2]);
              
              Pedido pedido1 = new Pedido(codX,interessadoX,codCoqX);
              listaPedido.add(pedido1);

              // ESSE IF SERVE PARA CRIAR OS DRINKS TODA VEZ QUE O CÓDIGO FOR DADO
              // E ELE SOMA Q QUANTIDADE DE VEZES CRIADA.
              // ADICIONA CADA DRINK CRIADA NA LISTA DE BEBIDAS
              if(codCoqX == 1){
                Coquetel caipirinha =  new Caipirinha (1, "Caipirinha", 200, "Brasil", 1918, "Ácido", pedido1);
                listaBebidas.add(caipirinha);
                acidos ++; 
              }
              else if (codCoqX == 2){
                Coquetel cosmopolitan =  new Cosmopolitan (2, "Cosmopolitan", 300, "EUA", 1930, "Doce",pedido1);
                listaBebidas.add(cosmopolitan);
                doce++; 
              }
              else if(codCoqX == 3){
                Coquetel capivodka =  new Capivodka (3, "Capivodka", 200, "Rússia", 1900, "Ácido",pedido1);
                listaBebidas.add(capivodka);
                acidos ++;
              }
              else if (codCoqX == 4){
                Coquetel marguerita =  new Marguerita (4, "Marguerita", 250, "México", 1940, "Forte",pedido1);
                listaBebidas.add(marguerita);
                fortes++; 
              }
              else{
                Coquetel sexonthewall =  new SexOnTheWall (5, "Sex On The Wall", 500, "Brasil", 2022, "Forte",pedido1);
                listaBebidas.add(sexonthewall);
                fortes++;
              } 
            } 
            // QUESTÃO A
            System.out.println("---------- QUESTÃO A ------------");
            nomeMaisRepetido(listaPedido);

            //QUESTÃO B
            System.out.println("---------- QUESTÃO B ------------");
            coquetelMenosPedido(listaPedido);

            // QUESTÃO C
            System.out.println("---------- QUESTÃO C ------------");
            imprimirPorTipo(listaBebidas,listaPedido,acidos,doce,fortes);

            // USO DE EXCEÇÕES PARA PEGAR O PEDIDO E O INSUMO FALTANTE
            int num_dias = 0;
            try {
                // ESSE WHILE PASSA POR TODOS OS PEDIDOS ADICIONADOS DO ARQUIVO
                //DE PEDIDOS E, AO TERMINAR DE PASSAR POR TODOS, CONTA UM DIA
                // PARA SOMAR A QUANTIDADE DE DIAS DO ESTOQUE
                while(true){
                    for (int i = 0; i < listaPedido.size(); i++) {
                        if (listaPedido.get(i).getCodigoCoqui() == 1) {
                            bebidaDisponivel(listaPedido, pegarInsumo, listaBebidas);
                            listaBebidas.get(i).produzirBebida(pegarInsumo);
                        }
                        else if (listaPedido.get(i).getCodigoCoqui() == 2) {
                            bebidaDisponivel(listaPedido, pegarInsumo, listaBebidas);
                            listaBebidas.get(i).produzirBebida(pegarInsumo);
                        }
                        else if (listaPedido.get(i).getCodigoCoqui() == 3) {
                            bebidaDisponivel(listaPedido, pegarInsumo, listaBebidas);
                            listaBebidas.get(i).produzirBebida(pegarInsumo);
                        }
                        else if (listaPedido.get(i).getCodigoCoqui() == 4) {
                            bebidaDisponivel(listaPedido, pegarInsumo, listaBebidas);
                            listaBebidas.get(i).produzirBebida(pegarInsumo);
                        }
                        else if (listaPedido.get(i).getCodigoCoqui() == 5) {
                            bebidaDisponivel(listaPedido, pegarInsumo, listaBebidas);
                            listaBebidas.get(i).produzirBebida(pegarInsumo);
                        }
                    num_dias++;
                    }   
                }
                // USO DA EXCEÇÃO PARA PEGAR A QUANTIDADE DE DIAS QUE SUPORTOU O ESTOQUE,
                // QUAL INSUMO FALTOU E EM QUAL PEDIDO OCORREU A FALTA.
            } catch (FaltaDeEstoqueException erro) {
                System.out.println("---------- QUESTÃO D ------------");
                System.out.println("O estoque suportou " + num_dias + " dias" + "\n");
                String nomeInsumo = erro.getNomeInsumoFaltante();
                int codPed = erro.getCodPed();
                String nomeInteressado = erro.getInteressadoPed();
                int codCoq = erro.getCodCoq();
                
                System.out.println("---------- QUESTÃO E ------------");
                System.out.println("A falta de insumos ocorreu no pedido: \n"
                        + erro.getCodPed() + " " + erro.getInteressadoPed() 
                        + " " + erro.getCodCoq());
                
                System.out.println("Faltou "
                        + erro.getNomeInsumoFaltante());
            }
            lerArqPedidos.close();
        }catch (FileNotFoundException erro){
            System.out.println("Não foi possível encontrar o arquivo!");
        }    
    }
}


    

