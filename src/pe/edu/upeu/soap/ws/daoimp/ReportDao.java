
package pe.edu.upeu.soap.ws.daoimp;

import javax.jws.WebMethod;

import javax.jws.WebService;


import pe.edu.upeu.soap.ws.entity.Reporte;

@WebService
public interface ReportDao {
	@WebMethod
	public Reporte generateReport(String initialDate,String endDate, int idClient);
	@WebMethod
	public String getClients();
}
