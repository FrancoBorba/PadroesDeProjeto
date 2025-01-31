# Strategy - Behavioural (Comportamental)

## Intenção

*Definir uma família de algoritmos, encapsular cada um deles e fazê-los intercambiáveis. O strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.*

---

## Sobre o Strategy

Em vídeo: https://www.youtube.com/watch?v=mUagTgSnriQ&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=27

O Strategy é um padrão de projeto que visa separar o conceito de algoritmo da regra de negócio para permitir que vários algoritmos possam ser implementados sem a necessidade de alterar a regra de negócio ou outros algoritmos que já existam no sistema.

Veja um exemplo de um problema e a solução do strategy.

### Problema

Imagine que você tem um e-commerce que implementa promoções esporadicamente para aumentar as vendas. 

As promoções podem variar de acordo com a época, com o preço total do carrinho de compras ou até com a quantidade de produtos adquiridos pelo cliente. Por exemplo: *compre 3 produtos e ganhe 10% de desconto*; *compre R$150 e ganhe 15% de desconto*; *compre 5 produtos da categoria X e ganhe outro*.

Essa promoções podem gerar muitas condicionais dentro da regra de negócio do carrinho de compras ao obter o preço com desconto. Como, por exemplo:

```typescript
// - Carrinho precisa ter no mínimo 3 produtos
// - De acordo com o valor total o desconto pode aumentar
if (cart.quantity >= 3) {
  if (cart.total >= 100 && cart.total < 200) {
    cart.discount = 10; // 10%
  } else if (cart.total >= 200 && cart.total < 300) {
    cart.discount = 20; // 20%
  } else if (cart.total >= 300) {
    cart.discount = 30; // 30%
  }
}
```
Não há problemas nessa lógica enquanto houver apenas essa promoção. Porém, a partir do momento que a promoção muda ou que implementemos outras promoções que são aplicadas ao mesmo tempo, devemos alterar a classe do carrinho de compras. Isso quebra o princípio do Aberto/Fechado e o princípio da responsabilidade única. E tem mais, se quiséssemos guardar a promoção antiga para retorná-la posteriormente, eu penso que alguns programadores poderiam pensar em fazer algo assim:

```typescript
// SOLUÇÃO INGÊNUA (NUNCA FAÇA ISSO)
// Vamos precisar dessa promoção posteriormente
// Então vamos comentar o código antigo
//
// Promoção antiga
// if (cart.quantity > 3) {
//   if (cart.total >= 100 && cart.total < 200) {
//     cart.discount = 10; // 10%
//   } else if (cart.total >= 200 && cart.total < 300) {
//     cart.discount = 20; // 20%
//   } else if (cart.total >= 300) {
//     cart.discount = 30; // 30%
//   }
// }

// Nova promoção
if (cart.total >= 150) {
  cart.discount = 5; // 5%
}
```

Além de não ser uma solução, continuamos quebrando o princípio da responsabilidade única e o princípio do aberto/fechado. Não bastasse isso, também estamos quebrando todos os testes que já foram criados anteriormente para a classe do carrinho de compras.

### Solução - Strategy

O Strategy diz que devemos separar os algoritmos da classe do carrinho de compras. 

Nesse caso, podemos gerar uma família de algoritmos que implementam a mesma interface e podem aplicar descontos diferentes da maneira que precisarmos.

Poderíamos, por exemplo, ter uma interface `DiscountStrategy` com o método `getDiscount` para garantir que todas as classes de desconto tenham o método `getDiscount`. 

Agora podemos fazer com que o carrinho de compras tenha um campo para receber uma classe do tipo `DiscountStrategy`. Ao chamar o método para obter o valor total no carrinho de compras, ele não precisa fazer nenhuma lógica adicional, basta chamar a sua estratégia de desconto.

Por exemplo:

```typescript
export class ShoppingCart {
  private discount: DiscountStrategy = new DefaultDiscount();
  
  // ... Código omitido

  getTotal(): number {
    return this.discount.getDiscount(this);
  }

  // ... Código omitido
}
```

Perceba que a classe do carrinho de compras não precisa fazer nenhuma lógica complexa sobre qual desconto aplicar, ela simplesmente delega a tarefa de aplicar desconto para outra classe que terá apenas um responsabilidade, aplicar um desconto.

Melhor do que isso, agora você pode mudar de promoção quando quiser simplesmente configurando o campo `discount`, por exemplo:

```typescript
export class ShoppingCart {
  private discount: DiscountStrategy = new DefaultDiscount();
  
  // ... Código omitido

  getTotal(): number {
    return this.discount.getDiscount(this);
  }

  setDiscount(discount: DiscountStrategy): void {
    // Configura um outro desconto qualquer
    this.discount = discount;
  }

  // ... Código omitido
}
```

Para trocar de promoção de desconto, apenas crie uma nova classe com o algoritmo do novo desconto e configure o carrinho usando `setDiscount`.

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o Strategy quando:

- você tiver variantes de um mesmo algoritmo e precisa trocar esses algoritmos em tempo de execução;
- você precisar isolar a regra de negócio do algoritmo que deve ser aplicado (aplicando o princípio da responsabilidade única)
- você perceber que está usando condicionais apenas para trocar o resultado final de um algoritmo

## Implementação

Veja o código e os diagramas dessa pasta para entender como o Strategy é implementado.

## Consequências

O que é bom ou ruim no Strategy:

**Bom:**
- Troca herança por composição
- Separa a regra de negócio de algoritmos complexos
- Aplica os princípios do aberto/fechado e da responsabilidade única

**Ruim:**
- Pode ser complexo criar toda uma hierarquia de classes para aplicar novos algoritmos
- Você pode obter o mesmo resultado com funções caso a linguagem de programação permitir
- O código cliente precisa conhecer as estratégias que vai usar

## 🔗 Referência  

Este conteúdo é baseado nos conceitos originais dos **Design Patterns: Elements of Reusable Object-Oriented Software** da GoF (Gang of Four).

Este readme foi apenas copiado do repósitorio do professor Otavio Miranda estando disponivel no seu github https://github.com/luizomf/design-patterns-typescript