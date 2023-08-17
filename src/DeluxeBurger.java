public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    public void addHamburgerAddition3(String topping, double price) {
        System.out.println("Unable to add additional items to Deluxe Burger");
    }

    public void addHamburgerAddition4(String topping, double price) {
        System.out.println("Unable to add additional items Deluxe Burger");
    }
}