package com.coets.view;

import java.util.ArrayList;

import com.coets.domini.Coet;
import com.coets.domini.Propulsor;

public class CoetsApp {

	public static void main(String[] args) {
		
		//Coet coet1 = new Coet("32WESSD", 3), coet2 = new Coet("LDSFJA32", 6);
		
		ArrayList <Propulsor> propulsors1 = new ArrayList();
		ArrayList <Propulsor> propulsors2 = new ArrayList();
		
		Propulsor p1 = new Propulsor(10, -30); 
		Propulsor p2 = new Propulsor(30, 50);
		Propulsor p3 = new Propulsor(80, 50);
		
		propulsors1.add(p1);
		propulsors1.add(p2);
		propulsors1.add(p3);
		
		Propulsor p4 = new Propulsor(30, 35);
		Propulsor p5 = new Propulsor(40, -5);
		Propulsor p6 = new Propulsor(50, 50);
		Propulsor p7 = new Propulsor(50, 30);
		Propulsor p8 = new Propulsor(30, 20);
		Propulsor p9 = new Propulsor(10, 12);
		
		propulsors2.add(p4);
		propulsors2.add(p5);
		propulsors2.add(p6);
		propulsors2.add(p7);
		propulsors2.add(p8);
		propulsors2.add(p9);
		
		Coet coet1 = new Coet("32WESSDS", propulsors1);
		
		Coet coet2 = new Coet("LDSFJA32", propulsors2);
		
		System.out.print(coet1.toString() + "\n" + coet2.toString() + "\n");
		coet1.accelerarCoet();
		coet2.accelerarCoet();
		
	

	}

}
