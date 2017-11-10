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
public class Truck extends Vehicle {

    private boolean bed;

    public Truck(String col, double spe, boolean bed) {
        super(col, spe);
        this.bed = bed;
    }

    public boolean hasBed() {
        return bed;
    }

    @Override
    String getType() {
        return "Truck";
    }

    @Override
    int getNumWheels() {
        return 4;
    }

    @Override
    String getFeature() {
        if (hasBed()) {
            return " with a bed and ";
        } else {
            return " with no bed and ";
        }
    }

}
