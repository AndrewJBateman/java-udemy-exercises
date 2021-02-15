public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "White", 19.10, "Sausage");
        super.addHamburgerAddition1("chips", 0);
        super.addHamburgerAddition2("drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Invalid operation");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Invalid operation");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Invalid operation");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Invalid operation");
    }

}
