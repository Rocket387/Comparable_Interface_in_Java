package org.example;

/**
 * Hello world!
 *
 */
public class Pair implements Comparable<Pair>
{
    String x;
    int y;

    public Pair(String x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public int compareTo(Pair a) {
        //if strings are not equal
        if (this.x.compareTo(a.x) != 0) {
            return this.x.compareTo(a.x);
        } else {
            //compare int values to sort array if strings are equal
            return this.y - a.y;
        }
    }


}
