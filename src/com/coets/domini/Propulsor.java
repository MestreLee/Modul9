package com.coets.domini;

public class Propulsor extends Thread{
	
	protected int idPropulsor;
	protected int potenciaMaxima;
	protected int potenciaActual;
	protected int potenciaObjectiu;
	protected static int ID = 0;
	
	
	public Propulsor() {} // Constructor buit per si de cas
	
	public Propulsor(int potenciaMaxima, int potenciaObjectiu) {
		this.idPropulsor = ID + 1;
		ID++;
		this.potenciaMaxima = potenciaMaxima;
		this.potenciaObjectiu = potenciaObjectiu;
		this.potenciaActual = 0;
	}
	
	public void setPotenciaMaxima(int potenciaMaxima) {
		this.potenciaMaxima = potenciaMaxima;
	}
	
	public void setPotenciaObjectiu(int potenciaObjectiu) {
		this.potenciaObjectiu = potenciaObjectiu;
	}
	
	public int getPotenciaActual() {
		
		return potenciaActual;
	}
	
	public int getPotenciaMaxima() {
		
		return potenciaMaxima;
	}
	
	public int getPotenciaObjectiu() {
		
		return potenciaObjectiu;
	}
	
	

	@Override
	public String toString() {
		return "" + potenciaMaxima;
	}

	@Override
	public void run() {
		
		boolean bool = true;
		
		while(bool) {
			
			if(potenciaObjectiu > potenciaMaxima) potenciaObjectiu = potenciaMaxima;
			else if(potenciaObjectiu <= 0) potenciaObjectiu = 0;
			
			if(potenciaActual < potenciaObjectiu) {
				System.out.println(this.getName() + " Propulsor: " + this.idPropulsor + " Pot. Actual: " + potenciaActual + " Pot. Objectiu: " + potenciaObjectiu);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				potenciaActual++;
			}else if(potenciaActual > potenciaObjectiu) {
				System.out.println(this.getName() + " Propulsor: " + this.idPropulsor + " Pot. Actual: " + potenciaActual + " Pot. Objectiu: " + potenciaObjectiu);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				potenciaActual--;
			}else {
				bool = false;
				System.out.println(this.getName() + " Propulsor: " + this.idPropulsor + " Pot. Actual: " + potenciaActual + " Pot. Objectiu: " + potenciaObjectiu + " Objectiu assolit!"); 		
			}
		}
		
		
	}

}
	
