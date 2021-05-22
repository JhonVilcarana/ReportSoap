package pe.edu.upeu.soap.ws.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.jws.WebService;
import pe.edu.upeu.soap.ws.entity.Reporte;
import pe.edu.upeu.soap.ws.entity.Producto;
import pe.edu.upeu.soap.ws.entity.Venta;
import pe.edu.upeu.soap.ws.util.Connexion;



@WebService(endpointInterface = "pe.edu.upeu.soap.ws.daoimp.ReportDao")
public class ReportDaoImpl implements ReportDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private ResultSetMetaData rsmd;
	private Connection cx;

	@Override
	public Reporte generateReport(String initialDate, String endDate, int idcliente) {
		int currentId=0;
		int nextId=0;
		Reporte report = new Reporte();
		try {
			cx = Connexion.getConexion();
			ps = cx.prepareStatement("SELECT * from cliente c JOIN venta v  ON c.idcliente= v.idcliente join detalle d ON d.idventa = v.idventa JOIN producto p on p.idproducto = d.idproducto WHERE v.fecha BETWEEN ? AND ? AND v.idcliente = ?");
			ps.setString(1, initialDate);
			ps.setString(2, endDate);
			ps.setInt(3, idcliente);
			rs = ps.executeQuery();
			rsmd=rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			Venta venta= new Venta();
			while (rs.next()) {
				nextId=rs.getInt("idventa");
				if(nextId!=currentId) {
					venta.idventa=nextId;
					venta.fecha=rs.getString("fecha");
					Producto producto = new Producto();
					producto.nombre=rs.getString("nomprod");
					producto.precio=rs.getDouble("precio");
					venta.productos.add(producto);
					report.ventas.add(venta);
				}				
		
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i+1)+" ");
				}
			
				
			}
			if(!rs.next()) {
				System.out.println("No hay registros de otra fecha");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		
		for (int i = 0; i < report.ventas.size(); i++) {
			System.out.println(report.ventas.get(i).empleado);
		}
		return report;
	}

	@Override
	public String getClients() {
		try {
			cx = Connexion.getConexion();
			ps = cx.prepareStatement("select * from cliente");
			rs = ps.executeQuery();
			rsmd=rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			while (rs.next()) {
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i+1)+" ");
				}
				System.out.println("\n");
				
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}


}
