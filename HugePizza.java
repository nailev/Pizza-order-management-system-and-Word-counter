package HW3_Nadav_Shaoulian;


public class HugePizza extends Pizza {

	private int price = 55;

	public HugePizza(String name, int calories) {
		super(name, calories);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public double getTotal() {
		return this.getPrice();
	}
}
