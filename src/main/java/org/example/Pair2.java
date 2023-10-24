package org.example;

public class Pair2 implements Comparable<Pair2> {
    String firstName;
    String lastName;

    public Pair2(String x, String y) {
        this.firstName = x;
        this.lastName = y;
    }

    public String toString() {
        return "(" + firstName + ", " + lastName + ")";
    }

    @Override
    public int compareTo(Pair2 o) {
        if (this.firstName.compareTo(o.firstName) != 0) {
            return this.firstName.compareTo(o.firstName);
        } else {

            return this.lastName.compareTo(o.lastName);
        }
    }
}
