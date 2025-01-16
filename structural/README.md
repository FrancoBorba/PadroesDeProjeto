# Padrões de Projeto Estruturais (Structural)

Os padrões de projeto estruturais são responsáveis por definir como **objetos são compostos** para formar **estruturas maiores e mais complexas**. Eles se concentram em organizar e estruturar as interações entre objetos, promovendo sistemas mais flexíveis e reutilizáveis.  

---

## 📋 O que são padrões estruturais?

Esses padrões têm como objetivo principal otimizar a composição de objetos, garantindo que as dependências sejam minimizadas e que o sistema seja mais fácil de entender, manter e expandir.  

---

## ✨ Vantagens dos padrões estruturais

- **Reutilização**: Facilitam o reaproveitamento de componentes existentes em novos contextos.  
- **Flexibilidade**: Simplificam a modificação e expansão de estruturas de software.  
- **Manutenção**: Melhoram a organização e legibilidade do código, tornando-o mais intuitivo.  

---

## 🛠️ Padrões e Intenções

### 1. **Adapter**  
Converte a interface de uma classe em outra interface esperada pelos clientes.  

**Intenção**: Permitir que classes com interfaces incompatíveis trabalhem em conjunto.  

---

### 2. **Bridge**  
Separa uma abstração de sua implementação, permitindo que ambas variem independentemente.  

**Intenção**: Promover a independência entre abstrações e implementações, facilitando extensões futuras.  

---

### 3. **Composite**  
Compoe objetos em estruturas de **árvore** para representar hierarquias "parte-todo".  

**Intenção**: Permitir que clientes tratem objetos individuais e composições de objetos de maneira uniforme.  

---

### 4. **Decorator**  
Atribui responsabilidades adicionais a um objeto **dinamicamente**.  

**Intenção**: Oferecer uma alternativa flexível à herança para estender funcionalidades.  

---

### 5. **Façade**  
Fornece uma **interface unificada** para um conjunto de interfaces em um subsistema.  

**Intenção**: Simplificar a interação com subsistemas complexos, oferecendo uma visão de alto nível.  

---

### 6. **Flyweight**  
Usa **compartilhamento** para suportar grandes quantidades de objetos de granularidade fina de maneira eficiente.  

**Intenção**: Minimizar o uso de recursos ao compartilhar objetos semelhantes em várias partes do sistema.  

---

### 7. **Proxy**  
Fornece um **objeto representante** ou marcador para outro objeto, controlando o acesso a ele.  

**Intenção**: Controlar o acesso ou adicionar funcionalidades a um objeto sem modificar diretamente sua implementação.  

---

## 🔗 Referência  

Este conteúdo é baseado nos conceitos originais dos **Design Patterns: Elements of Reusable Object-Oriented Software** da GoF (Gang of Four).

Este readme foi apenas copiado do repósitorio do professor Otavio Miranda estando disponivel no seu github https://github.com/luizomf/design-patterns-typescript