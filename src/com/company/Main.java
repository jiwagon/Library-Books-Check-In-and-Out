package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
        * Create 2 books, have 3 copies for the first book and 1 copy for the second book
        * Call checkout on the first book with name = "Mark Twain"
        * Call checkout on the first book with name = "Charles Dickens"
        */
        Media media1 = new Book("Normal People",
                "A stunning novel about the transformative power of relationships.",
                3, 001, "Sally Rooney");

        Media media2 = new Book("A Year of Magical Thinking",
                "A stunning novel about the transformative power of relationships.",
                3, 001, "Sally Rooney");
    }
}
