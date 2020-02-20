import java.util.ArrayList;

public class SupplierList {
	private ArrayList <Supplier> mySuppliers;
	
	
	SupplierList(ArrayList<Supplier> sup)
	{
		this.setMySuppliers(sup);
	}


	public ArrayList <Supplier> getMySuppliers() {
		return mySuppliers;
	}


	public void setMySuppliers(ArrayList <Supplier> mySuppliers) {
		this.mySuppliers = mySuppliers;
	}
	
	//Prints all the supplier details in the arraylist by invoking supplierStats method in supplier 
	public String Supplierlistdisplay()
	{
		String s="";
		for(int i = 0;i<mySuppliers.size();i++)
		{
			s+=mySuppliers.get(i).supplierstat();
			s+="\n";
		}
		return s;
	}
}
