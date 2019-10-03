package udemy.section9.absrtact_classes.lists_challenge;

public class AbstractClassesMain {
    public static void main(String[] args) {
        MyOrderedStringList list = new MyOrderedStringList();
        list.add("delta");
        list.add("alpha");
        list.add("gamma");
        list.add("beta");
        list.add("zeta");

        list.remove("alpha");
        list.remove("zeta");
        list.remove("delta");
        list.remove("gamma");
        list.remove("gamma");
        list.remove("beta");
        list.remove("alpha");

    }
}
