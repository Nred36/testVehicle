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
public class Car extends Vehicle {

    private int numStripes;

    public Car(String col, double spe, int numStripes) {
        super(col, spe);
        this.numStripes = numStripes;
    }

    public int getNumStripes() {
        return numStripes;
    }

    @Override
    String getType() {
        return "Car";
    }

    @Override
    int getNumWheels() {
        return 4;
    }

    @Override
    String getFeature() {
        return " with " + getNumStripes() + " stripes and ";
    }

}
