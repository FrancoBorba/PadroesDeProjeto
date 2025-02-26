package behavioural.templateMethod;

// Subclasse que implementa o método específico para café
class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Preparando o café");
    }

    // O método addCondiments pode ser usado como está ou sobrescrito
}