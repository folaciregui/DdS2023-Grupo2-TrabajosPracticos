package builder;
import builder.*;

public class Program {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();
        PizzaBuilder picantePizzaBuilder = new PicantePizzaBuilder();

        System.out.println("Con Hawai:");
        cocina.setPizzaBuilder(hawaiPizzaBuilder);
        cocina.construirPizza();
        Pizza pizza = cocina.getPizza();

        System.out.println("Con Picante:");
        cocina.setPizzaBuilder(picantePizzaBuilder);
        cocina.construirPizza();
        Pizza pizza2 = cocina.getPizza();
    }
}