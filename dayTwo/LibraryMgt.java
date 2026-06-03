package com.dayTwo;

interface Issueable {
    void issueBook();
}

abstract class LibraryItem {
    abstract void displayInfo();
}

class Book extends LibraryItem implements Issueable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    void displayInfo() {
        System.out.println("Book: " + title);
    }

    public void issueBook() {
        System.out.println(title + " Issued Successfully");
    }
}

public class LibraryMgt {
    public static void main(String[] args) {
        Book b = new Book("Java Programming");

        b.displayInfo();
        b.issueBook();
    }
}