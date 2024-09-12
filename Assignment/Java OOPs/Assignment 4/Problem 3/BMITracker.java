package org.bmi.demo;

public class BMITracker {
	private float weight;
	private float height;
	private float bmi;
	
	public BMITracker() {
		this.weight = 0.0f;
		this.height = 0.0f;
	}
	
	public BMITracker(float weight, float height) {
		this.weight = weight;
		this.height = height;
	}
	public float getWeight() {
		return this.weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	public float getHeight() {
		return this.height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	
	public float getBmi() {
		return this.bmi;
	}
	
	
	
	@Override
	public String toString() {
		return "BMITracker [weight=" + this.weight + ", height=" + this.height + ", bmi=" + this.bmi + "]";
	}

	public void calculate() {
		this.bmi = this.weight / (this.height*this.height);
	}
	
	
}

