# Padrões de projeto comportamentais (behavioural)

Os padrões de projeto comportamentais se preocupam com os algoritmos e a atribuição de responsabilidades entre objetos. Os padrões comportamentais não descrevem apenas padrões de objetos ou classes, mas também os padrões de comunicação entre eles. Esses padrões caracterizam fluxos de controle difíceis de seguir em tempo de execução. Eles afastam o foco do fluxo de controle para permitir que você se concentre somente na maneira como os objetos são interconectados.

## Padrões e intenções

Os padrões de projeto comportamentais originais da GoF são:

- **Chain of responsibility** - evita o acoplamento do remetente de uma solicitação ao seu destinatário, dando a mais de um objeto a chance de tratar a solicitação. Encadeia os objetos receptores e passa a solicitação ao longo da cadeia até que um objeto a trate.  
- **Command** - encapsula uma solicitação como um objeto, desta forma permitindo que você parametrize clientes com diferentes solicitações, enfileire ou registre (log) solicitações e suporte operações que podem ser desfeitas.
- **Interpreter** - dada uma linguagem, define um representação para sua gramática juntamente com um interpretador que usa a representação para interpretar sentenças nesta linguagem.
- **Iterator** - fornece uma maneira de acessar sequencialmente os elementos de um objeto agregado sem expor sua representação subjacente.
- **Mediator** - define um objeto que encapsula como um conjunto de objetos interage. O mediator promove o acoplamento fraco ao evitar que os objetos se refiram explicitamente uns aos outros, permitindo que você varie suas interações independentemente.
- **Memento** - sem violar a encapsulação, captura e externaliza um estado interno de um objeto, de modo que o mesmo possa posteriormente ser restaurado para este estado.
- **Observer** - define uma dependência um para muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são automaticamente notificados e atualizados.
- **State** - permite que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado sua classe. 
- **Strategy** - Define uma família de algoritmos, encapsular cada um deles e fazê-los intercambiáveis. O strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.

## 🔗 Referência  

Este conteúdo é baseado nos conceitos originais dos **Design Patterns: Elements of Reusable Object-Oriented Software** da GoF (Gang of Four).

Este readme foi apenas copiado do repósitorio do professor Otavio Miranda estando disponivel no seu github https://github.com/luizomf/design-patterns-typescript