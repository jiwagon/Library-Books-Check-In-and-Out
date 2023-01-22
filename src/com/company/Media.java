package com.company;
import java.util.ArrayList;

public abstract class Media {

    public String title;
    public String subTitle;
    public int totalNumCopies;
    public int idNum;
    public ArrayList<String> heldBy;

    // Store title, sub-title, number of copies, id number, and heldBy.
    public Media(String title, String subTitle, int numCopies, int idNum) {
        this.title = title;
        this.subTitle = subTitle;
        this.totalNumCopies = numCopies;
        this.idNum = idNum;
        this.heldBy = new ArrayList<String>();
    }

    //An abstract method named "checkOut" that takes a String variable "name" as a parameter and returns a boolean.
    public abstract boolean checkOut(String name);

    //an abstract method named "checkIn" that takes a String variable "name" as a parameter and returns a boolean.
    public abstract boolean checkIn(String name);
}
