package com.example.mocktest;

public class Author {
    private int no_books;
    private String name;
    private String country;

    public Author(){

    }
    public Author(int no_books, String name, String country) {
        this.no_books = no_books;
        this.name = name;
        this.country = country;
    }

    public int getNo_books() {
        return no_books;
    }

    public void setNo_books(int no_books) {
        this.no_books = no_books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
