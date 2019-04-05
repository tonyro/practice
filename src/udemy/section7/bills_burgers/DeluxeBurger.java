package udemy.section7.bills_burgers;

import java.util.ArrayList;
import java.util.List;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger", "Italian Bun", "Angus Beef", 5.99);
        this.setAdditions();
    }

    private void setAdditions(){
        List<Addition> additions = new ArrayList<>();
        additions.add(new Chips());
        additions.add(new Drink());
        super.setAdditions(additions);
    }
}
