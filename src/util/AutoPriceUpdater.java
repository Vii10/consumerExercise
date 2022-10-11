package util;

import java.util.function.Consumer;

import entities.Product;

public class AutoPriceUpdater implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setValue(p.getValue() * 1.1);
	}
}
