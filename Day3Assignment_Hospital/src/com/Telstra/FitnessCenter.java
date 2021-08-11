package com.Telstra;

public class FitnessCenter {
	
	private double weight;
	private int fId;
	private String HealthC;
	
	
    // Assumptions
	// undernourished = 2.5 kg
	// healthy = 2.5 to 4.5 kg
	// overnourished > 4.5
	
    	
	protected String healthCondition(double weight) {
         this.weight = weight;
		 this.fId = (int)(Math.random() * 1000) + 100;
         
         if(this.weight <2.5) return "Undernourished";
		if(this.weight>=2.5 && this.weight<=4.5) return "Healthy";
		else return "overnourished";
				
	}

	public int getfId() {
		return fId;
	}



	@Override
	public String toString() {
		return "FitnessCenter [weight=" + weight + ", fId=" + fId + ", HealthC=" + HealthC + "]";
	}
	
	
	
	
	
	
	
	

}
