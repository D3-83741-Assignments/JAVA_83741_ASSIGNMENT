package Demo3;

public class Invoice {
	
	
	String part_Number;
	String part_Description;
	int quantity_of_Items;
	double price_per_Item;
//	double getbill;
	
	public Invoice( String part_Number, String part_Description, int quantity_of_Items, double price_per_Item) {
		
		this.part_Number= part_Number;
		this.part_Description= part_Description;
		if(quantity_of_Items<0) {
			this.quantity_of_Items =0;
		}else {this.quantity_of_Items = quantity_of_Items;}
//		this.price_per_Item= price_per_Item;
		if(price_per_Item<0)
			{
				this.price_per_Item=0.0;
			}
		else {
			this.price_per_Item =price_per_Item ;
		}
		
		
	}

	public String getPart_Number() {
		return part_Number;
	}

	public void setPart_Number(String part_Number) {
		this.part_Number = part_Number;
	}

	public String getPart_Description() {
		return part_Description;
	}

	public void setPart_Description(String part_Description) {
		this.part_Description = part_Description;
	}

	public int getQuantity_of_Items() {
		return quantity_of_Items;
	}

	public void setQuantity_of_Items(int quantity_of_Items) {
		this.quantity_of_Items = quantity_of_Items;
	}

	public double getPrice_per_Item() {
		return price_per_Item;
	}

	public void setPrice_per_Item(double price_per_Item) {
		this.price_per_Item = price_per_Item;
	}
	public double getbill()
	{
		 return price_per_Item*quantity_of_Items;
	}
	 

}
