package udemy.section7_oop_p2.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer("8th floor corner", false);
        System.out.println("Printer toner level by default: " + printer.getTonerLevel());
        printer.printOneSidedPage();
        printer.printTwoSidedPage();
        System.out.println("Printer toner level: " + printer.getTonerLevel());
        printer.fillUpToner(-80);
        printer.printTwoSidedPage();
        printer.printOneSidedPage();
        System.out.println("Printer toner level: " + printer.getTonerLevel());
        printer.printOneSidedPage();
        System.out.println("Printer toner level: " + printer.getTonerLevel());
        System.out.println("Total number of pages printed: " + printer.getNumberOfPagesPrinted());

        System.out.println("------------------");

        Printer duplexPrinter = new Printer("8th floor Facilities", true);
        System.out.println("Printer toner level by default: " + duplexPrinter.getTonerLevel());
        duplexPrinter.printOneSidedPage();
        duplexPrinter.printTwoSidedPage();
        System.out.println("Printer toner level: " + duplexPrinter.getTonerLevel());
        duplexPrinter.fillUpToner(-60);
        duplexPrinter.printTwoSidedPage();
        duplexPrinter.printOneSidedPage();
        System.out.println("Printer toner level: " + duplexPrinter.getTonerLevel());
        duplexPrinter.printOneSidedPage();
        System.out.println("Printer toner level: " + duplexPrinter.getTonerLevel());
        duplexPrinter.fillUpToner(20);
        duplexPrinter.printTwoSidedPage();
        System.out.println("Printer toner level: " + duplexPrinter.getTonerLevel());
        System.out.println("Total number of pages printed: " + duplexPrinter.getNumberOfPagesPrinted());
    }
}
