package JavaCourseworkUP845111;

import java.awt.*;

public class TestPizza {

    public static void main(String[] args){

        //Create Pizza

        Pizza myPizza = new Pizza();

        System.out.println("\n");
        System.out.println("******First Sample******");

        Pizza PizzaOne = new Pizza(Size.MEDIUM, Crust.THIN, Topping1.EXTRA_CHEESE, Topping2.CHILLI, Sauce.PESTO);
        System.out.print(PizzaOne.getInfo());
        /*System.out.println("\n");
        System.out.print("Cost of Pizza " + PizzaOne.getTotalPrice());*/

        System.out.println("\n");
        System.out.println("******Second Sample******");

        Pizza PizzaTwo = new Pizza(Size.MEDIUM, Crust.STUFFED, Topping1.OLIVES, Topping2.ONION, Sauce.PESTO);
        System.out.print(PizzaTwo.getInfo());
        /*System.out.println("\n");
        System.out.print("Cost of Pizza " + PizzaTwo.getTotalPrice());*/

        System.out.println("\n");
        System.out.println("******Third Sample******");

        Pizza PizzaThree = new Pizza(Size.SMALL, Crust.THIN, Topping1.CHILLI, Topping2.PEPPERONI, Sauce.PESTO);
        System.out.println(PizzaThree.getInfo());
        /*System.out.println("\n");
        System.out.print("Cost of Pizza " + PizzaThree.getTotalPrice());*/

        System.out.println("\n");
        System.out.println("******Fourth Sample******");

        Pizza PizzaFour = new Pizza(Size.SMALL, Crust.THIN, Topping1.OLIVES, Topping2.OLIVES, Sauce.PESTO);
        System.out.println(PizzaFour.getInfo());
        /*System.out.println("\n");
        System.out.print("Cost of Pizza " + PizzaFour.getTotalPrice());*/
    }
}
