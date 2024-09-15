package org.dicount;

public class Discount {

	private int originalPrice ;
	private float discountRate ;
	public Discount() {
		this(0,0.0f);
	}
	
	public Discount(int originalPrice, float discountRate) {
		
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
	}

	public int getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}

	public float getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "Discount [originalPrice=" + originalPrice + ", discountRate=" + discountRate + "]";
	}
	
	
	
	
	
}
