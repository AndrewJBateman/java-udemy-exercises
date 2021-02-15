public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double subTotal = this.price;

        System.out.println("Total price of "
                + this.name
                + " burger made from "
                + this.breadRollType
                + " and "
                + this.meat
                + ":");
        System.out.println("base price: " + this.price);

        if (this.addition1Name != null) {
            subTotal += this.addition1Price;
            System.out.println("additional "
                    + this.addition1Name
                    + ": "
                    + this.addition1Price
                    + " subtotal: "
                    + (double) Math.round(subTotal * 100) / 100
            );
        }

        if (this.addition2Name != null) {
            subTotal += this.addition2Price;
            System.out.println("additional "
                    + this.addition2Name
                    + ": "
                    + this.addition2Price
                    + " subtotal: "
                    + (double) Math.round(subTotal * 100) / 100
            );
        }

        if (this.addition3Name != null) {
            subTotal += this.addition3Price;
            System.out.println("additional "
                    + this.addition3Name
                    + ": "
                    + this.addition3Price
                    + " subtotal: "
                    + (double) Math.round(subTotal * 100) / 100
            );
        }

        if (this.addition4Name != null) {
            subTotal += this.addition4Price;
            System.out.println("additional "
                    + this.addition4Name
                    + ": "
                    + this.addition4Price
                    + " subtotal: "
                    + (double) Math.round(subTotal * 100) / 100
            );
        }

//        return Math.round(subTotal * 100)/100;
        return subTotal;
    }
}
