package idiome.businessconstants;

public enum Factory {

	STUTTGART, NEW_YORK(Product.P2, Product.P3), TOKIO;
	private final Product[] products;
	Factory(Product ...products){
		this.products=products;
	}
	
	public Product[] getProducts(){
		return this.products;
	}
}
