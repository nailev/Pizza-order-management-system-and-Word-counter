package HW3_Nadav_Shaoulian;


public class OlivesPizza extends ProductDecorater {

	public OlivesPizza(Product decoratedProduct) {
		super(decoratedProduct);
	}

	@Override
	public double getTotal() {
		return decoratedProduct.getTotal()+8;
	}

	
}
