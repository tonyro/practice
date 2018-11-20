package rectangle.square;

import java.util.ArrayList;

public class Rectangle {
    private int length;
    private int height;

    private Point leftTopCorner;
    private Point rightTopCorner;
    private Point rightBottomCorner;
    private Point leftBottomCorner;

    private ArrayList<Point> allPoints;

    public Rectangle(Point leftBottomCorner, int height, int length) {
        this.leftBottomCorner = leftBottomCorner;
        this.height = height;
        this.length = length;
        this.allPoints = new ArrayList<>();

        init();
    }

    private void init() {
        for (int i = 0; i <= height; i++)
            for (int j = 0; j <= length; j++)
                allPoints.add(new Point(leftBottomCorner.getX() + j, leftBottomCorner.getY() + i));

        this.rightTopCorner = allPoints.get(allPoints.size() - 1);
    }

    public int getSquare() {
        return (rightTopCorner.getX() - leftBottomCorner.getX()) * (rightTopCorner.getY() - leftBottomCorner.getY());
    }
}
