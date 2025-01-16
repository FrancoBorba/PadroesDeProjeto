# Singleton - Creational (Criação)

## Intenção

*Garantir que uma classe tenha somente uma instância no programa e fornecer um ponto de acesso global para a mesma.*

---

## Destilando a intenção

Em vídeo: https://www.youtube.com/watch?v=x9h8MgAvi_I&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=4

O Singleton é um padrão de projeto que tem a intenção de resolver dois problemas em uma aplicação:  

- **Garantir que uma classe tenha somente uma instância no programa** - isso é muito comum para programas que acessam recursos compartilhados, como bases de dados, sistemas de arquivos, interfaces gráficas, spoolers de impressão, módulos de um programa e mais.
- **Fornecer um ponto de acesso global para a mesma** - isso deixa o singleton muito parecido com variáveis globais, porque temos um único objeto, com acesso global, sendo usado por várias partes da aplicação.

Apesar de ser um dos padrões mais usados na atualidade, requer conhecimento e cuidado ao utilizá-lo. Um programador pode facilmente criar um Singleton que gera problemas de concorrência em um programa.

Note que o Singleton tem duas responsabilidades e isso quebra a regra do SRP (Single Responsibility Principle).

Em entrevista, anos após a criação do livro, Erich Gamma (um dos autores), mencionou seu interesse em remover o Singleton se fossem reescrever o livro na atualidade. Segundo ele, o uso de singleton quase sempre é sinal de problemas de design. (https://bit.ly/nosingleton) 

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o singleton quando:

- Use o singleton quando uma classe precisa ter somente uma instância disponível em todo o seu programa;
- Use o singleton quando perceber que está usando variáveis globais para manter partes importantes do programa, como variáveis de configuração que são usadas por toda a aplicação.

## Implementação - Teoria

Isso pode mudar de linguagem para linguagem, em Python seria de uma maneira, em JavaScript de outra e em linguagens com tipagem estática, como TypeScript, de outra. Mas o senso comum sobre singletons é o seguinte:

- Declarar um campo privado na classe para armazenar a instância do Singleton.
- Declarar um método público (getter) para obter a instância do Singleton;
- Na chamada do método público, adicione *lazy instantiation*, ou seja, verifique se uma instância do Singleton já foi criada; se foi, retorne-a, se não crie uma nova instância e retorne-a.
- Não permita que novas instâncias da classe. Você pode atingir facilmente este objetivo fazendo o construtor da classe privado.

## Consequências

O que é bom ou ruim nos Singletons:

**Bom:**
- Acesso controlado por encapsulamento à instância única;
- É possível permitir um número variável de instâncias (pode soar estranho, mas é possível criar um Singleton que permite n instâncias de uma classe);
- É possível usar thead lock para garantir que duas partes do código não alterem o singleton simultaneamente;
- Usa *lazy instantiation*, ou seja, o Singleton só será instanciado no momento do uso;

**Ruim:**
- É mais difícil de testar;
- Viola o princípio da responsabilidade única;
- Requer tratamento especial em casos de concorrência;
## 🔗 Referência  

Este readme foi apenas copiado do repósitorio do professor Otavio Miranda estando disponivel no seu github https://github.com/luizomf/design-patterns-typescript

Não criei os outros dois exemplos de singleton apresentados na aula pois eram específicos para TypeScript e JavaScript , estarei fazendo o curso adaptado para java