package examen;
import java.util.HashMap;
import java.util.ArrayList;

public class Modelo {
	
	private Vista miVista;
	
	HashMap<String,String> lista = new HashMap<String,String>();
	ArrayList<String> lista1 = new ArrayList<>();

	public void setVista(Vista miVista) {
		this.miVista = miVista;
	}

	public void AnadeTabla(String name, String ano) {
		lista.put(name, ano);
	}

	public void rellenaLista() {
		miVista.tomaUsuarios(lista);
	}

	public ArrayList<String> dameAnos() {
		for (HashMap.Entry<String,String> entry : lista.entrySet()) {
			 String valor = entry.getValue();
			 System.out.println(lista);
			 lista1.add(valor);
		}
		return lista1;
	}
	
	
}

