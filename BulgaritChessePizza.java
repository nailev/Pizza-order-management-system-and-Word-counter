package HW3_Nadav_Shaoulian;


public class BulgaritChessePizza extends ProductDecorater{

	
	public BulgaritChessePizza(Product decoratedProduct) {
		super(decoratedProduct);
	}

	@Override
	public double getTotal() {
		return decoratedProduct.getTotal()+8;
	}

}
