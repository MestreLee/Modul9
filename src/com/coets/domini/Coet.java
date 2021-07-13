package com.coets.domini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Coet {
	
	protected String codi;
	//protected int propulsors;
	protected ArrayList <Propulsor> propulsors;
	
	
	public Coet() {} //constructor buit per si de cas
	
	public Coet(String codi, ArrayList <Propulsor> propulsors){
		
		this.codi = codi;
		this.propulsors = propulsors;

	}
	
	public void accelerarCoet() {
		
		for (Propulsor p : propulsors) {
			p.start();
		}
	}

	@Override
	public String toString() {
		return "Coet: " + codi + ", # propulsors = " + propulsors.size() + " Potències màximes " + propulsors.toString();
	}
	
	
	
}
