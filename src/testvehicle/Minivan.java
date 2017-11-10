/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvehicle;

/**
 *
 * @author naree1878
 */
public class Minivan extends Vehicle {

    private int numSeats;

    public Minivan(String col, double spe, int numSeats) {
        super(col, spe);
        this.numSeats = numSeats;
    }

    /**
     *gets the number of seats in the minivan
     * @return returns the number of seats
     */
    public int getNumSeats() {
        return numSeats;
    }

    @Override
    String getType() {
        return "Minivan";
    }

    @Override
    int getNumWheels() {
        return 4;
    }

    @Override
    String getFeature() {
        return " that fits " + getNumSeats() + " passengers and has ";
    }

}
