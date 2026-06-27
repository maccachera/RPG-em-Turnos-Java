# ⚔️ Sistema de Batalha RPG - Orientação a Objetos

Um projeto desenvolvido em **Java** para simular o ecossistema de um jogo de RPG (Role-Playing Game). O foco principal da aplicação é a implementação de arquiteturas limpas utilizando os pilares da **Programação Orientada a Objetos (POO)** e a manipulação avançada de **Estruturas de Dados (Collections)**.

## 🎯 Objetivos do Projeto
* Consolidar os conceitos de Herança, Polimorfismo e Interfaces.
* Implementar interações seguras e dinâmicas entre objetos (como um personagem atacando outro).
* Gerenciar agrupamentos e inventários utilizando Listas e Mapas blindados contra erros lógicos.

## 🧠 Conceitos de POO Aplicados na Prática

* **Abstração e Encapsulamento:** Criação da classe base `Personagem` com atributos protegidos (`private`). A manipulação do estado do objeto ocorre através de métodos controlados, como o `receberDano()`, que possui a regra de negócio para impedir que a barra de vida fique com valores negativos.
* **Herança:** As classes `Guerreiro` e `Mago` estendem a classe base, reaproveitando características universais (nome, vida, nível, força) e a lógica de recebimento de dano sem necessidade de duplicação de código.
* **Polimorfismo:** Sobrescrita (`@Override`) do método `atacar(Personagem alvo)` em cada classe filha. O guerreiro executa o ataque calculando um dano físico multiplicador, enquanto o mago possui uma lógica própria de consumo de pontos de mana para lançar feitiços.
* **Interfaces (Contratos):** Implementação da interface `AcaoCombate`, obrigando o sistema a garantir que todo personagem instanciado cumpra a assinatura dos métodos fundamentais de ataque e defesa.
* **Agregação com Listas (Collections):** A classe `Guilda` utiliza uma estrutura `List<Personagem>` para agrupar heróis. Foi implementado o padrão de "Early Return" e validações com `.contains()` para impedir o recrutamento de membros duplicados na mesma equipe.
* **Dicionários com Mapas (Collections):** Criação de um sistema de inventário embutido nos personagens através da estrutura `Map<String, Integer>`. O sistema utiliza lógicas modernas de chave-valor para adicionar itens inéditos ou acumular a quantidade de itens repetidos na mesma gaveta.
* **Expressões Lambda e Sintaxe Moderna:** Refatoração da lógica de atualização do inventário utilizando o método `.compute()` da interface `Map`. Aplicação de funções anônimas (Lambdas `->`) para executar operações de leitura e escrita de forma direta e in-line, resultando em um código mais limpo (Clean Code) e performático.

## 📁 Estrutura Principal de Classes

* `AcaoCombate.java` (Contrato)
* `Personagem.java` (Classe Abstrata / Base)
* `Guerreiro.java` (Classe Especializada)
* `Mago.java` (Classe Especializada)
* `Guilda.java` (Classe Agrupadora)

## 🚀 Como Testar
Para simular as batalhas, basta instanciar os objetos na sua classe `Main`, passar os personagens como parâmetros de alvo nos métodos de ataque e acompanhar os relatórios de vida e inventário impressos no console.

---
Desenvolvido por **Gabriel Maccachero Araujo** como projeto prático de arquitetura de software em Java.
