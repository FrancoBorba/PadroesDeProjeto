# Prototype - Creational (Criação)

## Intenção

*Especificar os tipos de objetos a serem criados usando uma instância-protótipo e criar novos objetos pela cópia desse protótipo.*

---

## Destilando a intenção

Em vídeo: https://www.youtube.com/watch?v=Z-_smcjkdwM&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=8

A intenção acima significa que você pode criar objetos protótipos que têm um método específico (`clone`) para clonar seus dados em um novo objeto. Isso evita a recriação de objetos caros ou complexos para serem criados.

---

## Implementação

Veja o código dessa mesma pasta.

## Estrutura

Veja a pasta diagramas nessa mesma pasta.

## Aplicabilidade

Use o Prototype quando:

- precisar que seu código não dependa de classes concretas para a criação de novos objetos
- quiser evitar explosão de subclasses para objetos muito similares
- quiser evitar a recriação de objetos "caros" ou "complexos"

## Consequências

O que é bom ou ruim no Prototype:

**Bom:**
- Oculta classes concretas do código cliente
- Ajuda na criação de objetos caros ou complexos
- Evita a explosão de subclasses

**Ruim:**

- Clonar objetos que que tem referências para outros objetos pode ser super complexo

## 🔗 Referência  

Este conteúdo é baseado nos conceitos originais dos **Design Patterns: Elements of Reusable Object-Oriented Software** da GoF (Gang of Four).

Este readme foi apenas copiado do repósitorio do professor Otavio Miranda estando disponivel no seu github https://github.com/luizomf/design-patterns-typescript
