package behavioural.templateMethod;

// Subclasse que implementa o método específico para chá
class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("Infundindo o chá");
    }

    @Override
    void addCondiments() {
        System.out.println("Adicionando limão");
    }
}

// Subclasse que implementa o método específico para café