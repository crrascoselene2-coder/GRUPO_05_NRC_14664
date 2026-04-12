package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglo.ArregloPaciente;
import clases.Paciente;

import javax.swing.JButton;
import javax.swing.JLabel;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
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
		setBounds(100, 100, 670, 501);
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
			lblNewLabel_2 = new JLabel("Motivo de Consulta");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_2.setBounds(10, 97, 146, 23);
			contentPane.add(lblNewLabel_2);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField.setBounds(72, 28, 257, 26);
			contentPane.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_1.setColumns(10);
			textField_1.setBounds(48, 60, 257, 26);
			contentPane.add(textField_1);
		}
		{
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_2.setColumns(10);
			textField_2.setBounds(144, 94, 257, 26);
			contentPane.add(textField_2);
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
Listado();
	}
	ArregloPaciente ap=new ArregloPaciente();
	void Imprimir(String s) {
		txts.append(s+"\n");
	}
	void Listado() {
		Imprimir("Dni\tNombre\t\tMotivo de Consulta");
		for(int i = 0; i < ap.Tamaño(); i++)
		{
			Imprimir("" + ap.Obtener(i).getDni() + "\t" + ap.Obtener(i).getNom() + "\t\t" + ap.Obtener(i).getCita());
		}
	}
	public void actionPerformed(ActionEvent e) {
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
		
	}
	protected void do_btnbuscar_actionPerformed(ActionEvent e) {
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
}
