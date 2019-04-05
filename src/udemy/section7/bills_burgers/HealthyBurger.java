package udemy.section7.bills_burgers;

import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Hamburger {
    public HealthyBurger() {
        super("Healthy Burger", "Brown Rye Bread Roll", "", 7.99);
    }

    @Override
    public void addAddition(Addition addition) {
        if (getAdditions().size() < 2) {
            super.addAddition(addition);
        } else {
            System.out.println("You can only add 2 additions to Healthy Burger");
        }
    }
}
