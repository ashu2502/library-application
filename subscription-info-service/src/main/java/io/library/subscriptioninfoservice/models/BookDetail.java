package io.library.subscriptioninfoservice.models;

public class BookDetail {
    String bookId;
    String name;
    String description;
    String author;
    float rating;

    public BookDetail() {

    }
    public BookDetail(String bookId, String name, String description, String author, float rating) {
        this.bookId = bookId;
        this.name = name;
        this.description = description;
        this.author = author;
        this.rating = rating;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
