
public class Main {
	
	public static void main(String[] args) {
		VendingMachine Snack;
		Snack = new VendingMachine("Doritos", 0);
		
		VendingMachine Drink;
		Drink = new VendingMachine("Cola", 0);
		
		Drink.restockSnack(10);
		Snack.restockSnack(10);
		
		Drink.reportInventory();
		Snack.reportInventory();
		
		Drink.purchaseSnack(5);
		Snack.purchaseSnack(5);
		
		Drink.reportInventory();
		Snack.reportInventory();
		
		Snack.newItem("Lays");
		Snack.restockSnack(3);
		
		Snack.reportInventory();
		
		Snack.purchaseSnack(2);
		Snack.reportInventory();
		
	}
}
