package rectangle.square;

public class RectangleSquare {
    public static void main(String[] args) {
        Rectangle ra1 = new Rectangle(new Point(1, 3), 5, 7);
        Rectangle ra2 = new Rectangle(new Point(2, 2), 9, 4);

        System.out.println(ra1.getSquare());
        System.out.println(ra2.getSquare());

        Rectangle raIntersect = new Rectangle(ra1.findIntercection(ra2));

        System.out.println(raIntersect.getSquare());

        Rectangle ra3 = new Rectangle(new Point(1, 1), 2, 3);
        Rectangle ra4 = new Rectangle(new Point(1, 3), 4, 2);

        Rectangle raIntersect1 = new Rectangle(ra3.findIntercection(ra4));

        System.out.println(raIntersect1.getSquare());
    }
}
