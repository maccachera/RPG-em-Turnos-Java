package model;

import java.util.ArrayList;
import java.util.List;

public class Guilda {

    private String nomeGuilda;
    private List<Personagem> membros;


    public Guilda(String nomeGuilda, List<Personagem> membros) {
        this.nomeGuilda = nomeGuilda;
        this.membros = new ArrayList<>();
    }


    public void adicionarMembro(Personagem personagem){
        if (membros.contains(personagem)) {
            System.out.println("Ja esta na guilda");
            return;
        }
        membros.add(personagem);
        System.out.println("Adicionado com sucesso");
    }

    public void listarMembros(){
        for(Personagem p : this.membros){
            System.out.println(p.getNome());
        }
    }

}
