package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglo.ArregloPaciente;
import clases.Paciente;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnadicionar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtNom;
	private JTextField txtDni;
	private JTextField txtConsulta;
	private JButton btnbuscar;
	private JButton btnreportar;
	private JTextArea txts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnadicionar = new JButton("Adicionar");
			btnadicionar.addActionListener(this);
			btnadicionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnadicionar.setBounds(226, 145, 98, 26);
			contentPane.add(btnadicionar);
		}
		{
			lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setBounds(10, 29, 146, 23);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("DNI");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_1.setBounds(10, 63, 146, 23);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Plan");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_2.setBounds(10, 97, 146, 23);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtNom = new JTextField();
			txtNom.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtNom.setBounds(72, 28, 257, 26);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			txtDni = new JTextField();
			txtDni.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtDni.setColumns(10);
			txtDni.setBounds(48, 60, 257, 26);
			contentPane.add(txtDni);
		}
		{
			txtConsulta = new JTextField();
			txtConsulta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtConsulta.setColumns(10);
			txtConsulta.setBounds(48, 96, 257, 26);
			contentPane.add(txtConsulta);
		}
		{
			btnbuscar = new JButton("Buscar");
			btnbuscar.addActionListener(this);
			btnbuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnbuscar.setBounds(118, 145, 98, 26);
			contentPane.add(btnbuscar);
		}
		{
			btnreportar = new JButton("Reportar");
			btnreportar.addActionListener(this);
			btnreportar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnreportar.setBounds(10, 146, 98, 24);
			contentPane.add(btnreportar);
		}
		{
			txts = new JTextArea();
			txts.setBounds(10, 181, 607, 254);
			contentPane.add(txts);
		}
		{
			lblNewLabel_3 = new JLabel("Estudiante a Modificar");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_3.setBounds(539, 0, 151, 35);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Nombre");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_4.setBounds(428, 29, 146, 23);
			contentPane.add(lblNewLabel_4);
		}
		{
			labeldni = new JLabel("DNI");
			labeldni.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labeldni.setBounds(428, 63, 146, 23);
			contentPane.add(labeldni);
		}
		{
			lblNewLabel_6 = new JLabel("Plan");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_6.setBounds(428, 97, 146, 23);
			contentPane.add(lblNewLabel_6);
		}
		{
			txtnombremod = new JTextField();
			txtnombremod.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtnombremod.setColumns(10);
			txtnombremod.setBounds(497, 29, 216, 26);
			contentPane.add(txtnombremod);
		}
		{
			txtdnimod = new JTextField();
			txtdnimod.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtdnimod.setColumns(10);
			txtdnimod.setBounds(473, 61, 240, 26);
			contentPane.add(txtdnimod);
		}
		{
			txtplanmod = new JTextField();
			txtplanmod.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtplanmod.setColumns(10);
			txtplanmod.setBounds(473, 96, 240, 26);
			contentPane.add(txtplanmod);
		}
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModificar.setBounds(334, 146, 98, 26);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEliminar.setBounds(442, 147, 98, 24);
		contentPane.add(btnEliminar);
Listado();
	}
	ArregloPaciente ap=new ArregloPaciente();
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel labeldni;
	private JLabel lblNewLabel_6;
	private JTextField txtnombremod;
	private JTextField txtdnimod;
	private JTextField txtplanmod;
	private JButton btnEliminar;
	private JButton btnModificar;
	void Imprimir(String s) {
		txts.append(s+"\n");
	}
	void Listado() { txts.setText("");
		Imprimir("Dni\tNombre\t\tTipo de Plan");
		for(int i = 0; i < ap.Tamaño(); i++)
		{
			Imprimir("" + ap.Obtener(i).getDni() + "\t" + ap.Obtener(i).getNom() + "\t\t" + ap.Obtener(i).getCita());
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnreportar) {
			do_btnreportar_actionPerformed(e);
		}
		if (e.getSource() == btnbuscar) {
			do_btnbuscar_actionPerformed(e);
		}
		if (e.getSource() == btnadicionar) {
			do_btnadicionar_actionPerformed(e);
		}
	}
	protected void do_btnadicionar_actionPerformed(ActionEvent e) {		
		try {
			
			if(txtDni.getText().isEmpty() || txtNom.getText().isEmpty() || txtConsulta.getText().isEmpty()) {			            	           
				JOptionPane.showMessageDialog(this,"Complete todos los campos requeridos","Error",JOptionPane.WARNING_MESSAGE);
			            return;				
			}
			
			Paciente p1 = ap.BuscarPorDni(txtDni.getText());	
			if(p1 == null) {			
				Paciente p11 = new Paciente(txtDni.getText(),txtNom.getText(),txtConsulta.getText());
				ap.adicionar(p11);
				}
			else {							
				JOptionPane.showMessageDialog(this, "El paciente ya existe");		
				}			
		}
		
		catch(Exception e1)	{
			JOptionPane.showMessageDialog(this,"Ocurrió un error inesperado","Error",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	protected void do_btnbuscar_actionPerformed(ActionEvent e) {
			String dni = txtDni.getText();
			Paciente resultado = ap.BuscarPorDni(dni);
			 if (resultado != null) {
				 JOptionPane.showMessageDialog(this, "Paciente encontrado:\n" + resultado.getNom()+"\nMotivo de cita:\n" + resultado.getCita());
		
			    } else {
			    	JOptionPane.showMessageDialog(this, "No se encontró paciente con DNI: " + dni);
			    }
	}
	protected void do_btnreportar_actionPerformed(ActionEvent e) {
		txts.setText("");
		Listado();
		for(int i = 0; i < ap.Tamaño(); i ++)
		{
			Paciente p = ap.Obtener(i);
			Imprimir(p.getDni() + "\t" + p.getNom() + "\t" + p.getCita());
		}
		
		Imprimir ("\nLa cantidad de pacientes es: " + ap.Tamaño());
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		
		String dni = txtDni.getText();
		Paciente resultado = ap.BuscarPorDni(dni);
				
		if(resultado!=null) { ap.Eliminar(resultado);
		JOptionPane.showMessageDialog(this, "Paciente eliminado correctamente.");		
		}

		else JOptionPane.showMessageDialog(this, "El paciente no existe en el registro.");
		
		Listado();
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		
		try {
			
			String dni = txtdnimod.getText().trim();
			String nuevoNombre = txtnombremod.getText().trim();
			String nuevaCita = txtplanmod.getText().trim();
			
			
			if (dni.isEmpty() || nuevoNombre.isEmpty() || nuevaCita.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Ingresa todos los datos a modificar.");
				return; 
			}
			
		
			Paciente resultado = ap.BuscarPorDni(dni);
	        
			if (resultado != null) {
			
				resultado.setNom(nuevoNombre);
				resultado.setDni(dni);
				resultado.setCita(nuevaCita);
	            
				ap.actualizar(resultado);
				JOptionPane.showMessageDialog(this, "Alumno modificado con éxito");
			} else {
				JOptionPane.showMessageDialog(this, "El alumno no existe en el registro");
			}
	        
			Listado();
	        
		} catch (Exception ex) {
			
			JOptionPane.showMessageDialog(this, "Ingresa todos los datos a modificar.");
		}
	}
}
