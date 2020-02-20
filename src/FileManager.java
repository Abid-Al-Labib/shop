import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileManager {

	private File itemfile;
	private File supplierfile;
	ArrayList<Supplier> supplierAL;
	
	FileManager()
	{
		itemfile = new File("items.txt");
		supplierfile =new File ("suppliers.txt"); 
	}
	
	
	public SupplierList readSuppliers() throws FileNotFoundException
	{
		ArrayList <Supplier> mySuppliers;
		mySuppliers = new ArrayList();
		Scanner scan = new Scanner (this.supplierfile);
		String sentence;
		String name, address, contact;
		String [] array;
		int Id;
		
		//getting lines from the supplier.txt file and using logic to make new supplier objects and adding to arraylist
		while(scan.hasNextLine())
		{
			array = scan.nextLine().split(";");
			Id = Integer.parseInt(array[0]);
			name = array[1];
			address = array[2];
			contact = array[3];
			Supplier temp = new Supplier(Id,name,address,contact);
			mySuppliers.add(temp);
		}
		SupplierList templist = new SupplierList(mySuppliers);
		this.supplierAL = mySuppliers;
		return templist;
	}
	
	
	//using logic to match supplier from supplier name in tool.txt file
	public Supplier searchSupplier(int id)
	{
		for(int i= 0;i<this.supplierAL.size();i++)
		{
			if(id == supplierAL.get(i).getId())
			{
				return supplierAL.get(i);
			}
		}
		return null;
	}
	
	//getting lines from the tool.txt file and using logic to make new Tool objects and adding to arraylist
	
	public Inventory readItems() throws FileNotFoundException
	{
		ArrayList <Item> myItems;
		myItems = new ArrayList();
		Scanner scan = new Scanner (this.itemfile);
		String sentence,name;
		String [] array;
		int Id,supId,quantity;
		float price;
		
		while(scan.hasNextLine())
		{
			array = scan.nextLine().split(";");
			Id = Integer.parseInt(array[0]);
			name = array[1];
			quantity = Integer.parseInt(array[2]);
			price =Float.parseFloat(array[3]);
			supId = Integer.parseInt(array[4]);
			
			Supplier temp;
			temp = searchSupplier(supId);
			Item newItem=null;
			if(temp!=null)
			{
				 newItem = new Item(Id,name,quantity,price,temp);
			}
			myItems.add(newItem);
		}
		Inventory tempinventory = new Inventory(myItems);
		return tempinventory;
	}
	
	
}
