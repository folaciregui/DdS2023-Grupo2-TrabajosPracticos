public class PicantePizzaBuilder extends PizzaBuilder {
    public PicantePizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildMasa() {
        pizza.setMasa("cocido");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("picante");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("pimienta+salchichón");
    }
}