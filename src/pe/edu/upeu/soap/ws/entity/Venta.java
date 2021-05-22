package pe.edu.upeu.soap.ws.entity;

import java.util.ArrayList;
import java.util.List;



public class Venta {
	public int idventa;
	public String fecha;
	public String empleado;
	public List<Producto> productos= new ArrayList<Producto>();
	public Venta() {
		super();
	}
	public Venta(int idventa, String fecha, String empleado, List<Producto> productos) {
		super();
		this.idventa = idventa;
		this.fecha = fecha;
		this.empleado = empleado;
		this.productos = productos;
	}
	
	
	
}