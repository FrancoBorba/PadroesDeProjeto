package behavioural.templateMethod;

// Classe principal para testar o padrão
public class TemplateMethodExample {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("Preparando chá:");
        tea.prepareRecipe();

        System.out.println("\nPreparando café:");
        coffee.prepareRecipe();
    }
}