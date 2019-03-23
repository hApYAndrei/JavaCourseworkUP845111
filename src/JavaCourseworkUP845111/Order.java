package JavaCourseworkUP845111;
import java.util.ArrayList;

public class Order {

    //Create ArrayList
    private ArrayList<Pizza> orders;

    public Order(){ orders = new ArrayList<Pizza>(); }

    //Method that adds pizza to the order
    public void addPizza(Size size, Crust crust, Topping1 topping1, Topping2 topping2, Sauce sauce){

        Pizza thePizza = new Pizza(size, crust, topping1, topping2, sauce);

        orders.add(thePizza);
    }

    //Method that return a formatted String for the whole order
    public String getInfo(){

        String pizzas = "";

        for(Pizza i : orders){

//            pizzas += String.format("\n Your Order:\n %s",i.getInfo());

            pizzas += String.format("\nTOTAL PRICE: £%s \n%s Size: £%s \n%s Crust: £%s \nBASE COST: £%s \n%s Topping: 5 * £%s = £%.2f \n%s Topping: 4 * £%.2f = £%.2f \n%s Sauce: £%.2f\n",
                    i.getTotalPrice(), i.getSize(), i.getSizeValue(), i.getCrust(), i.getCrustValue(), i.getBase(), i.getTopping1(), i.getTopping1Value(), 5 * i.getTopping1Value(), i.getTopping2(),
                    i.getTopping2Value(), 4 * i.getTopping2Value(), i.getSauce(), i.getSauceValue());
        }

        return pizzas;
    }

    //Method that calculates and returns the cost of the whole order
    public String getCostOfOrder(){

        double priceOrder = 0;

        for (Pizza i : orders){

            priceOrder += i.getTotalPrice();
        }

        return String.format("The total price for the order is: £%.2f", priceOrder);
    }

    //Method that returns the number of the pizzas in the order

    //Method that selects and deletes a specific pizza in the order

    //Method that selects and updates a specific pizza from the order
}
