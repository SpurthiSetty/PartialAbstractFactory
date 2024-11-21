
// Main function to order pizzas
public class MyPizzaApp {
    public static void main(String[] args) {
        // Order Cheese Pizza from NY Pizza Store
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ordered a " + nyPizza.getName() + "\n");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("Ordered a " + chicagoPizza.getName() + "\n");
    }
}
