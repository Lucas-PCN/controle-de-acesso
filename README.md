# Sistema de Controle de Acesso

<p>Projeto entregue durante o curso de desenvolvimento Web ministrado pela <a href="https://www.betrybe.com" targe="_blank" rel="nofollow">Trybe</a>.</p>

<p>Obtive a aprovação no projeto completando 100% dos requisitos obrigatórios e opcionais. Efetivando, assim, a conclusão do Bloco 1 (Essenciais de Java) referente a Aceleração em Java.</p>

## Descrição
  Sistema de controle de acesso inteligente, desenvolvido em Java, para um estabelecimento fictício que irá categorizar as pessoas que acessam o estabelecimento em três grupos: _menores de 18 anos, adultos entre 18 e 49 anos e pessoas com 50 anos ou mais_. O objetivo é que o sistema apresente um relatório que auxilie o cliente na tomada de decisões para alcançar ou fidelizar a clientela.

  Esse sistema apresenta um menu interativo, no console, indicando a opção de acessar o estabelecimento e a opção de finalizar o sistema e mostrar um relatório.
  
  O fluxo do sistema é definido em duas etapas principais: inserir a idade do cliente e finalizar o sistema para gerar o relatório. Após a inserção da idade, o sistema irá liberar a catraca e exibir uma mensagem adequada de acordo com a categoria de idade. O ciclo se repete até que a opção de finalização seja escolhida e o relatório seja gerado.

## Fluxo do sistema:
![Fluxo-controle-de-acesso](https://github.com/analuisams99/controle-de-acesso-java/blob/main/img/controle-acesso.png)


## Rodando o projeto localmente
  1. Clone o repositório
   
     `git@github.com:Lucas-PCN/controle-de-acesso.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd controle-de-acesso`

  3. Instale as dependências:
    
     `mvn install`

  4. Importe o projeto para uma IDE e interaja com o menu:
    
     `Run As Java Application`

## Demonstração

  **EXEMPLO -**
      <p>Conteúdo do console depois de inserir a idade da primeira pessoa cliente será:</p>
  
````
Entre com o número correspondente à opção desejada:
1 - Acessar o estabelecimento
2 - Finalizar sistema e mostar relatório
1
Entre com a sua idade:
18
Pessoa adulta, catraca liberada!
Entre com o número correspondente à opção desejada:
1 - Acessar o estabelecimento
2 - Finalizar sistema e mostrar relatório
````
  
  **EXEMPLO -** 
    <p>Saída do relatório ao entrar com a opção 2, considerando que 200 pessoas visitaram o estabelecimento, das quais 20 eram menores de 18 anos, 150 eram adultas entre 18 e 49 anos de idade, e 30 tinham a partir de 50 anos:</p>
  
````
----- Quantidade -----
menores: 20
adultas: 150
a partir de 50: 30

----- Percentual -----
menores: 10.0%
adultas: 75.0%
a partir de 50: 15.0%

TOTAL: 200
````
---

Projeto desenvolvido por Lucas Castanheira, para fins didáticos. 2023
