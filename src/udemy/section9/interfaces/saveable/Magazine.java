package udemy.section9.interfaces.saveable;

import java.util.ArrayList;

public class Magazine implements Saveable {
    private String title;
    private int month;
    private int year;
    private int numberOfPages;

    public Magazine() {}

    public Magazine(String title, int month, int year, int numberOfPages) {
        this.title = title;
        this.month = month;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public ArrayList<String> save() {
        ArrayList<String> values = new ArrayList<>();
        values.add("title:" + this.title);
        values.add("month:" + this.month);
        values.add("year:" + this.year);
        values.add("numberOfPages:" + this.numberOfPages);

        return values;
    }

    @Override
    public void restore(ArrayList<String> values) {
        for (String value : values) {
            String fieldName = value.split(":")[0];
            String fieldValue = value.split(":")[1];

            switch(fieldName){
                case "title":
                    this.title = fieldValue;
                    break;
                case "month":
                    this.month = Integer.valueOf(fieldValue);
                    break;
                case "year":
                    this.year = Integer.valueOf(fieldValue);
                    break;
                case "numberOfPages":
                    this.numberOfPages = Integer.valueOf(fieldValue);
                    break;
                default:
                    System.out.println("The following field is not part of Magazine object: " + fieldName);
            }
        }
    }

    @Override
    public String toString() {
        return "Magazine: " +
                "title: " + this.title + "; " +
                "month: " + this.month + "; " +
                "year: " + this.year + "; " +
                "numberOfPages: " + this.numberOfPages;
    }
}
