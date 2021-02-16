package HW3_Nadav_Shaoulian;


public class TomatoesPizza extends ProductDecorater {

	public TomatoesPizza(Product decoratedProduct) {
		super(decoratedProduct);
	}

	@Override
	public double getTotal() {
		return decoratedProduct.getTotal()+8;
	}

	
}
