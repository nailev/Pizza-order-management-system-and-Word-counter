package HW3_Nadav_Shaoulian;


public class PersonalPizza extends Pizza {

	private int price = 20;

	public PersonalPizza(String name, int calories) {
		super(name, calories);
	}
//give user the price
	public int getPrice() {
		return price;
	}
//set price by user
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public double getTotal() {
		return this.getPrice();
	}

}
