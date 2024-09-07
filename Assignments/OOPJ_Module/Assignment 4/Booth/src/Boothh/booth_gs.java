package Boothh;

public class booth_gs {
	public int cart;
	public int truckt;
	public int biket;
	public int carb;
	public int truckb;
	public int bikeb;
	public int total;
	public int totalv;
	
	public booth_gs() {
		this(0,0,0,0,0,0,0,0);
	}
	public booth_gs(int cart,int truckt,int biket,int carb, int truckb, int bikeb, int total,int totalv) {
		this.cart = cart;
		this.truckt = truckt;
		this.biket = biket;
		this.carb = carb;
		this.truckb = truckb;
		this.bikeb = bikeb;
		this.total = total;
		this.totalv = totalv;
	}
	public int getCart() {
		return cart;
	}
	public void setCart(int cart) {
		this.cart = cart;
	}
	public int getTruckt() {
		return truckt;
	}
	public void setTruckt(int truckt) {
		this.truckt = truckt;
	}
	public int getBiket() {
		return biket;
	}
	public void setBiket(int biket) {
		this.biket = biket;
	}
	public void setCarb(int carb) {
		this.carb = carb;
	}
	public int getCarb() {
		return carb;
	}
	public void setBikeb(int bikeb) {
		this.bikeb = bikeb;
	}
	public int getBikeb() {
		return bikeb;
	}
	public void setTruckb(int truckb) {
		this.truckb = truckb;
	}
	public int getTruckb() {
		return truckb;
	}
}
