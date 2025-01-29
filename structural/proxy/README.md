# Proxy - Structural (Estrutural)

## Intenção

*Proxy é um padrão de projeto que tem a intenção de fornecer um substituto (surrogate) ou marcador de localização para outro objeto para controlar o acesso a esse objeto.*

---

## Sobre o Proxy

Em vídeo: https://www.youtube.com/watch?v=EsxPyICeBPs&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=23

Proxy é um padrão de projeto muito similar a outros padrões que usam composição, como *Composite* e *Decorator*. Apesar disso, as intenções dos três padrões são diferentes. 

A intenção do proxy é ter um objeto (o proxy) que fingirá ser o objeto real para controle de acesso. O objeto Proxy receberá as solicitações que seriam enviadas ao objeto real e terá controle sobre como e quando encaminha-las (ou não) para objeto real. O objeto proxy atinge seu objetivo se posicionando entre o código cliente e o objeto real.

Isso é interessante em vários cenários. Por exemplo, o objeto proxy pode:

- fazer cache de chamadas para objetos caros para o sistema
- criar logs de acesso, avisos ou erros
- controle de acesso (autenticação)
- distribuir serviços
- adiar instanciações (lazy instantiation) ou execuções (lazy evaluation)
- e mais (as possibilidades são basicamente controladas pela sua criatividade)

Com base no modo como os proxies são usados, o padrão pode ser classificado como:

- Proxy Virtual: controla acesso a recursos que podem ser caros para criação ou utilização.
- Proxy Remoto: controla acesso a recursos que estão em servidores remotos.
- Proxy de proteção: controla acesso a recursos que possam necessitar autenticação ou permissão.
- Proxy inteligente: além de controlar acesso ao objeto real, também executa tarefas adicionais para saber quando e como executar determinadas ações.

### Diferenças entre *Composite*, *Decorator* e *Proxy*

Composite, Decorator e Proxy são padrões com estruturas semelhantes, porém com intenções diferentes, veja:

- **Composite** - compor objetos em estruturas de árvore para representarem hierarquias partes-todo. Composite permite aos cliente tratarem de maneira uniforme objetos individuais e composições de objetos.
- **Decorator** - atribui responsabilidades adicionais a um objeto dinamicamente. Os Decorators fornecem uma alternativa flexível à subclasses para extensão da funcionalidade.
- **Proxy** - fornece um objeto representante (surrogate), ou um marcador de outro objeto para controlar o acesso ao mesmo. 

Dentre esses três padrões, o *Decorator* e o *Proxy* tem confundido muito mais meus alunos do que *Composite* e *Proxy*, por isso segue um trecho do livro da GoF detalhando a diferença:

> (GoF PT-BR pág. 209) ...Diferentemente do *Decorator*, o padrão *Proxy* não está preocupado em incluir ou excluir comportamentos dinamicamente e não está projetado para composição recursiva. Sua intenção é fornecer um substituto para um objeto quando for inconveniente ou indesejável acessá-lo diretamente porque, por exemplo, está numa máquina remota, tem acesso restrito ou é persistente.

Apesar de estruturas parecidas, todas as intenções refletem exatamente o que cada padrão resolve.

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padrão Proxy quando:

- você tem um objeto caro para ser criado e não quer permitir acesso direto a esse objeto (proxy virtual)
- você que restringir acesso a partes da sua aplicação (proxy de proteção)
- você quer uma ligação entre seu sistema e um sistema remoto. O proxy pode fingir ser a interface do objeto remoto e lidar com toda a complexidade de conexão e transmissão de dados (proxy remoto)
- você quer fazer cache de chamadas já realizadas (proxy inteligente ou proxy de cache)

## Implementação

Veja o código e os diagramas dessa pasta para entender como o Proxy é implementado.

## Consequências

O que é bom ou ruim no Proxy:

**Bom:**
- O código cliente nem precisa saber se está ou não usando um Proxy (ele finge ser o objeto real)
- Você pode adicionar novos Proxies sem mudar código já testado (OCP)
- O Proxy funciona mesmo se o objeto real não estiver operacional ou pronto para uso
- Você pode controlar o ciclo de vida de objetos reais dentro do proxy

**Ruim:**
- Introduz mais classes ao sistema isso o torna mais complexo 


## 🔗 Referência  

Este conteúdo é baseado nos conceitos originais dos **Design Patterns: Elements of Reusable Object-Oriented Software** da GoF (Gang of Four).

Este readme foi apenas copiado do repósitorio do professor Otavio Miranda estando disponivel no seu github https://github.com/luizomf/design-patterns-typescript