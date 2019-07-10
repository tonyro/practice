package udemy.section9.interfaces.saveable;

import java.util.ArrayList;

public class Book implements Saveable {
    private String author;
    private String title;
    private int numberOfPages;
    private String yearPublished;
    private String genre;

    public Book(){}

    public Book(String author, String title, int numberOfPages, String yearPublished, String genre) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.yearPublished = yearPublished;
        this.genre = genre;
    }

    @Override
    public ArrayList<String> save() {
        ArrayList<String> values = new ArrayList<String>();
        values.add("author:" + this.author);
        values.add("title:" + this.title);
        values.add("numberOfPages:" + this.numberOfPages);
        values.add("yearPublished:" + this.yearPublished);
        values.add("genre:" + this.genre);

        return values;
    }

    @Override
    public void restore(ArrayList<String> values) {
        for (String value : values) {
            String fieldName = value.split(":")[0];
            String fieldValue = value.split(":")[1];

            switch(fieldName){
                case "author":
                    this.author = fieldValue;
                    break;
                case "title":
                    this.title = fieldValue;
                    break;
                case "numberOfPages":
                    this.numberOfPages = Integer.valueOf(fieldValue);
                    break;
                case "yearPublished":
                    this.yearPublished = fieldValue;
                    break;
                case "genre":
                    this.genre = fieldValue;
                    break;
                default:
                    System.out.println("The following field is not part of Book object: " + fieldName);
            }
        }
    }

    @Override
    public String toString() {
        return "Book: " +
                "author: " + this.author + "; " +
                "title: " + this.title + "; " +
                "numberOfPages: " + this.numberOfPages + "; " +
                "yearPublished: " + this.yearPublished + "; " +
                "genre: " + this.genre;
    }
}
