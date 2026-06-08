package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglo.ArregloAlumno;
import clases.Alumno;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

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
		setBounds(100, 100, 863, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnadicionar = new JButton("Adicionar");
			btnadicionar.addActionListener(this);
			btnadicionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnadicionar.setBounds(226, 218, 98, 26);
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
			btnbuscar.setBounds(118, 218, 98, 26);
			contentPane.add(btnbuscar);
		}
		{
			btnreportar = new JButton("Reportar");
			btnreportar.addActionListener(this);
			btnreportar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnreportar.setBounds(10, 219, 98, 24);
			contentPane.add(btnreportar);
		}
		{
			lblNewLabel_3 = new JLabel("Estudiante a Modificar");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_3.setBounds(428, 0, 151, 35);
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
		btnModificar.setBounds(334, 219, 98, 26);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEliminar.setBounds(442, 220, 98, 24);
		contentPane.add(btnEliminar);
		{
			lblNewLabel_5 = new JLabel("Registrar Estudiante");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_5.setBounds(10, 0, 151, 35);
			contentPane.add(lblNewLabel_5);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 271, 723, 310);
			contentPane.add(scrollPane);
			{
				txts = new JTextArea();
				scrollPane.setViewportView(txts);
			}
		}
		{
			lblNewLabel_7 = new JLabel(" MP");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_7.setBounds(10, 131, 46, 14);
			contentPane.add(lblNewLabel_7);
		}
		{
			txtmp = new JTextField();
			txtmp.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtmp.setBounds(48, 130, 257, 26);
			contentPane.add(txtmp);
			txtmp.setColumns(10);
		}
Listado();
	}
	ArregloAlumno al=new ArregloAlumno();
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel labeldni;
	private JLabel lblNewLabel_6;
	private JTextField txtnombremod;
	private JTextField txtdnimod;
	private JTextField txtplanmod;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JLabel lblNewLabel_5;
	private JScrollPane scrollPane;
	private JTextArea txts;
	private JLabel lblNewLabel_7;
	private JTextField txtmp;
	void Imprimir(String s) {
		txts.append(s+"\n");
	}
	void Listado() {
		Imprimir("Código\tDni\tNombre\tTipo de Plan\tPrecio\tMP\tFI\tFV");
		for(int i = 0; i < al.Tamaño(); i++)
		{
			Imprimir(al.Obtener(i).getCod() +"\t" + al.Obtener(i).getDni() + "\t" + al.Obtener(i).getNom() + "\t" + al.Obtener(i).getCita()+"\t"+al.Obtener(i).getPrecio()+"\t"+al.Obtener(i).getMp()+"\t"+al.Obtener(i).getFechaIncripción()+"\t"+al.Obtener(i).getFechavencimiento());
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
			
			if(txtDni.getText().isEmpty() || txtNom.getText().isEmpty() || txtConsulta.getText().isEmpty()|| txtmp.getText().isEmpty()) {			            	           
				JOptionPane.showMessageDialog(this,"Complete todos los campos requeridos","Error",JOptionPane.WARNING_MESSAGE);
			            return;				
			}
			int nuevoCodigo = al.generarCodigoCorrelativo();
			Alumno p1 = al.BuscarPorDni(txtDni.getText());	
			if(p1 == null) {			
				Alumno p11 = new Alumno(txtDni.getText(),txtNom.getText(),txtConsulta.getText(),nuevoCodigo,txtmp.getText());
				al.adicionar(p11);
				al.guardarEnArchivoTxt();
				}
			else {							
				JOptionPane.showMessageDialog(this, "El alumno ya existe");		
				}			
		}
		
		catch(Exception e1)	{
			JOptionPane.showMessageDialog(this,"Ocurrió un error inesperado","Error",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	protected void do_btnbuscar_actionPerformed(ActionEvent e) {
		try {	
		String dni = txtDni.getText();
		if (dni.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Por favor, ingrese DNI", "Sin DNI", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		else if (!dni.matches("[0-9]{8}")) {
			JOptionPane.showMessageDialog(this, "Error: El DNI debe tener exactamente 8 dígitos numéricos.","Formato incorrecto", JOptionPane.ERROR_MESSAGE);	
			return;
		}
		
			Alumno resultado = al.BuscarPorDni(dni);
			 if (resultado != null) {
				 JOptionPane.showMessageDialog(this, "Alumno encontrado:\n" + resultado.getNom()+"\nPlan:\n" + resultado.getCita());
		
			    } else {
			    	JOptionPane.showMessageDialog(this, "No se encontró alumno con DNI: " + dni);
			    }
		}	 catch (Exception x) {
		JOptionPane.showMessageDialog(this,"Ocurrió un error inesperado","Error",JOptionPane.ERROR_MESSAGE);
	}
	}
	protected void do_btnreportar_actionPerformed(ActionEvent e) {
		txts.setText("");
		Listado();			
		
		Imprimir ("\nLa cantidad de alumnos es: " + al.Tamaño());
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		String dni = txtDni.getText();
		try {	
		
		Alumno resultado = al.BuscarPorDni(dni);
				
		if(resultado!=null) { 
			al.Eliminar(resultado);
			al.guardarEnArchivoTxt();
		JOptionPane.showMessageDialog(this, "Alumno eliminado correctamente.");		
		}else {
			JOptionPane.showMessageDialog(this, "El alumno no existe en el registro.");
		}
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(this, "Error inesperado al eliminar.");
		}
		
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
			
		
			Alumno resultado = al.BuscarPorDni(dni);
	        
			if (resultado != null) {
			
				resultado.setNom(nuevoNombre);
				resultado.setDni(dni);
				resultado.setCita(nuevaCita);
	            
				al.actualizar(resultado);
				al.guardarEnArchivoTxt();
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
