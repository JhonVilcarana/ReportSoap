package pe.edu.upeu.soap.ws.util;



public class Test {
	public static void main(String[] args) {
		if(Connexion.getConexion()!=null) {
			System.out.println("Connected");
		}else {
			System.out.println("Disconnected");
		}
	}

}
