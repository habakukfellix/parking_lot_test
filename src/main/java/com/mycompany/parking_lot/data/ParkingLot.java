/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parking_lot.data;

/**
 *
 * @author lenovo
 */
public class ParkingLot {
    private int slotNumber;
	private Car car;
	ParkingLot(int slotNo, Car c){
		this.slotNumber = slotNo;
		this.car = c;
	}
	public int getSlotNumber() {
		return slotNumber;
	}
	
	public Car getCar() {
		return car;
	}
}
