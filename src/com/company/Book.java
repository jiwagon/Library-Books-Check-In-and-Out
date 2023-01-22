package com.company;

public class Book extends Media {

    private String author;

    //Store who the author of the book is in addition to the inherited fields.
    public Book(String title, String subTitle, int numCopies, int idNum, String author) {
        super(title, subTitle, numCopies, idNum);

        this.author = author;
    }

    // Implementation of checkOut
    @Override
    public boolean checkOut(String name) {
        //Condition to compare the number of copies with the length of the heldBy list
        if (heldBy.size() < totalNumCopies) {
            //add a new borrower's name into the heldBy array list (if the condition is true)
            heldBy.add(name);
            System.out.println(name + " checking out " + title +  " by " + author);
            //return true if there are copies of the book available
            return true;
        }
        return false;
    }

   // Implementation of checkIn
    @Override
    public boolean checkIn(String name) {
        //Condition to check if the book is lent out
        if (heldBy.size() > 0) {
            //Condition to check if the user had actually checked the book out previously
            if (heldBy.contains(name)) {
                //remove the borrower's name from the heldBy array list (if condition is true)
                heldBy.remove(name);
                System.out.println(name + " checking in " + title);
                return true;
            }
        }
        return false;
    }
}
