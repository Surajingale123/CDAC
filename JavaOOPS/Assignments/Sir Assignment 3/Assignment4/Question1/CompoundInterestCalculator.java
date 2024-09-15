package org.CompoundInterestCalculator;

public class CompoundInterestCalculator {

	private float Principal;
	private float annualIntrestRate;
	private float numberOfCompounds;
	private float years;
	
	public CompoundInterestCalculator() {
		this(0.0f,0.0f,0.0f,0.0f);
	}
	
	
	public CompoundInterestCalculator(float principal, float annualIntrestRate, float numberOfCompounds, float years) {
		this.Principal = principal;
		this.annualIntrestRate = annualIntrestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
	}


	public float getPrincipal() {
		return Principal;
	}


	public void setPrincipal(float principal) {
		Principal = principal;
	}


	public float getAnnualIntrestRate() {
		return annualIntrestRate;
	}


	public void setAnnualIntrestRate(float annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;
	}


	public float getNumberOfCompounds() {
		return numberOfCompounds;
	}


	public void setNumberOfCompounds(float numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}


	public float getYears() {
		return years;
	}


	public void setYears(float years) {
		this.years = years;
	}


	@Override
	public String toString() {
		return "CompoundInterestCalculator [Principal=" + Principal + ", annualIntrestRate=" + annualIntrestRate
				+ ", numberOfCompounds=" + numberOfCompounds + ", years=" + years + "]";
	}
	
	
	
	
	
	
	
	
	
}
