package model;

import java.util.HashMap;
import java.util.Map;

public class Personagem implements AcaoCombate {

    private String nome;
    private int vida;
    private int nivel;
    private int forca; // dano do personagem é 2*forca + 1
    private Map<String, Integer> mochila;


    public Personagem(String nome, int vida, int nivel, int forca) {
        if(nome != null ){
            this.nome = nome;
            this.vida = 100;
            this.nivel = 1;
            this.forca = 1;
            this.mochila = new HashMap<>();
        }

    }

    public void receberDano(int quantidade){
        if(quantidade >= vida){
            System.out.println("morreu");
        }
        vida -= quantidade;
    }




    public void atacar(Personagem alvo){
        int dano = (forca*2) + 1;
        System.out.println(this.nome + "atacou" + alvo.getNome());
        alvo.receberDano(dano);
    }


    public void defender(){
        System.out.println("O personagem defendeu");
    }


    public void treinar(){
        forca += 1;
        nivel +=1;
    }

//    public void adicionarItem(String item, int qtd){
//        if (!mochila.containsKey(item)) {
//            mochila.put(item, qtd);
//        }else {int qtdatual = mochila.get(item);
//        mochila.put(item, qtdatual + qtd);
//        }
//    }

    //Melhoria com expressoes Lamda

    public void adicionarItem(String item, int qtd){
        if (!mochila.containsKey(item)) {
            mochila.put(item, qtd);
        }else {
            mochila.compute(item, (k, qtdatual) -> qtdatual + qtd);
        }
    }



    public int getForca() {
        return forca;
    }

    public String getNome() {
        return nome;
    }
}
