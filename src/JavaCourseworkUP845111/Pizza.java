package JavaCourseworkUP845111;

public class Pizza {

    //Member Variable
    private Size size;
    private Crust crust;
    private double base;
    private Topping1 topping1;
    private Topping2 topping2;
    private Sauce sauce;
    private double totalprice;

    //Constructor
    public Pizza() { }

    public Pizza(Size size, Crust crust, Topping1 topping1, Topping2 topping2, Sauce sauce){

        this.size = size;
        this.crust = crust;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.sauce = sauce;
    }

    //Get/Set Methods
    public void setSize(Size size){

        this.size = size;
    }
    public Size setGUISize(Size size){

        this.size = size;
        return this.size;
    }

    public void setCrust(Crust crust){

        this.crust = crust;
    }

    public Crust setGUICrust(Crust crust){

        this.crust = crust;
        return this.crust;
    }

    public void setTopping1(Topping1 topping1){

        this.topping1 = topping1;
    }

    public Topping1 setGUITopping1(Topping1 topping1){

        this.topping1 = topping1;
        return this.topping1;
    }

    public void setTopping2(Topping2 topping2){

        this.topping2 = topping2;
    }

    public Topping2 setGUITopping2(Topping2 topping2){

        this.topping2 = topping2;
        return this.topping2;
    }

    public void setSauce(Sauce sauce){

        this.sauce = sauce;
    }

    public Sauce setGUISauce(Sauce sauce){

        this.sauce = sauce;
        return this.sauce;
    }

    public Size getSize() {

        return this.size;
    }

    public double getSizeValue() {

        return this.size.getValue();
    }

    public Crust getCrust() {

        return this.crust;
    }

    public double getCrustValue() {

        return this.crust.getValue();
    }

    public Topping1 getTopping1() {

        return this.topping1;
    }

    public double getTopping1Value() {

        return this.topping1.getValue();
    }

    public Topping2 getTopping2() {

        return this.topping2;
    }

    public double getTopping2Value() {

        return this.topping2.getValue();
    }

    public Sauce getSauce() {

        return this.sauce;
    }

    public double getSauceValue() {

        return this.sauce.getValue();
    }


    //Method that calculates the Base Price
    public double getBase(){

        double sizeValue = size.getValue();
        double crustValue = crust.getValue();

        this.base = sizeValue + crustValue;

        return this.base;
    }

    //Method that calculates the Total Price
    public double getTotalPrice(){

        double topping1Value = topping1.getValueTopping1();
        double topping2Value = topping2.getValueTopping2();
        double sauceValue = sauce.getValue();

        this.totalprice = getBase() + topping1Value + topping2Value + sauceValue;

        return this.totalprice;
    }

    //Method that returns a formatted String of the pizza information
    public String getInfo(){

        return String.format("\nTOTAL COST: £%.2f \n%s: £%.2f \n%s: £%.2f \nBASE COST: £%.2f \n%s: 5 * £%.2f = £%.2f " +
                        "\n%s: 4 * £%.2f = £%.2f \n%s: £%.2f\n",
                getTotalPrice(), size.getName(), size.getValue(), crust.getName(), crust.getValue(),
                getBase(), topping1.getName(), topping1.getValue(), topping1.getValueTopping1(), topping2.getName(),
                topping2.getValue(), topping2.getValueTopping2(), sauce.getName(), sauce.getValue());
    }
}

