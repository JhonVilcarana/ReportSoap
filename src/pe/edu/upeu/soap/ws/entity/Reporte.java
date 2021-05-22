package pe.edu.upeu.soap.ws.entity;

import java.util.ArrayList;
import java.util.List;


public class Reporte {
	public String cliente;
	public String dni;
	public List<Venta> ventas= new ArrayList<Venta>();
	
	
	public Reporte() {
		super();
	}


	public Reporte(String cliente, String dni, List<Venta> ventas) {
		super();
		this.cliente = cliente;
		this.dni = dni;
		this.ventas = ventas;
	}
	
	
}
