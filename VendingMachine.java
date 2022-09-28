
public class VendingMachine {
	private String name;
	private int quantity;
	
	public VendingMachine(String n, int q) {
		name = n;
		quantity = q;
	}
	
	public void newItem(String n) {
		name  = n;
		quantity = 0;
	}
	
	public void purchaseSnack(int num) {
		if(quantity > 0) {
			quantity-=num;
		}
		else {
			System.out.println("There is no "+name+" left in stock");
		}
	}
	
	public void restockSnack(int num) {
		//if(quantity < )
		quantity+=num;
		
	}
	
	public void reportInventory() {
		if(quantity <= 1) {
			System.out.println("There is "+quantity+" "+name+" in stock");
		}
		else {
			System.out.println("There are "+quantity+" "+name+" in stock");
		}
	}
}
