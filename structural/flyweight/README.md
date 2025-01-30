# Flyweight - Structural (Estrutural)

## Intenção

*Flyweight é um padrão de projeto estrutural que tem a intenção de usar compartilhamento para suportar eficientemente grandes quantidades de objetos de forma granular.*

**Observação:** Esse é um padrão de otimização, certifique-se de ter problemas de desempenho antes de usá-lo. Do contrário, você estará adicionando complexidade desnecessária no seu sistema.

---

## Sobre o Flyweight

Em vídeo: https://www.youtube.com/watch?v=WPQa64bdQbk&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=25

O Flyweight visa dividir um objeto em dois estados: o estado intrínseco e o estado extrínseco.

O estado **intrínseco** de um objeto é a parte que nunca muda ou muda poucas vezes dentro do sistema. Por exemplo, imagine um objeto de endereço de um cliente com os seguintes dados: rua, número, bairro, cidade, cep, complemento, etc... O estado intrínseco deste objeto seriam as coisas que podem se repetir de cliente para cliente. Pense comigo, se vários clientes são do mesmo bairro, sabemos que outros dados também não mudam, como cidade e cep. Esses são parte do estado intrínseco do objeto de endereço.

Por outro lado temos o estado **extrínseco**. Esse estado mantém dados que estão constantemente variando. No caso do endereço, o número, o complemento e os dados do cliente mudam para cada localização. Esses valores podem ser movidos para fora do objeto a fim de liberar a memória que podem consumir.

**Observação:** este é um exemplo fictício apenas para facilitar seu entendimento. Você precisa analisar caso a caso.

A solução que o Flyweight entrega é bastante intuitiva: 

- separe o estado do objeto em **intrínseco** e **extrínseco**
- mantenha o estado **intrínseco** dentro do objeto de forma imutável (geralmente configurado uma vez pelo construtor), já que ele será compartilhado com outros objetos
- quando necessário, receba o restante dos dados (o estado **extrínseco**) no método que precisar desses dados
- para evitar a duplicação de objetos flyweight, usa-se uma fábrica que verifica se um flyweight precisa ser criado ou se foi criado anteriormente. Recomenda-se que o código cliente use somente a fábrica para criar novos flyweights ou obter flyweights já criados  

Apesar de intuitivo, isso gera bastante complexidade no sistema, por isso é necessário analisar com cuidado essa situação. Ao separar o estado de um objeto, precisaremos de uma forma de unir esses dados novamente no momento do uso. Segundo o livro da GoF, isso pode ser feito no contexto que o cliente estiver, ou seja, pode ser gerenciado pelo próprio código cliente da maneira que preferir.

Além disso, eles também recomendam que você só use o padrão Flyweight em uma condição bastante específica (veja Aplicabilidade)

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Só use o Flyweight quanto TODAS as condições a seguir forem verdadeiras:

- uma aplicação utiliza uma grande quantidade de objetos;
- os custos de armazenamento são altos por causa da grande quantidade de objetos;
- a maioria dos estados de objetos podem se tornar extrínsecos;
- muitos objetos podem ser substituídos por poucos objetos compartilhados;
- a aplicação não depende da identidade dos objetos.

## Implementação

Veja o código e os diagramas dessa pasta para entender como o Flyweight é implementado.

## Consequências

O que é bom ou ruim no Flyweight:

**Bom:**
- economiza memória RAM

**Ruim:**
- Pode gerar outros problemas de desempenho não relacionados com a RAM
- Seu código vai se tornar muito complexo


## 🔗 Referência  

Este conteúdo é baseado nos conceitos originais dos **Design Patterns: Elements of Reusable Object-Oriented Software** da GoF (Gang of Four).

Este readme foi apenas copiado do repósitorio do professor Otavio Miranda estando disponivel no seu github https://github.com/luizomf/design-patterns-typescript