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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Point getLeftTopCorner() {
        return leftTopCorner;
    }

    public void setLeftTopCorner(Point leftTopCorner) {
        this.leftTopCorner = leftTopCorner;
    }

    public Point getRightTopCorner() {
        return rightTopCorner;
    }

    public void setRightTopCorner(Point rightTopCorner) {
        this.rightTopCorner = rightTopCorner;
    }

    public Point getRightBottomCorner() {
        return rightBottomCorner;
    }

    public void setRightBottomCorner(Point rightBottomCorner) {
        this.rightBottomCorner = rightBottomCorner;
    }

    public Point getLeftBottomCorner() {
        return leftBottomCorner;
    }

    public void setLeftBottomCorner(Point leftBottomCorner) {
        this.leftBottomCorner = leftBottomCorner;
    }

    public ArrayList<Point> getAllPoints() {
        return allPoints;
    }

    public void setAllPoints(ArrayList<Point> allPoints) {
        this.allPoints = allPoints;
    }

    public Rectangle(Point leftBottomCorner, int height, int length) {
        this.leftBottomCorner = leftBottomCorner;
        this.height = height;
        this.length = length;
        this.allPoints = new ArrayList<>();

        init();
    }

    public Rectangle(ArrayList<Point> points) {
        this.allPoints = points;
        this.leftBottomCorner = points.get(0);
        this.rightTopCorner = points.get(points.size() - 1);
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

    public ArrayList<Point> findIntercection(Rectangle ra) {
        ArrayList<Point> result = new ArrayList<>();

        for (Point thisPoint : allPoints)
            for (Point thatPoint : ra.getAllPoints())
                if (thisPoint.equals(thatPoint))
                    result.add(thatPoint);

        return result;
    }
}
