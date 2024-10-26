import java.util.Scanner;

public class Main {
	public static void menu() {
		System.out.println("1. Add an item");
		System.out.println("2. Remove an item");
		System.out.println("3. Show total cost");
		System.out.println("4. Show chart detail");
		System.out.println("5. Exit");
	}
	
	public static void main(String args[]) {
		ShoppingCart sc = new ShoppingCart();
		Scanner scan = new Scanner(System.in);
		int choice;
		do {
			menu();
			choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter item name, barcode and price");
				String itemName = scan.next();
				int barcode = scan.nextInt();
				double price = scan.nextDouble();
			
				Item item = new Item(barcode, itemName, price);
				sc.addItem(item);
			}
			else if(choice == 2) {
				System.out.println("Enter item name in order to remove from the shopping cart");
				String itemName = scan.next();
				sc.removeItem(itemName);
			}
			else if(choice == 3) {
				System.out.println("Total Cost: " + sc.calculateTotalCost());
			}
			else if(choice == 4) {
				sc.printItemDetails();
			}
			else if(choice > 5 || choice < 1) {
				System.out.println("Wrong input");
			}
			
		}while (choice != 5);
		
	}

}
