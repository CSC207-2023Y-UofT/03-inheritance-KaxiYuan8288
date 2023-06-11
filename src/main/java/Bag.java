/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {

    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;

     /* The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag(String colour, int capacity) {
        this.color = colour;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[capacity];
    }

    public String getColor() {
        return this.color;
    }

    public int getNumberOfContents() {
        return this.numberOfContents;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setColor(String colour) {
        this.color = colour;
    }


     /*       This method should return true if the item was added
     *       and false otherwise.
     */
    public boolean addItem(String item) {
        if (this.numberOfContents < this.capacity){
            this.numberOfContents --;
            this.contents[numberOfContents] = item;
            return true;
        }
        else{
            return false;
        }
    }





    /**
     * If there are no items in this Bag, return null.
     *
     * @return
     */
    public String popItem(){
        if (numberOfContents == 0) {
            return null;
        }
        else {
            String temp = this.contents[numberOfContents - 1];
            contents[numberOfContents -1] = null;
            numberOfContents --;

            return temp;
        }
    }





    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity += n;
        String[] newContents = new String[this.capacity];
        for (int i = 0; i < this.numberOfContents; i++) {
            newContents[i] = this.contents[i];
        }
        this.contents = newContents;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}
