package pe.edu.upeu.soap.ws.publico;

import javax.xml.ws.Endpoint;

import pe.edu.upeu.soap.ws.daoimp.ReportDaoImpl;



public class Public {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9090/soap/ventas/reporte", new ReportDaoImpl());
		System.out.println("Ejecutando!");
		System.out.println("finish");
	}
}
