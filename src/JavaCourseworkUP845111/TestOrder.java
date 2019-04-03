package JavaCourseworkUP845111;

public class TestOrder {

    public static void main(String[] args) {

        Order myOrder = new Order();

        System.out.println("\n");
        System.out.println("*********************ADDING PIZZA*********************\n");

        System.out.println("******Order List******");
        System.out.println(myOrder.getInfo());
        System.out.println("-Empty Order List\n");

        System.out.println("******Add Pizza to Order List******");
        myOrder.addPizza(Size.Medium, Crust.Thin, Topping1.Extra_Cheese, Topping2.Chilli, Sauce.Pesto);
        System.out.println(myOrder.getInfo());

        System.out.println("******Add Second Pizza to Order List******");
        myOrder.addPizza(Size.Medium, Crust.Stuffed, Topping1.Olives, Topping2.Onion, Sauce.Pesto);
        System.out.println(myOrder.getInfo());

        System.out.println("******Add Third Pizza to Order List******");
        myOrder.addPizza(Size.Small, Crust.Thin, Topping1.Chilli, Topping2.Pepperoni, Sauce.Pesto);
        System.out.println(myOrder.getInfo());

        System.out.println("******Add Forth Pizza to Order List******");
        myOrder.addPizza(Size.Small, Crust.Thin, Topping1.Olives, Topping2.Olives, Sauce.Pesto);
        System.out.println(myOrder.getInfo());


        System.out.println("*********************REMOVING A PIZZA*********************");
        myOrder.deletePizza(Size.Small, Crust.Thin, Topping1.Olives, Topping2.Olives, Sauce.Pesto);
        System.out.println(myOrder.getInfo());


        System.out.println("*********************UPDATING A PIZZA*********************");
        myOrder.updatePizza(Size.Medium, Crust.Thin, Topping1.Extra_Cheese, Topping2.Chilli, Sauce.Pesto, Size.Large,
                Crust.Deep, Topping1.Rocket, Topping2.Extra_Cheese, Sauce.Tomato);
        System.out.println(myOrder.getInfo());


        System.out.println("*********************TOTAL COST OF THE ORDER*********************");
        System.out.print(myOrder.getCostOfOrder());
        System.out.println("\n");


        System.out.println("*********************NUMBER OF PIZZAS IN THE ORDER*********************");
        System.out.print(myOrder.getNumberOfThePizzas());
        System.out.println("\n");
    }
}
