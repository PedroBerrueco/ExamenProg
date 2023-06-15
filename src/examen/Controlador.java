package examen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Controlador {
	
	private Vista miVista;
	private Modelo miModelo;
	ArrayList<String> lista1 = new ArrayList<>();
	
	
	public void setVista(Vista miVista) {
		this.miVista = miVista;
	}
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	public void AgregarUsuer() {
		String name = miVista.dameNombre();
		String ano = miVista.dameAno();
		miModelo.AnadeTabla(name,ano);
	}
	public void rellenarArea() {
		miModelo.rellenaLista();
		
	}
	public double HazMedia() {
		lista1 = miModelo.dameAnos();
		int ano = 0;
		int mano = 0;
		for (String element : lista1) {
		try {
			ano = Integer.parseInt(element);
			mano += ano;
		} catch (Exception e) {
			System.out.println("No se ha metido un entero");
		}
		
		}
		double  media =  (mano / lista1.size());
		return media;
	}
	//Metodo para sacar el fichero
	public void sacaFichero() {
		String ruta = "listado.csv";
		File archivo = new File(ruta);
		try {
			FileWriter listado = new FileWriter(archivo);
		} catch (IOException e) {
			System.out.println("El fichero no se ha generado");
			e.printStackTrace();
		}
		
	}
	
	
}
