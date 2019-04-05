package JavaCourseworkUP845111;

public enum Size {

    Small ("Small Size", 9.45),
    Medium ("Medium Size",11.87),
    Large ("Large Size",15.90);

    private String name;
    private double value;

    Size (String name, double value) {

        this.name = name;
        this.value = value;
    }

    public double getValue() {

        return this.value;
    }

    public String getName() {

        return this.name;
    }
}

