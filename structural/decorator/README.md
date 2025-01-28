# Decorator - Structural (Estrutural)

## Intenção

*Agregar responsabilidades adicionais a um objeto dinamicamente. Os Decorators fornecem uma alternativa flexível ao uso de subclasses para extensão de funcionalidades.*

---

## Sobre o Decorator

Em vídeo: https://www.youtube.com/watch?v=p3Dh7VjxudE&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=20

O Decorator é uma padrão de projeto usado para adicionar funcionalidades a objetos já criados, ou seja, sem a necessidade de alterar nenhum código. Isso faz com que este padrão aplique naturalmente o princípio do aberto/fechado (classes devem estar abertas para extensão, mas fechadas para modificação).

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padrão Decorator quando:

- você precisa adicionar funcionalidades em objetos sem quebrar ou alterar o código existente
- você quiser usar composição ao invés de herança
- você percebe que pode ocorrer uma explosão de subclasses em determinada estrutura

## Implementação

Veja o código e os diagramas dessa pasta para entender como o Decorator é implementado.

## Consequências

O que é bom ou ruim no Decorator:

**Bom:**
- Composição é melhor do que herança em grande maioria dos casos
- É fácil adicionar ou remover comportamento de objetos sem tocar em código já escrito ou testado (OCP)
- É possível decorar um objeto já decorado, adicionando ainda mais funcionalidades (camadas)

**Ruim:**
- Quanto mais decorators em camadas, mais complexo seu código se torna

## 🔗 Referência  

Este conteúdo é baseado nos conceitos originais dos **Design Patterns: Elements of Reusable Object-Oriented Software** da GoF (Gang of Four).

Este readme foi apenas copiado do repósitorio do professor Otavio Miranda estando disponivel no seu github https://github.com/luizomf/design-patterns-typescript