package JavaCourseworkUP845111;

public enum Topping2 {

    NONE ("No Topping", 0.00), OLIVES ("Olive Topping",0.08), EXTRA_CHEESE ("Extra Cheese Topping",0.02), CHILLI ("Chilli Topping",0.06), PEPPERONI ("Pepperoni Topping",0.10), MUSHROOM ("Mushroom Topping",0.03), ROCKET ("Rocket Topping",0.05), JALAPENOS ("Jalapeno Topping",0.20), ONION ("Onion Topping",0.07), ANCHOVY ("Anchovy Topping",0.09);

    private String name;
    private double value;

    Topping2(String name, double value) { this.name = name; this.value = value; }

    public double getValue() { return this.value; }
    public double getValueTopping2() { return this.value * 4; }
    public String getName() { return this.name; }
}
