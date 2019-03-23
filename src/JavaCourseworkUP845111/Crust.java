package JavaCourseworkUP845111;

public enum Crust {

    Thin ("Thin Crust",1.08), Deep ("Deep Crust",1.10), Stuffed ("Stuffed Crust",2.14);

    private String name;
    private double value;

    Crust(String name, double value) { this.name = name; this.value = value; }

    public double getValue() { return this.value; }
    public String getValueAsString() { return String.valueOf(this.value); }
    public String getName() { return this.name; }
}

