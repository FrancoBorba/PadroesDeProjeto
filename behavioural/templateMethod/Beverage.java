package behavioural.templateMethod;
// Classe abstrata que define o esqueleto do algoritmo
abstract class Beverage {
    // Método template
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Passos comuns
    void boilWater() {
        System.out.println("Aquecendo a água");
    }

    void pourInCup() {
        System.out.println("Despejando na xícara");
    }

    // Método abstrato que as subclasses devem implementar
    abstract void brew();

    // Método opcional que pode ser sobrescrito pelas subclasses
    void addCondiments() {
        System.out.println("Adicionando condimentos");
    }
}