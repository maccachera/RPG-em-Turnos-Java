package model;

public class Guerreiro extends Personagem {

    private int ataquePesado;

    public Guerreiro(String nome, int vida, int nivel, int forca, int ataquePesado) {
        super(nome, vida, nivel, forca);
        this.ataquePesado = this.getForca()* 4 + 1;
    }


    @Override
    public void atacar(Personagem alvo) {
        System.out.println(this.getNome() + " desferiu um ATAQUE PESADO com sua espada em " + alvo.getNome() + "!");
        alvo.receberDano(this.ataquePesado);

    }


    @Override
    public void defender() {
        System.out.println(this.getNome() + " levantou seu escudo de ferro para se defender!");
    }
}
