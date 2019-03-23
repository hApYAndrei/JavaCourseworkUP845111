package JavaCourseworkUP845111;
import java.util.ArrayList;

public class Order {

    //Create ArrayList
    private ArrayList<Pizza> orders;

    public Order(){ orders = new ArrayList<Pizza>(); }

    //Method that adds pizza to the order
    public void addOrder(Size size, Crust crust, Topping1 topping1, Topping2 topping2, Sauce sauce){

        Pizza thePizza = new Pizza(size, crust, topping1, topping2, sauce);

        orders.add(thePizza);
    }

    //Method that return a formatted String for the whole order

    //Method that calculates and returns the cost of the whole order

    //Method that returns the number of the pizzas in the order

    //Method that selects and deletes a specific pizza in the order

    //Method that selects and updates a specific pizza from the order
}
