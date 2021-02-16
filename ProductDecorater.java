package HW3_Nadav_Shaoulian;


public abstract class ProductDecorater implements Product {
	
	protected Product decoratedProduct;
	//decorator
	public ProductDecorater(Product decoratedProduct) {
		this.decoratedProduct = decoratedProduct;
	}
}
