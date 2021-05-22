package pe.edu.upeu.soap.ws.cliente;

import pe.edu.upeu.soap.ws.daoimp.ReportDaoImpl;

public class ClienteService {
	public static void main(String[] args) {
		ReportDaoImpl rdi = new ReportDaoImpl();
		rdi.generateReport("2020-02-01", "2021-05-03", 1);
	}
}
