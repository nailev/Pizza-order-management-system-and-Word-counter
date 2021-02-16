package HW3_Nadav_Shaoulian;


public class MushroomsPizza extends ProductDecorater {

	public MushroomsPizza(Product decoratedProduct) {
		super(decoratedProduct);
	}

	@Override
	public double getTotal() {
		return decoratedProduct.getTotal()+8;
	}
	

}
