
public class Item {

	private int barcode;
	private String name;
	private double price;
	
	public Item() {
		barcode = -1;
		name = "";
		price = 0;
	}
	
	public Item(int barcode, String name, double price) {
		this.barcode = barcode;
		this.name = name;
		this.price = price;
	}
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
