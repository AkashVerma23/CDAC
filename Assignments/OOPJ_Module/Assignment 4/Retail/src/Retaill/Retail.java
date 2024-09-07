package Retaill;


public class Retail {
	public float originalPrice;
	public float discountRate ;
	public float discountAmount;
	public float finalPrice;
	
	public Retail() {
		this(0.0f,0.0f,0.0f,0.0f);
	}
	public Retail(float originalPrice, float discountRate, float discountAmount,float finalPrice) {
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
		this.discountAmount = discountAmount;
		this.finalPrice = finalPrice;		
	}
	public float getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	public float getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
	
		
}
