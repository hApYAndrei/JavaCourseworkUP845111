package JavaCourseworkUP845111;

public class OrderTest {

    public static void main(String[] args){

        Order myOrder = new Order();

        myOrder.addPizza(Size.MEDIUM, Crust.THIN, Topping1.EXTRA_CHEESE, Topping2.CHILLI, Sauce.PESTO);
        myOrder.addPizza(Size.MEDIUM, Crust.STUFFED, Topping1.OLIVES, Topping2.ONION, Sauce.PESTO);
        myOrder.addPizza(Size.SMALL, Crust.THIN, Topping1.CHILLI, Topping2.PEPPERONI, Sauce.PESTO);
        myOrder.addPizza(Size.SMALL, Crust.THIN, Topping1.OLIVES, Topping2.OLIVES, Sauce.PESTO);

        System.out.println(myOrder.getInfo());
    }
}
