package org.revenue.demo;
import java.util.Scanner;

public class TollBoothRevenueManager {
	private int vehicleNumber;
	private double totalRevenue;
	private double car;
	private double bike;
	private double truck;
	private int carNumber;
	private int truckNumber;
	private int bikeNumber;
	
	public TollBoothRevenueManager() {
		this.vehicleNumber = 0;
		this.totalRevenue = 0.0;
		this.car = 0.0;
		this.truck = 0.0;
		this.bike = 0.0;
		this.carNumber = 0;
		this.truckNumber = 0;
		this.bikeNumber = 0;
	}
	
	public TollBoothRevenueManager(int vehicleNumber, double totalRevenue, int car, int truck, int bike, int carNumber, int truckNumber, int bikeNumber) {
		this.vehicleNumber = vehicleNumber;
		this.totalRevenue = totalRevenue;
		this.car = car;
		this.truck = truck;
		this.bike = bike;
		this.carNumber = carNumber;
		this.truckNumber = truckNumber;
		this.bikeNumber = bikeNumber;
	}

	public double getCar() {
		return car;
	}

	public void setCar(double car) {
		this.car = car;
	}

	public double getBike() {
		return bike;
	}

	public void setBike(double bike) {
		this.bike = bike;
	}

	public double getTruck() {
		return truck;
	}

	public void setTruck(double truck) {
		this.truck = truck;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public int getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(int truckNumber) {
		this.truckNumber = truckNumber;
	}

	public int getBikeNumber() {
		return bikeNumber;
	}

	public void setBikeNumber(int bikeNumber) {
		this.bikeNumber = bikeNumber;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public double getTotalRevenue() {
		return totalRevenue;
	}
	
	public void calculate() {
		this.totalRevenue = (this.bike*this.bikeNumber) + (this.car * this.carNumber) + (this.truck * this.truckNumber);
		this.vehicleNumber = this.bikeNumber + this.carNumber + this.truckNumber;
	}

}
