package JavaCourseworkUP845111;

public class OrderTest {

    public static void main(String[] args){

        Order myOrder = new Order();

        myOrder.addPizza(Size.Medium, Crust.Thin, Topping1.Extra_Cheese, Topping2.Chilli, Sauce.Pesto);
        myOrder.addPizza(Size.Medium, Crust.Stuffed, Topping1.Olives, Topping2.Onion, Sauce.Pesto);
        myOrder.addPizza(Size.Small, Crust.Thin, Topping1.Chilli, Topping2.Pepperoni, Sauce.Pesto);
        myOrder.addPizza(Size.Small, Crust.Thin, Topping1.Olives, Topping2.Olives, Sauce.Pesto);

        System.out.println(myOrder.getCostOfOrder());
    }
}
