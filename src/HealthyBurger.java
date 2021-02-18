public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    // constructor with 2 inputs
    public HealthyBurger(String meat, double price) {
        super( "Healthy",meat, price, "brown rye bread");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double subTotal = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            subTotal += this.healthyExtra1Price;
            System.out.println("additional "
                    + this.healthyExtra1Name
                    + ": "
                    + this.healthyExtra1Price
                    + " subtotal: "
                    + (double) Math.round(subTotal * 100) / 100
            );
        }

        if (this.healthyExtra2Name != null) {
            subTotal += this.healthyExtra2Price;
            System.out.println("additional "
                    + this.healthyExtra2Name
                    + ": "
                    + this.healthyExtra2Price
                    + " subtotal: "
                    + (double) Math.round(subTotal * 100) / 100
            );
        }

        return subTotal;
    }
}
