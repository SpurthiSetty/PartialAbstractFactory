
// Main function to order pizzas
public class MyPizzaApp {
    public static void main(String[] args) {
        // Order Veggie Pizza from NY Pizza Store
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.orderPizza("veggie");
        System.out.println("Ordered a " + nyPizza.getName() + "\n");
        System.out.println(nyPizza);

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Ordered a " + chicagoPizza.getName() + "\n");
        System.out.println(chicagoPizza);
    }
}