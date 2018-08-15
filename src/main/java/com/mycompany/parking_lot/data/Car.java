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
public class Car{
	private String regNo;
	private String colour;
	
	public Car(String r, String c){
		this.regNo = r;
		this.colour = c;
	}

	public String getRegNo() {
		return regNo;
	}

	public String getColour() {
		return colour;
	}
}