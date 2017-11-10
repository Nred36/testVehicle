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
abstract public class Vehicle {

    private String col;
    private double speed;

    public Vehicle(String colour, double spe) {
        col = colour;
        speed = spe;
    }

    abstract String getType();

    abstract int getNumWheels();

    abstract String getFeature();

    /**
     * gets the vehicles colour
     *
     * @return the colour
     */
    public String getColor() {
        return col;
    }

    /**
     * gets the vehicles maximum speed
     *
     * @return the maximum speed
     */
    public double getMaxSpeed() {
        return speed;
    }

    /**
     * gets the vehicles acceleration
     * @return the acceleration
     */
    public double getAcceleration() {
        return Math.round(speed / 36);
    }

    public String toString() {
        return "A " + getColor() + " " + getType() + getFeature() + getNumWheels() + " wheels can accelerate it at " + getAcceleration() + " m/s and has a max speed of " + getMaxSpeed() + " km/h.";
    }
}
