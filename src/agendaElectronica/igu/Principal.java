package agendaElectronica.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {
	private JTextField txtDNI;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtFNac;
	private JTextField txtIndice;

	
	String dnis[] = new String[10];
	String nombres[] = new String[10];
	String apellidos[] = new String[10];
	String direcciones[] = new String[10];
	String telefonos[] = new String[10];
	String fechasDeNacimiento[] = new String[10];
		
	
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 500);
		setLocationRelativeTo(null);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTitulo = new JLabel("Agenda Electrónica");
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setFont(new Font("Roboto Black", Font.PLAIN, 50));
		lbTitulo.setBounds(12, 0, 776, 84);
		contentPane.add(lbTitulo);
		
		JLabel lbDNI = new JLabel("DNI");
		lbDNI.setHorizontalAlignment(SwingConstants.CENTER);
		lbDNI.setFont(new Font("Roboto", Font.PLAIN, 25));
		lbDNI.setBounds(39, 120, 110, 30);
		contentPane.add(lbDNI);
		
		JLabel lbNombre = new JLabel("Nombre");
		lbNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lbNombre.setFont(new Font("Roboto", Font.PLAIN, 25));
		lbNombre.setBounds(39, 190, 110, 30);
		contentPane.add(lbNombre);
		
		JLabel lbApellido = new JLabel("Apellido");
		lbApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lbApellido.setFont(new Font("Roboto", Font.PLAIN, 25));
		lbApellido.setBounds(39, 260, 110, 30);
		contentPane.add(lbApellido);
		
		JLabel lbDireccion = new JLabel("Dirección");
		lbDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lbDireccion.setFont(new Font("Roboto", Font.PLAIN, 25));
		lbDireccion.setBounds(399, 120, 110, 30);
		contentPane.add(lbDireccion);
		
		JLabel lbTelefono = new JLabel("Teléfono");
		lbTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lbTelefono.setFont(new Font("Roboto", Font.PLAIN, 25));
		lbTelefono.setBounds(399, 190, 110, 30);
		contentPane.add(lbTelefono);
		
		JLabel lbFNac = new JLabel("F. Nac");
		lbFNac.setHorizontalAlignment(SwingConstants.CENTER);
		lbFNac.setFont(new Font("Roboto", Font.PLAIN, 25));
		lbFNac.setBounds(399, 260, 110, 30);
		contentPane.add(lbFNac);
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Roboto", Font.PLAIN, 25));
		txtDNI.setBounds(159, 120, 220, 30);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Roboto", Font.PLAIN, 25));
		txtNombre.setBounds(159, 190, 220, 30);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Roboto", Font.PLAIN, 25));
		txtApellido.setBounds(159, 260, 220, 30);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Roboto", Font.PLAIN, 25));
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(519, 120, 220, 30);
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Roboto", Font.PLAIN, 25));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(519, 190, 220, 30);
		contentPane.add(txtTelefono);
		
		txtFNac = new JTextField();
		txtFNac.setFont(new Font("Roboto", Font.PLAIN, 25));
		txtFNac.setColumns(10);
		txtFNac.setBounds(519, 260, 220, 30);
		contentPane.add(txtFNac);
		
		JButton btnAnterior = new JButton("<<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = Integer.parseInt(txtIndice.getText());
				if(indice > 0) {
					indice--;
					txtIndice.setText(String.valueOf(indice));
					cargarCampos(indice);
				}
			}
		});
		btnAnterior.setFont(new Font("Roboto Medium", Font.PLAIN, 25));
		btnAnterior.setActionCommand("");
		btnAnterior.setBounds(260, 340, 60, 40);
		contentPane.add(btnAnterior);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = Integer.parseInt(txtIndice.getText());
				guardarDatos(indice);
			}
		});
		btnGuardar.setFont(new Font("Roboto Medium", Font.PLAIN, 25));
		btnGuardar.setBounds(335, 340, 130, 40);
		contentPane.add(btnGuardar);
		
		JButton btnSiguiente = new JButton(">>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = Integer.parseInt(txtIndice.getText());
				if(indice<9) {
					indice++;
					txtIndice.setText(String.valueOf(indice));
					cargarCampos(indice);
				}
			}
		});
		btnSiguiente.setFont(new Font("Roboto Medium", Font.PLAIN, 25));
		btnSiguiente.setBounds(480, 340, 60, 40);
		contentPane.add(btnSiguiente);
		
		JLabel lbIndice = new JLabel("Índice:");
		lbIndice.setHorizontalAlignment(SwingConstants.CENTER);
		lbIndice.setFont(new Font("Roboto", Font.PLAIN, 25));
		lbIndice.setBounds(285, 400, 80, 30);
		contentPane.add(lbIndice);
		
		txtIndice = new JTextField();
		txtIndice.setHorizontalAlignment(SwingConstants.CENTER);
		txtIndice.setText("0");
		txtIndice.setEditable(false);
		txtIndice.setFont(new Font("Roboto", Font.PLAIN, 30));
		txtIndice.setBounds(375, 400, 50, 30);
		contentPane.add(txtIndice);
		txtIndice.setColumns(10);
		
		JSeparator separatorTop = new JSeparator();
		separatorTop.setBounds(10, 80, 780, 2);
		contentPane.add(separatorTop);
		
		JSeparator separatorBot = new JSeparator();
		separatorBot.setBounds(10, 320, 780, 3);
		contentPane.add(separatorBot);
	}
	public void cargarCampos(int indice) {
		txtDNI.setText(dnis[indice]);
		txtNombre.setText(nombres[indice]);
		txtApellido.setText(apellidos[indice]);
		txtDireccion.setText(direcciones[indice]);
		txtTelefono.setText(telefonos[indice]);
		txtFNac.setText(fechasDeNacimiento[indice]);
	}
	
	public void guardarDatos(int indice) {
		dnis[indice] = txtDNI.getText();
		nombres[indice]= txtNombre.getText();
		apellidos[indice] = txtApellido.getText();
		direcciones[indice] = txtDireccion.getText();
		telefonos[indice] = txtTelefono.getText();
		fechasDeNacimiento[indice] = txtFNac.getText();
	}
}

