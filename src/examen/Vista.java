package examen;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Vista extends JFrame{
	
	private Controlador miControlador;
	private Modelo miModelo;
	
	private JTextField txtName;
	private JTextField txtAno;
	private JTextField txtMedia;
	private JTextField txtletter;
	private JButton btnAgregar;
	private JButton btnExportar;
	private JTextArea txtTabla;

	public Vista() {
		new JFrame();
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce Nombre");
		lblNewLabel.setBounds(44, 45, 120, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce año");
		lblNewLabel_1.setBounds(44, 87, 83, 14);
		getContentPane().add(lblNewLabel_1);
		
		txtName = new JTextField();
		txtName.setBounds(174, 42, 86, 20);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtAno = new JTextField();
		txtAno.setBounds(174, 84, 86, 20);
		getContentPane().add(txtAno);
		txtAno.setColumns(10);
		
		txtMedia = new JTextField();
		txtMedia.setBounds(174, 162, 86, 20);
		getContentPane().add(txtMedia);
		txtMedia.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Media de Edades");
		lblNewLabel_2.setBounds(44, 165, 91, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Letra más repetida");
		lblNewLabel_3.setBounds(44, 205, 108, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtletter = new JTextField();
		txtletter.setBounds(174, 202, 86, 20);
		getContentPane().add(txtletter);
		txtletter.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(171, 115, 89, 23);
		getContentPane().add(btnAgregar);
		
		btnExportar = new JButton("Exportar");
		btnExportar.setBounds(313, 201, 89, 23);
		getContentPane().add(btnExportar);
		
		txtTabla = new JTextArea();
		txtTabla.setBounds(313, 52, 83, 127);
		getContentPane().add(txtTabla);
		
		JLabel lblUsers = new JLabel("Usurios de Allta");
		lblUsers.setBounds(313, 27, 89, 14);
		getContentPane().add(lblUsers);
		
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtTabla.setText("");
				miControlador.AgregarUsuer();
				miControlador.rellenarArea();
				
				//Sacamos la media y la introducimos ene l campo.
				double media = miControlador.HazMedia();		
				StringBuilder SBmedia = new StringBuilder((int) media);
				String Smedia = SBmedia.toString();
				txtMedia.setText(Smedia);
			}
		});
		
		// Listener para sacar a fichero
		btnExportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.sacaFichero();
			}
		});

	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public String dameNombre() {
		String name = txtName.getText();
		return name;
	}

	public String dameAno() {
		String  ano = txtAno.getText();
		return ano;
	}

	public void tomaUsuarios(HashMap<String, String> lista) {
		 for (HashMap.Entry<String,String> entry : lista.entrySet()) {
			 String clave = entry.getKey();
			 String valor = entry.getValue();
			 txtTabla.append(clave + " : " + valor + "\n");
		 }
		
	}
	
	
}		
			
			
		

			

