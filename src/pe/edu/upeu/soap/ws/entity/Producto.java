package pe.edu.upeu.soap.ws.entity;

public class Producto {
	public String nombre;
	public double precio;
	public int cantidad;
	public double subtotal;
	public Producto() {
		super();
	}
	public Producto(String nombre, double precio, int cantidad, double subtotal) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}
	
	

}
