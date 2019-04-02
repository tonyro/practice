package udemy.section7_oop_p2.printer;

public class Printer {
    private String name;
    private boolean isDuplex;
    private int tonerLevel = 100;
    private int numberOfPagesPrinted = 0;
    
    private static final int TONER_COST_ONE_SIDED_PAGE = 10;
    private static final int TONER_COST_TWO_SIDED_PAGE = 20;

    public Printer(String name, boolean isDuplex) {
        this.name = name;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int amount) {
        int sum = tonerLevel + amount;

        if (sum > 100) {
            tonerLevel = 100;
        } else if (sum < 0) {
            System.out.println("Toner level should be positive. Current toner level is [ " + tonerLevel + " ]. " +
                    "Amount you're trying to add is [ " + amount + " ].");
        } else {
            tonerLevel = sum;
            System.out.println("Adding up amount of [ " + amount + " ] of toner. New toner level is [ " + sum + " ].");
        }
    }
    
    public void printOneSidedPage() {
        if (tonerLevel >= TONER_COST_ONE_SIDED_PAGE) {
            numberOfPagesPrinted++;
            tonerLevel -= TONER_COST_ONE_SIDED_PAGE;
            System.out.println("Printing one-sided page");
        } else {
            System.out.println("Not enough toner to print one-sided page. Current toner level is [ " + tonerLevel + " ]. " +
                    "Please fill out toner first.");
        }
    }
    
    public void printTwoSidedPage() {
        if (!isDuplex) {
            System.out.println("The printer does not support two-sided printing.");
        } else if (tonerLevel >= TONER_COST_TWO_SIDED_PAGE) {
            numberOfPagesPrinted += 2;
            tonerLevel -= TONER_COST_TWO_SIDED_PAGE;
            System.out.println("Printing two-sided page.");
        } else {
            System.out.println("Not enough toner to print two-sided page. Current toner level is [ " + tonerLevel + " ]. " +
                    "Please fill out toner first.");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
