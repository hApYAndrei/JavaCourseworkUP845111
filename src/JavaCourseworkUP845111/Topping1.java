package JavaCourseworkUP845111;

public enum Topping1 {

    None ("No Topping", 0.00), Olives ("Olive Topping",0.08), Extra_Cheese ("Extra Cheese Topping",0.02), Chilli ("Chilli Topping",0.06), Pepperoni ("Pepperoni Topping",0.10), Mushroom ("Mushroom Topping",0.03), Rocket ("Rocket Topping",0.05), Jalapenos ("Jalapeno Topping",0.20), Onion ("Onion Topping",0.07), Anchovy ("Anchovy Topping",0.09);

    private String name;
    private double value;

    Topping1(String name, double value) { this.name = name; this.value = value; }

    public double getValue() { return this.value; }
    public double getValueTopping1() { return this.value * 5; }
    public String getName() { return this.name; }
}
