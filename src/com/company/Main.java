package com.company;

public class Main {

    public static void main(String[] args) {

        //Create 2 books, have 3 copies for the first book and 1 copy for the second book

        Media media1 = new Book("Normal People",
                "A stunning novel about the transformative power of relationships.",
                3, 1, "Sally Rooney");

        Media media2 = new Book("A Year of Magical Thinking",
                "An indelible portrait of loss and grief.",
                1, 2, "Joan Didion");

        //Call checkOut on the first book with name = "Mark Twain" => true
        System.out.println(media1.checkOut("Mark Twain"));
        //Call checkOut on the first book with name = "Charles Dickens" => true
        System.out.println(media1.checkOut("Charles Dicken"));

        //Call checkIn on the first book with name = "Mark Twain" => true
        System.out.println(media1.checkIn("Mark Twain"));
        //Call checkIn on the first book with name = "Samuel Clemens" => false
        System.out.println(media1.checkIn("Samuel Clemens"));

        //Call checkOut on the second book with name = "Mark Twain" => true
        System.out.println(media2.checkOut("Mark Twain"));
        //Call checkOut on the second book with name = "Charles Dickens" => false
        System.out.println(media2.checkOut("Charles Dicken"));

        //Call checkIn on the second book with name = "Mark Twain" => true
        System.out.println(media2.checkIn("Mark Twain"));
        //Call checkOut on the second book with name = "Charles Dickens" => true
        System.out.println(media2.checkOut("Charles Dicken"));
    }
}
