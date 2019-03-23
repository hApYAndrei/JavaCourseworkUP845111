package JavaCourseworkUP845111;

public class TestPizza {

    public static void main(String[] args){

        //Create Pizza

        Pizza myPizza = new Pizza();

        System.out.println("\n");
        System.out.println("******First Sample******");

        Pizza PizzaOne = new Pizza(Size.Medium, Crust.Thin, Topping1.Extra_Cheese, Topping2.Chilli, Sauce.Pesto);
        System.out.print(PizzaOne.getInfo());
        /*System.out.println("\n");
        System.out.print("Cost of Pizza " + PizzaOne.getTotalPrice());*/

        System.out.println("\n");
        System.out.println("******Second Sample******");

        Pizza PizzaTwo = new Pizza(Size.Medium, Crust.Stuffed, Topping1.Olives, Topping2.Onion, Sauce.Pesto);
        System.out.print(PizzaTwo.getInfo());
        /*System.out.println("\n");
        System.out.print("Cost of Pizza " + PizzaTwo.getTotalPrice());*/

        System.out.println("\n");
        System.out.println("******Third Sample******");

        Pizza PizzaThree = new Pizza(Size.Small, Crust.Thin, Topping1.Chilli, Topping2.Pepperoni, Sauce.Pesto);
        System.out.println(PizzaThree.getInfo());
        /*System.out.println("\n");
        System.out.print("Cost of Pizza " + PizzaThree.getTotalPrice());*/

        System.out.println("\n");
        System.out.println("******Fourth Sample******");

        Pizza PizzaFour = new Pizza(Size.Small, Crust.Thin, Topping1.Olives, Topping2.Olives, Sauce.Pesto);
        System.out.println(PizzaFour.getInfo());
        /*System.out.println("\n");
        System.out.print("Cost of Pizza " + PizzaFour.getTotalPrice());*/
    }
}
