/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvehicle;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author naree1878
 */
public class TestVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String colour;
        Random r = new Random();
        Vehicle[] veh = new Vehicle[6];
        System.out.println("There 6 vehicles are moving down the road");
        for (int i = 0; i < 6; i++) {
            int rnd = r.nextInt(7);
            switch (rnd) {
                case (0):
                    colour = "blue";
                    break;
                case (1):
                    colour = "red";
                    break;
                case (2):
                    colour = "yellow";
                    break;
                case (3):
                    colour = "purple";
                    break;
                case (4):
                    colour = "green";
                    break;
                case (5):
                    colour = "orange";
                    break;
                default:
                    colour = "black";
            }
            rnd = r.nextInt(3);
            switch (rnd) {
                case (0):
                    veh[i] = new Car(colour, r.nextInt(70) + 150,r.nextInt(7));
                    break;
                case (1):
                    veh[i] = new Truck(colour, r.nextInt(50) + 120,r.nextBoolean());
                    break;
                case (2):
                    veh[i] = new Minivan(colour, r.nextInt(30) + 150,r.nextInt(3) + 5);
                    break;
            }
            System.out.println(veh[i]);
        }
    }
}
