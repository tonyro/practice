package udemy.section7.bills_burgers;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private List<Addition> additions = new ArrayList<>();
    private double price;

    protected Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public String  getPrice() {
        double total = this.price;
        String result;
        result = this.name + ": " + this.price + "\n";
        if (this.additions != null) {
            result += "Additions:\n";
            for (Addition addition : this.additions) {
                result += addition.getName() + ": " + addition.getPrice() + "\n";
                total += addition.getPrice();
            }
        }

        result += "-\n";
        result += "Total: " + total;

        return result;
    }

    public List<Addition> getAdditions() {
        return additions;
    }

    void addAddition(Addition addition) {
        additions.add(addition);
    }
}
