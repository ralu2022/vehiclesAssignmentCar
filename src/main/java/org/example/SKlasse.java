package org.example;

/*  Since one requirement is to define an instance that can extend from class Mercedes, that extends from Car, we need to
 *  create a class that is not abstract/interface.
 *  In order to use the inheritance in a proper way, we need to add the constructor used for fields that are final from
 *  class Car, via class Mercedes.
 * */


public class SKlasse extends Mercedes {
    protected SKlasse(double fuelTankSize, String fuelType, double consumptionPer100km, int gear) {
        super(fuelTankSize, fuelType, consumptionPer100km, gear);
    }
}
