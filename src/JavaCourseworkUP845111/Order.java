package JavaCourseworkUP845111;
import java.util.ArrayList;
import java.util.Iterator;

public class Order {

    //Create ArrayList
    private ArrayList<Pizza> orders;

    public Order() { orders = new ArrayList<Pizza>(); }

    //Method that adds pizza to the order
    public void addPizza(Size size, Crust crust, Topping1 topping1, Topping2 topping2, Sauce sauce){

        Pizza thePizza = new Pizza(size, crust, topping1, topping2, sauce);

        orders.add(thePizza);
    }

    //Method that return a formatted String for the whole order
    public String getInfo(){

        String pizzas = "";

        for (Pizza p : orders){

            pizzas += p.getInfo();

            /*pizzas += String.format("\nTOTAL PRICE: £%.2f \n%s Size: £%.2f \n%s Crust: £%.2f \nBASE COST: £%.2f " +
                            "\n%s Topping: 5 * £%.2f = £%.2f \n%s Topping: 4 * £%.2f = £%.2f \n%s Sauce: £%.2f\n",
                    p.getTotalPrice(), p.getSize(), p.getSizeValue(), p.getCrust(), p.getCrustValue(), p.getBase(),
                    p.getTopping1(), p.getTopping1Value(), 5 * p.getTopping1Value(), p.getTopping2(),
                    p.getTopping2Value(), 4 * p.getTopping2Value(), p.getSauce(), p.getSauceValue());*/
        }

        return pizzas;
    }

    //Method that calculates and returns the cost of the whole order
    public String getCostOfOrder(){

        double priceOrder = 0;

        for (Pizza p : orders){

            priceOrder += p.getTotalPrice();
        }

        return String.format("\nThe total price for the order is: £%.2f", priceOrder);
    }

    //Method that returns the number of the pizzas in the order
    public String getNumberOfThePizzas(){

        return String.format("\nThe number of the pizzas in the order is: %s", orders.size());
    }

    //Method that selects and deletes a specific pizza in the order
    public void deletePizza(Size size, Crust crust, Topping1 topping1, Topping2 topping2, Sauce sauce){

        Iterator<Pizza> iter = orders.iterator();

        while ( iter.hasNext()){

            Pizza p = iter.next();

            if ( p.getSize().equals(size) && p.getCrust().equals(crust) && p.getTopping1().equals(topping1)
                    && p.getTopping2().equals(topping2) && p.getSauce().equals(sauce)){

                iter.remove();
            }
        }
    }

    //Method that selects and updates a specific pizza from the order
    public void updatePizza(Size size, Crust crust, Topping1 topping1, Topping2 topping2, Sauce sauce, Size newSize,
                            Crust newCrust, Topping1 newTopping1, Topping2 newTopping2, Sauce newSauce){

        for (Pizza p : orders){

            if ( p.getSize().equals(size) && p.getCrust().equals(crust) && p.getTopping1().equals(topping1)
                    && p.getTopping2().equals(topping2) && p.getSauce().equals(sauce)){

                p.setSize(newSize);
                p.setCrust(newCrust);
                p.setTopping1(newTopping1);
                p.setTopping2(newTopping2);
                p.setSauce(newSauce);
                break;
            }
        }
    }
}
