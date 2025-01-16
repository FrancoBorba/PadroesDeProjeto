# Padrões de Projeto de Criação (Creational)

Os padrões de projeto de criação são responsáveis por abstrair o processo de instanciação de objetos. Eles ajudam a tornar um sistema **independente** de como seus objetos são representados, criados e compostos.  

---

## 📋 O que são padrões de criação?

Esses padrões delegam as tarefas de criação para outros objetos, proporcionando maior flexibilidade ao sistema. O objetivo principal é **ocultar o conhecimento** sobre:  
- **O que** está sendo criado;  
- **Como** os objetos são criados;  
- **Quando** e **quem** está envolvido no processo de criação.  

Com isso, eles eliminam dependências do cliente relacionadas à criação e composição de objetos, promovendo sistemas mais escaláveis e de fácil manutenção.

---

## ✨ Vantagens dos padrões de criação

- **Flexibilidade**: O cliente não precisa saber sobre classes concretas ou detalhes de implementação.  
- **Encapsulamento**: O processo de criação é abstraído e centralizado.  
- **Reutilização**: Permite criar objetos em diferentes contextos de forma consistente.  
- **Independência**: Torna o sistema menos acoplado à implementação dos objetos.

---

## 🛠️ Padrões e Intenções

### 1. **Abstract Factory**  
Fornece uma **interface** para criação de famílias de objetos relacionados ou dependentes, sem especificar suas classes concretas.  

**Intenção**: Garantir que os objetos criados em conjunto sejam compatíveis e pertencentes à mesma família.  

---

### 2. **Builder**  
Separa a **construção** de um objeto complexo de sua **representação**, permitindo que o mesmo processo de construção crie diferentes representações.  

**Intenção**: Simplificar a criação de objetos com muitos parâmetros ou estados complexos.  

---

### 3. **Factory Method**  
Define uma **interface** para criar um objeto, mas permite que as subclasses decidam qual classe concreta será instanciada.  

**Intenção**: Adiar a instanciação de objetos às subclasses, promovendo flexibilidade e escalabilidade.  

---

### 4. **Prototype**  
Especifica os tipos de objetos a serem criados usando uma **instância prototípica** e cria novos objetos copiando esse protótipo.  

**Intenção**: Criar objetos de forma eficiente, sem depender diretamente de suas classes concretas.  

---

### 5. **Singleton**  
Garante que uma classe tenha somente **uma instância** e fornece um **ponto global de acesso** a ela.  

**Intenção**: Controlar o acesso e garantir a unicidade de uma instância global no sistema.  

---

## 🔗 Referência  

Este conteúdo é baseado nos conceitos originais dos **Design Patterns: Elements of Reusable Object-Oriented Software** da GoF (Gang of Four).

Este readme foi apenas copiado do repósitorio do professor Otavio Miranda estando disponivel no seu github https://github.com/luizomf/design-patterns-typescript
