package service;

import transport.Vehicle;

public class ServiceStation {
    public void check(Vehicle vehicle) {
        vehicle.service();
    }
}