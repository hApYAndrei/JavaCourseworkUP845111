package JavaCourseworkUP845111;

public enum Sauce {

    TOMATO ("Tomato Sauce",0.00), PESTO ("Pesto Sauce",0.50);

    private String name;
    private double value;

    Sauce(String name, double value) { this.name = name; this.value = value; }

    public double getValue() { return this.value; }
    public String getName() { return this.name; }
}

