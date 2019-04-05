package udemy.section7.bills_burgers;

import java.util.ArrayList;
import java.util.List;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger", "Italian Bun", "Angus Beef", 5.99);
        this.setAdditions();
    }

    private void setAdditions(){
        addAddition(new Chips());
        addAddition(new Drink());
    }

    @Override
    void addAddition(Addition addition) {
        System.out.println("You cannot choose additions to Deluxe Burger");
    }
}
