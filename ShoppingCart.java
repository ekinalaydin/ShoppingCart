import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> itemList;
	
	public ShoppingCart(){
		itemList = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public Item removeItem(String name) {
		int i;
		for (i = 0; i < itemList.size(); i++) {
			if(itemList.get(i).getName().equals(name)) {
				break;
			}
		}
		return itemList.remove(i);
	}
	
	public double calculateTotalCost()
	{
		double sum = 0;
		for (int i = 0; i < itemList.size(); i++) {
			sum += itemList.get(i).getPrice();
		}
		return sum;
	}
	
	public void printItemDetails() {
		for (int i = 0; i < itemList.size(); i++) {
			Item item = itemList.get(i);
			//System.out.println(item.getBarcode() + " " + item.getName() + " "+ item.getPrice());
			System.out.format("%10s %3d %7.2f\n", item.getName(), item.getBarcode(), item.getPrice());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
