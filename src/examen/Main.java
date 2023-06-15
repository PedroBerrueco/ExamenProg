package examen;

public class Main {

	public static void main(String[] args) {
		Vista miVista = new Vista();
		Modelo miModelo = new Modelo();
		Controlador miControlador = new Controlador();
		
		miVista.setControlador(miControlador);
		miVista.setModelo(miModelo);
		
		miModelo.setVista(miVista);
		
		miControlador.setVista(miVista);
		miControlador.setModelo(miModelo);
		
		miVista.setVisible(true);
		

	}

}
