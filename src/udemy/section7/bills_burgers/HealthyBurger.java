package udemy.section7.bills_burgers;

import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Hamburger {
    public HealthyBurger() {
        super("Healthy Burger", "Brown Rye Bread Roll", "", 7.99);
    }

    public void addAddition(Addition addition) {
        List<Addition> additions;
        if (getAdditions() == null) {
            additions = new ArrayList<>();
        } else {
            additions = getAdditions();
        }

        additions.add(addition);
        setAdditions(additions);
    }
}
