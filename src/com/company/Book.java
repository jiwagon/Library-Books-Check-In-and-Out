package com.company;

import java.util.*;

public class Book extends Media {

    private String author;

    //Store who the author of the book is in addition to the inherited fields.
    public Book(String title, String subTitle, int numCopies, int idNum, String author) {
        super(title, subTitle, numCopies, idNum);

        this.author = author;
    }

    /*
     *Provide an implementation of checkOut, which should print "Checking out [title of book], by [author of book]".
     */
    @Override
    public boolean checkOut(String name) {
        //Condition to compare the number of copies with the length of the heldBy list
        if (heldBy.size() < totalNumCopies) {
            // Add a new borrower's name into heldBy ArrayList
            heldBy.add(name);
            System.out.println("Checking out " + title +  " by " + author);
            //return true if there are copies of the book available
            return true;
        }
        return false;
    }

//    @Override
//    public boolean checkIn(String name) {
//        return null;
//    }
}
