
	import java.util.Scanner;
	import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


	public class FrontEnd {
		private Shop theShop;
		private Scanner scan;
		
		FrontEnd() throws FileNotFoundException{
			FileManager fileM = new FileManager();
			this.theShop = new Shop (fileM.readSuppliers(), fileM.readItems());
			scan = new Scanner(System.in);
		}
		//this method displays the menu
		private void printChoices() {
			System.out.println("Please choose from one of the following options:");
			System.out.println("1: List all tools in the inventory");
			System.out.println("2. List all suppliers in the supplier list");
			System.out.println("3. Search for tool by tool name");
			System.out.println("4. Search tool by tool id.");
			System.out.println("5. Check item's quantity");
			System.out.println("6. Decrease quantity of item");
			System.out.println("7. Print today's order");
			System.out.println("8. Quit");
			System.out.println();
			System.out.println("Enter your selection: ");
		}
	//this method keeps running the menu until exits	
	public void menu() {
		while (true) {
			printChoices();
			
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 1:
				theShop.printInventory();
				break;
			case 2:
				theShop.printSupplierList();
				break;
			case 3:
				searchForItemByName();
				break;	
			case 4:
				searchForItemById();
				break;
			case 5:
				checkItemQuantity();
				break;
			case 6:
				decreaseItem();
				break;
			case 7:
				printOrder();
				break;
			case 8:
				System.out.println("\nTerminated!");
				return;
			case 9:
				System.out.println("\nInvalid input, try again.");
				break;
			
			}
		}
	}
	//prints the order for the day
	private void printOrder() {
		theShop.printOrder();
	}
	//decreases Item after searching using name, mimics a tool being bought.
	private void decreaseItem() 
	{
		System.out.println("Please enter the name of the item: ");
		String name= scan.nextLine();
		theShop.decreaseItem(name);
		System.out.println("Item decreased by one.");
	}

	//shows the item quantity after searching the item by name
	private void checkItemQuantity() {
		System.out.println("Please enter the name of the tool:");
		String Name = scan.nextLine();
		this.theShop.checkQuantity(Name);
		
	}
	
	//searches Item by Id and displays its details
	private void searchForItemById() {
		System.out.println("Enter Id of tool:");
		String s = scan.nextLine();
		Item i = theShop.searchForItemById(Integer.parseInt(s));
		if(i!=null)
			{System.out.print(i.toString());}
		else System.out.println("name not found");
	}
	//searches Item by name and displays its details
	private void searchForItemByName() {
		System.out.println("\nEnter name of the tool:");
		String s = scan.nextLine();
		Item i = theShop.searchForItemByName(s);
		System.out.print(i.toString());
	}
	public static void main(String[]args) throws FileNotFoundException {
		FrontEnd start= new FrontEnd();
		start.menu();
		
	}



	
}
