package org.tollBoth;

public class TollBoothRevenueManager {
    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    // Constructor
    public TollBoothRevenueManager(double carRate, double truckRate, double motorcycleRate) {
        this.carRate = carRate;
        this.truckRate = truckRate;
        this.motorcycleRate = motorcycleRate;
        this.carCount = 0;
        this.truckCount = 0;
        this.motorcycleCount = 0;
    }

   
    public double getCarRate() {
        return carRate;
    }

    public void setCarRate(double carRate) {
        this.carRate = carRate;
    }

    public double getTruckRate() {
        return truckRate;
    }

    public void setTruckRate(double truckRate) {
        this.truckRate = truckRate;
    }

    public double getMotorcycleRate() {
        return motorcycleRate;
    }

    public void setMotorcycleRate(double motorcycleRate) {
        this.motorcycleRate = motorcycleRate;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getTruckCount() {
        return truckCount;
    }

    public void setTruckCount(int truckCount) {
        this.truckCount = truckCount;
    }

    public int getMotorcycleCount() {
        return motorcycleCount;
    }

    public void setMotorcycleCount(int motorcycleCount) {
        this.motorcycleCount = motorcycleCount;
    }

    
    public double calculateTotalRevenue() {
        return (carRate * carCount) + (truckRate * truckCount) + (motorcycleRate * motorcycleCount);
    }

    
    public int getTotalVehicleCount() {
        return carCount + truckCount + motorcycleCount;
    }

 
    public String toString() {
        return String.format(
            "Total Vehicles: %d\nTotal Revenue: ₹%.2f\n",
            getTotalVehicleCount(), calculateTotalRevenue());
    }
}

