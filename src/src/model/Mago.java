package model;

public class Mago extends Personagem {

    private int mana;

    public Mago(String nome, int vida, int nivel, int forca, int mana) {
        super(nome, vida, nivel, forca);
        this.mana = 100;
    }


    @Override
    public void atacar(Personagem alvo) {
        if(this.mana >= 10){
            this.mana -= 10;
            int danoMagico = 15;
            System.out.println(this.getNome() + " lançou uma bola de fogo em " + alvo.getNome() + "!");
            alvo.receberDano(danoMagico);
        } else {
            System.out.println(this.getNome() + " está sem mana para atacar!");
        }
    }



    @Override
    public void defender() {
        System.out.println(this.getNome() + " criou um escudo mágico");
    }








}









