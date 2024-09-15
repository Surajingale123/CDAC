package org.BMITracker;

public class BMITracker {
       private float weight ;
       private float height;
       
       public BMITracker() {
    	this(0.0f,0.0f)   ;
       }
       
	public BMITracker(float weight, float height) {
		
		this.weight = weight;
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "BMITracker [weight=" + weight + ", height=" + height + "]";
	}
       
       
	
	
	
	
	
}
