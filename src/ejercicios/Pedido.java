package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private int number;
	private EstadoPedido status;
	private List<Producto> products;

	public Pedido(int number) {
		this.number = number;
		this.status = EstadoPedido.PENDIENTE;
		this.products = new ArrayList<>();
	}

	public void addProduct(Producto product) {
		products.add(product);
	}

	public double calculateTotal() {
		double total = 0;
		for (Producto p : products) {
			total += p.getPrice();
		}
		return total;
	}

	public int getNumber() {
		return number;
	}

	public EstadoPedido getStatus() {
		return status;
	}

	public void setStatus(EstadoPedido status) {
		this.status = status;
	}
}
