package JavaCourseworkUP845111;

public enum Size {

    SMALL ("Small Size", 9.45), MEDIUM ("Medium Size",11.87), LARGE ("Large Size",15.90);

    private String name;
    private double value;

    Size(String name, double value) { this.name = name; this.value = value; }

    public double getValue() { return this.value; }
    public String getValueAsString() { return String.valueOf(this.value); }
    public String getName() { return this.name; }
}

