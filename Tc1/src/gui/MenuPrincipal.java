package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import arreglo.ArregloAlumno;
import arreglo.ArregloProfesor;
import clases.Alumno;
import reportes.ReporteProfesor;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;

public class MenuPrincipal extends JFrame implements ActionListener, MouseListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JButton btnAlumnos;
	private JButton btnVenta;
	private JButton btnClases;
	private JButton btnReporte;
	private JPanel panelCentral;
	private JPanel moduloAlumnos;
	private JPanel moduloVentas;
	private JPanel moduloClases;
	private JPanel moduloReporte;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnCerrarSesión;
	private JLabel lblNewLabel_2;
	private JTextField txtBuscarDniAlumno;
	private JButton btnBuscarDniAlumno;
	private JScrollPane scrollPane;
	private JLabel lblDatosDelAlumno;
	private JLabel lblDatosDelApoderado;
	private JLabel lblDni;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblFechaDeNac;
	private JLabel lblCelular;
	private JTextField txtDniAlumno;
	private JTextField txtNombresAlumno;
	private JTextField txtApellidosAlumno;
	private JTextField txtCelularAlumno;
	private JLabel lblDni_1;
	private JLabel lblNombre_1;
	private JLabel lblApellidos_1;
	private JLabel lblCelular_1;
	private JLabel lblParentesco;
	private JTextField txtDniApoderado;
	private JTextField txtNombresApoderado;
	private JTextField txtApellidosApoderado;
	private JTextField txtCelularApoderado;
	private JButton btnMatricular;
	private JButton btnModificar;
	private JButton btnLimpiar;
	private JPanel panel_1;
	private JLabel lblNewLabel_3;
	private JTextField txtBuscarDniVenta2;
	private JLabel lblGenerarVenta;
	private JTextField textField_7;
	private JComboBox comboBox;
	private JTextField textField_8;
	private JComboBox comboBox_1;
	private JScrollPane scrollPane_1;
	private JTable tbTablaVentas;
	private JLabel lblNewLabel_8;
	private JTextField txtBuscarDniVenta1;
	private JButton btnBuscarDniVenta1;
	private JLabel lblPanelDeVentas;
	private JLabel lblNombresDelAlumno;
	private JLabel lblPlanAComprar;
	private JLabel lblPrecioTotals;
	private JLabel lblMtodoDePago;
	private JButton btnAnularVenta;
	private JLabel lblMontoEfectivo;
	private JLabel lblMontoDigital;
	private JTextField textField_10;
	private JTextField textField_11;
	private JButton btnBuscarDniVenta2;
	private JButton btnProcesarVenta;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel_4;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblRegistrarClase;
	private JLabel lblArteMarcial;
	private JLabel lblProfesor;
	private JLabel lblTurno;
	private JLabel lblNAlumnos;
	private JComboBox comboBox_arteMarcial;
	private JComboBox comboBox_profesor;
	private JComboBox comboBox_turno;
	private JButton btnRegistrarClase;
	private JLabel lblCalificacin;
	private JLabel lblEstrella;
	private JLabel lblNormal;
	private JLabel lblBajo;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField txtNdeAlumnos;
	private JButton btnModificarClase;
	private JLabel lblNewLabel_9;
	private JScrollPane scrollPane_2;
	private JTable table_2;
	private JButton btnMostrarTodoClases;
	private JButton btnMostrarTodoVentas;
	private JButton btnMostrarTodoAlumnos;
	private JLabel lblPanelDeClases;
	private JTabbedPane tabbedPane;
	private JPanel panel_General;
	private JPanel panel_Asesores;
	private JPanel panel_Profesores;
	private JLabel lblPanelDeReportes;
	private JLabel lblGeneral;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JComboBox comboBox_mesGeneral;
	private JComboBox comboBox_sedeGeneral;
	private JButton btnFiltrarGENERAL;
	private JScrollPane scrollPane_3;
	private JTable tbReporteGeneral;
	private JButton btnMostrarTodoGeneral;
	private JLabel lblPanelDeReportes_1;
	private JLabel lblAsesores;
	private JLabel lblNewLabel_13;
	private JComboBox comboBox_mesAsesor;
	private JComboBox comboBox_asesorAsesor;
	private JButton btnFiltrarASESORES;
	private JScrollPane scrollPane_4;
	private JButton btnMostrarTodoAsesores;
	private JTable tbReporteAsesores;
	private JLabel lblPanelDeReportes_2;
	private JLabel lblProfesores;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JComboBox comboBox_mesProfesor;
	private JComboBox comboBox_profesorReporte;
	private JButton btnFiltrarPROFESOR;
	private JButton btnMostrarTodoPROFESOR;
	private JPanel panel_6;
	private JPanel panel_7;
	private JLabel lblNewLabel_16;
	private JPanel panel_8;
	private JLabel lblNewLabel_12;
	private JButton btnBuscarClase;
	private JComboBox comboBox_SedeClase;
	private JTable tbTabla;
	private JScrollPane scrollPane_5;
	private JTable tbReporteProfesores;
	private JButton btnProgramadores;
	private JButton btnSaldarDeuda;
	private JButton btnLimpiarVentas;
	private JDateChooser BFecha_Clases;

	/**
	 * Launch the application.
	 */
	int idClaseSeleccionada = -1; // -1 significa que no hay nada seleccionado
	int codigoAlumnoSeleccionado = -1;
	private JDateChooser FechaAlumno;
	private JPanel moduloProgramadores;
	private JPanel panel_9;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_33;
	private JLabel lblNewLabel_34;
	private JLabel lblNewLabel_35;
	private JLabel lblNewLabel_36;
	private JLabel lblNewLabel_37;
	private JTextField txtParentescoApoderado;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		
		if (VentanaLogin.idUsuarioLogueado == 0) {
	        JOptionPane.showMessageDialog(null, "¡Acceso denegado! Debe iniciar sesión primero.");
	        System.exit(0); // Cierra el programa al instante
	    }
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1397, 809);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panelCentral = new JPanel();
			panelCentral.setBounds(229, 96, 1152, 674);
			contentPane.add(panelCentral);
			panelCentral.setLayout(new CardLayout(0, 0));
			{
				moduloAlumnos = new JPanel();
				moduloAlumnos.setBackground(new Color(255, 255, 255));
				panelCentral.add(moduloAlumnos, "name_5947764386400");
				moduloAlumnos.setLayout(null);
				{
					lblNewLabel = new JLabel("Panel de Alumnos");
					lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
					lblNewLabel.setBounds(23, 21, 186, 35);
					moduloAlumnos.add(lblNewLabel);
				}
				{
					lblNewLabel_2 = new JLabel("Buscar por DNI:");
					lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_2.setBounds(23, 62, 109, 24);
					moduloAlumnos.add(lblNewLabel_2);
				}
				{
					txtBuscarDniAlumno = new JTextField();
					txtBuscarDniAlumno.addKeyListener(this);
					txtBuscarDniAlumno.setBounds(129, 65, 324, 20);
					moduloAlumnos.add(txtBuscarDniAlumno);
					txtBuscarDniAlumno.setColumns(10);
				}
				{
					btnBuscarDniAlumno = new JButton("BUSCAR");
					btnBuscarDniAlumno.addActionListener(this);
					btnBuscarDniAlumno.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnBuscarDniAlumno.setBounds(472, 64, 89, 23);
					moduloAlumnos.add(btnBuscarDniAlumno);
				}
				{
					scrollPane = new JScrollPane();
					scrollPane.setBounds(23, 97, 1107, 175);
					moduloAlumnos.add(scrollPane);
					{
						tbTabla = new JTable();
						tbTabla.addMouseListener(this);
						tbTabla.setFillsViewportHeight(true);
						scrollPane.setViewportView(tbTabla);
					}
				}
				{
					btnMatricular = new JButton("MATRICULAR");
					btnMatricular.addActionListener(this);
					btnMatricular.setBackground(new Color(192, 192, 192));
					btnMatricular.setFont(new Font("Tahoma", Font.BOLD, 14));
					btnMatricular.setBounds(269, 592, 144, 48);
					moduloAlumnos.add(btnMatricular);
				}
				{
					btnModificar = new JButton("MODIFICAR");
					btnModificar.addActionListener(this);
					btnModificar.setBackground(new Color(192, 192, 192));
					btnModificar.setFont(new Font("Tahoma", Font.BOLD, 14));
					btnModificar.setBounds(472, 592, 129, 48);
					moduloAlumnos.add(btnModificar);
				}
				{
					btnLimpiar = new JButton("LIMPIAR");
					btnLimpiar.addActionListener(this);
					btnLimpiar.setBackground(new Color(192, 192, 192));
					btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 14));
					btnLimpiar.setBounds(670, 592, 117, 48);
					moduloAlumnos.add(btnLimpiar);
				}
				{
					panel_2 = new JPanel();
					panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_2.setBounds(23, 305, 472, 265);
					moduloAlumnos.add(panel_2);
					panel_2.setLayout(null);
					{
						lblDatosDelAlumno = new JLabel("Datos del Alumno");
						lblDatosDelAlumno.setBounds(10, 11, 186, 35);
						panel_2.add(lblDatosDelAlumno);
						lblDatosDelAlumno.setFont(new Font("SansSerif", Font.BOLD, 20));
					}
					{
						lblDni = new JLabel("DNI:");
						lblDni.setBounds(10, 48, 186, 35);
						panel_2.add(lblDni);
						lblDni.setFont(new Font("SansSerif", Font.BOLD, 16));
					}
					{
						lblNombre = new JLabel("NOMBRES:");
						lblNombre.setBounds(10, 88, 186, 35);
						panel_2.add(lblNombre);
						lblNombre.setFont(new Font("SansSerif", Font.BOLD, 16));
					}
					{
						txtNombresAlumno = new JTextField();
						txtNombresAlumno.addKeyListener(this);
						txtNombresAlumno.setBounds(123, 94, 324, 24);
						panel_2.add(txtNombresAlumno);
						txtNombresAlumno.setColumns(10);
					}
					{
						txtDniAlumno = new JTextField();
						txtDniAlumno.addKeyListener(this);
						txtDniAlumno.setBounds(70, 57, 377, 24);
						panel_2.add(txtDniAlumno);
						txtDniAlumno.setColumns(10);
					}
					{
						lblApellidos = new JLabel("APELLIDOS:");
						lblApellidos.setBounds(10, 129, 186, 35);
						panel_2.add(lblApellidos);
						lblApellidos.setFont(new Font("SansSerif", Font.BOLD, 16));
					}
					{
						txtApellidosAlumno = new JTextField();
						txtApellidosAlumno.addKeyListener(this);
						txtApellidosAlumno.setBounds(123, 134, 324, 24);
						panel_2.add(txtApellidosAlumno);
						txtApellidosAlumno.setColumns(10);
					}
					{
						lblCelular = new JLabel("CELULAR:");
						lblCelular.setBounds(10, 169, 186, 35);
						panel_2.add(lblCelular);
						lblCelular.setFont(new Font("SansSerif", Font.BOLD, 16));
					}
					{
						txtCelularAlumno = new JTextField();
						txtCelularAlumno.addKeyListener(this);
						txtCelularAlumno.setBounds(123, 175, 324, 24);
						panel_2.add(txtCelularAlumno);
						txtCelularAlumno.setColumns(10);
					}
					{
						lblFechaDeNac = new JLabel("FECHA DE NAC:");
						lblFechaDeNac.setBounds(10, 210, 186, 35);
						panel_2.add(lblFechaDeNac);
						lblFechaDeNac.setFont(new Font("SansSerif", Font.BOLD, 16));
					}
					{
						FechaAlumno = new JDateChooser();
						FechaAlumno.setBounds(149, 215, 298, 30);
						panel_2.add(FechaAlumno);
					}
				}
				{
					panel_3 = new JPanel();
					panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_3.setBounds(574, 305, 556, 265);
					moduloAlumnos.add(panel_3);
					panel_3.setLayout(null);
					{
						lblDatosDelApoderado = new JLabel("Datos del Apoderado");
						lblDatosDelApoderado.setBounds(10, 11, 247, 35);
						panel_3.add(lblDatosDelApoderado);
						lblDatosDelApoderado.setFont(new Font("SansSerif", Font.BOLD, 20));
					}
					{
						lblDni_1 = new JLabel("DNI:");
						lblDni_1.setBounds(10, 48, 186, 35);
						panel_3.add(lblDni_1);
						lblDni_1.setFont(new Font("SansSerif", Font.BOLD, 16));
					}
					{
						lblNombre_1 = new JLabel("NOMBRES:");
						lblNombre_1.setBounds(10, 88, 186, 35);
						panel_3.add(lblNombre_1);
						lblNombre_1.setFont(new Font("SansSerif", Font.BOLD, 16));
					}
					{
						lblApellidos_1 = new JLabel("APELLIDOS:");
						lblApellidos_1.setBounds(10, 129, 186, 35);
						panel_3.add(lblApellidos_1);
						lblApellidos_1.setFont(new Font("SansSerif", Font.BOLD, 16));
					}
					{
						lblCelular_1 = new JLabel("CELULAR:");
						lblCelular_1.setBounds(10, 169, 186, 35);
						panel_3.add(lblCelular_1);
						lblCelular_1.setFont(new Font("SansSerif", Font.BOLD, 16));
					}
					{
						lblParentesco = new JLabel("PARENTESCO:");
						lblParentesco.setBounds(10, 210, 186, 35);
						panel_3.add(lblParentesco);
						lblParentesco.setFont(new Font("SansSerif", Font.BOLD, 16));
					}
					{
						txtDniApoderado = new JTextField();
						txtDniApoderado.addKeyListener(this);
						txtDniApoderado.setBounds(70, 57, 459, 24);
						panel_3.add(txtDniApoderado);
						txtDniApoderado.setColumns(10);
					}
					{
						txtNombresApoderado = new JTextField();
						txtNombresApoderado.addKeyListener(this);
						txtNombresApoderado.setBounds(120, 94, 409, 24);
						panel_3.add(txtNombresApoderado);
						txtNombresApoderado.setColumns(10);
					}
					{
						txtApellidosApoderado = new JTextField();
						txtApellidosApoderado.addKeyListener(this);
						txtApellidosApoderado.setBounds(120, 134, 409, 24);
						panel_3.add(txtApellidosApoderado);
						txtApellidosApoderado.setColumns(10);
					}
					{
						txtCelularApoderado = new JTextField();
						txtCelularApoderado.addKeyListener(this);
						txtCelularApoderado.setBounds(120, 177, 409, 24);
						panel_3.add(txtCelularApoderado);
						txtCelularApoderado.setColumns(10);
					}
					{
						txtParentescoApoderado = new JTextField();
						txtParentescoApoderado.addKeyListener(this);
						txtParentescoApoderado.setColumns(10);
						txtParentescoApoderado.setBounds(147, 215, 382, 24);
						panel_3.add(txtParentescoApoderado);
					}
				}
				{
					btnMostrarTodoAlumnos = new JButton("MOSTRAR TODO");
					btnMostrarTodoAlumnos.addActionListener(this);
					btnMostrarTodoAlumnos.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnMostrarTodoAlumnos.setBounds(574, 64, 135, 23);
					moduloAlumnos.add(btnMostrarTodoAlumnos);
				}
			}
			{
				moduloVentas = new JPanel();
				moduloVentas.setBackground(new Color(255, 255, 255));
				panelCentral.add(moduloVentas, "name_5947771658200");
				moduloVentas.setLayout(null);
				{
					panel_1 = new JPanel();
					panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_1.setBounds(24, 363, 1101, 195);
					moduloVentas.add(panel_1);
					panel_1.setLayout(null);
					{
						lblNewLabel_3 = new JLabel("Buscar por DNI:");
						lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
						lblNewLabel_3.setBounds(21, 56, 109, 24);
						panel_1.add(lblNewLabel_3);
					}
					{
						txtBuscarDniVenta2 = new JTextField();
						txtBuscarDniVenta2.addKeyListener(this);
						txtBuscarDniVenta2.setColumns(10);
						txtBuscarDniVenta2.setBounds(127, 59, 164, 20);
						panel_1.add(txtBuscarDniVenta2);
					}
					{
						btnBuscarDniVenta2 = new JButton("BUSCAR");
						btnBuscarDniVenta2.addActionListener(this);
						btnBuscarDniVenta2.setFont(new Font("Tahoma", Font.BOLD, 11));
						btnBuscarDniVenta2.setBounds(304, 58, 89, 23);
						panel_1.add(btnBuscarDniVenta2);
					}
					{
						lblGenerarVenta = new JLabel("Generar Venta");
						lblGenerarVenta.setFont(new Font("SansSerif", Font.BOLD, 20));
						lblGenerarVenta.setBounds(21, 11, 186, 35);
						panel_1.add(lblGenerarVenta);
					}
					{
						textField_7 = new JTextField();
						textField_7.setColumns(10);
						textField_7.setBounds(229, 107, 164, 20);
						panel_1.add(textField_7);
					}
					{
						comboBox = new JComboBox();
						comboBox.addActionListener(this);
						comboBox.setBounds(916, 106, 164, 22);
						panel_1.add(comboBox);
					}
					{
						textField_8 = new JTextField();
						textField_8.setColumns(10);
						textField_8.setBounds(229, 153, 164, 20);
						panel_1.add(textField_8);
					}
					{
						comboBox_1 = new JComboBox();
						comboBox_1.addActionListener(this);
						comboBox_1.setBounds(583, 106, 135, 22);
						panel_1.add(comboBox_1);
					}
					{
						lblNombresDelAlumno = new JLabel("NOMBRES DEL ALUMNO:");
						lblNombresDelAlumno.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblNombresDelAlumno.setBounds(21, 97, 222, 35);
						panel_1.add(lblNombresDelAlumno);
					}
					{
						lblPlanAComprar = new JLabel("PLAN A COMPRAR:");
						lblPlanAComprar.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblPlanAComprar.setBounds(748, 97, 186, 35);
						panel_1.add(lblPlanAComprar);
					}
					{
						lblPrecioTotals = new JLabel("PRECIO TOTAL (S/.):");
						lblPrecioTotals.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblPrecioTotals.setBounds(21, 143, 186, 35);
						panel_1.add(lblPrecioTotals);
					}
					{
						lblMtodoDePago = new JLabel("MÉTODO DE PAGO:");
						lblMtodoDePago.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblMtodoDePago.setBounds(420, 97, 186, 35);
						panel_1.add(lblMtodoDePago);
					}
					{
						lblMontoEfectivo = new JLabel("MONTO EFECTIVO:");
						lblMontoEfectivo.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblMontoEfectivo.setBounds(420, 143, 186, 35);
						panel_1.add(lblMontoEfectivo);
					}
					{
						lblMontoDigital = new JLabel("MONTO DIGITAL:");
						lblMontoDigital.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblMontoDigital.setBounds(748, 143, 186, 35);
						panel_1.add(lblMontoDigital);
					}
					{
						textField_10 = new JTextField();
						textField_10.addKeyListener(this);
						textField_10.setColumns(10);
						textField_10.setBounds(583, 153, 135, 20);
						panel_1.add(textField_10);
					}
					{
						textField_11 = new JTextField();
						textField_11.addKeyListener(this);
						textField_11.setColumns(10);
						textField_11.setBounds(916, 153, 164, 20);
						panel_1.add(textField_11);
					}
				}
				{
					scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(24, 99, 1101, 226);
					moduloVentas.add(scrollPane_1);
					scrollPane_1.setBackground(new Color(176, 196, 222));
					{
						tbTablaVentas = new JTable();
						tbTablaVentas.setRowHeight(25);
						tbTablaVentas.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
							},
							new String[] {
								"C\u00D3DIGO VENTA", "FECHA", "DNI ALUMNO", "PLAN", "M\u00C9TODO DE PAGO", "TOTAL PAGADO"
							}
						));
						tbTablaVentas.getColumnModel().getColumn(0).setPreferredWidth(99);
						tbTablaVentas.getColumnModel().getColumn(0).setMinWidth(18);
						tbTablaVentas.getColumnModel().getColumn(1).setPreferredWidth(80);
						tbTablaVentas.getColumnModel().getColumn(2).setPreferredWidth(90);
						tbTablaVentas.getColumnModel().getColumn(3).setPreferredWidth(80);
						tbTablaVentas.getColumnModel().getColumn(4).setPreferredWidth(115);
						tbTablaVentas.getColumnModel().getColumn(5).setPreferredWidth(102);
						scrollPane_1.setViewportView(tbTablaVentas);
					}
				}
				{
					lblNewLabel_8 = new JLabel("Buscar por DNI:");
					lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_8.setBounds(24, 58, 109, 24);
					moduloVentas.add(lblNewLabel_8);
				}
				{
					txtBuscarDniVenta1 = new JTextField();
					txtBuscarDniVenta1.addKeyListener(this);
					txtBuscarDniVenta1.setColumns(10);
					txtBuscarDniVenta1.setBounds(133, 61, 324, 20);
					moduloVentas.add(txtBuscarDniVenta1);
				}
				{
					btnBuscarDniVenta1 = new JButton("BUSCAR");
					btnBuscarDniVenta1.addActionListener(this);
					btnBuscarDniVenta1.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnBuscarDniVenta1.setBounds(471, 59, 89, 23);
					moduloVentas.add(btnBuscarDniVenta1);
				}
				{
					lblPanelDeVentas = new JLabel("Panel de Ventas");
					lblPanelDeVentas.setFont(new Font("SansSerif", Font.BOLD, 20));
					lblPanelDeVentas.setBounds(24, 15, 186, 35);
					moduloVentas.add(lblPanelDeVentas);
				}
				{
					btnProcesarVenta = new JButton("PROCESAR");
					btnProcesarVenta.addActionListener(this);
					btnProcesarVenta.setFont(new Font("Tahoma", Font.BOLD, 14));
					btnProcesarVenta.setBounds(133, 596, 175, 41);
					moduloVentas.add(btnProcesarVenta);
				}
				{
					btnAnularVenta = new JButton("ANULAR");
					btnAnularVenta.addActionListener(this);
					btnAnularVenta.setBounds(369, 596, 175, 41);
					moduloVentas.add(btnAnularVenta);
					btnAnularVenta.setFont(new Font("Tahoma", Font.BOLD, 14));
				}
				{
					btnMostrarTodoVentas = new JButton("MOSTRAR TODO");
					btnMostrarTodoVentas.addActionListener(this);
					btnMostrarTodoVentas.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnMostrarTodoVentas.setBounds(572, 60, 135, 23);
					moduloVentas.add(btnMostrarTodoVentas);
				}
			}
			{
				moduloClases = new JPanel();
				moduloClases.setBackground(new Color(255, 255, 255));
				panelCentral.add(moduloClases, "name_5947779598000");
				moduloClases.setLayout(null);
				{
					panel_4 = new JPanel();
					panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_4.setBounds(49, 71, 300, 244);
					moduloClases.add(panel_4);
					panel_4.setLayout(null);
					{
						lblRegistrarClase = new JLabel("Registrar Clase");
						lblRegistrarClase.setBounds(20, 11, 186, 35);
						panel_4.add(lblRegistrarClase);
						lblRegistrarClase.setFont(new Font("SansSerif", Font.BOLD, 20));
					}
					{
						lblArteMarcial = new JLabel("ARTE MARCIAL:");
						lblArteMarcial.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblArteMarcial.setBounds(20, 57, 222, 35);
						panel_4.add(lblArteMarcial);
					}
					{
						lblProfesor = new JLabel("PROFESOR:");
						lblProfesor.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblProfesor.setBounds(20, 103, 222, 35);
						panel_4.add(lblProfesor);
					}
					{
						lblTurno = new JLabel("TURNO:");
						lblTurno.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblTurno.setBounds(20, 149, 222, 35);
						panel_4.add(lblTurno);
					}
					{
						lblNAlumnos = new JLabel("N.º ALUMNOS:");
						lblNAlumnos.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblNAlumnos.setBounds(20, 196, 120, 35);
						panel_4.add(lblNAlumnos);
					}
					{
						comboBox_arteMarcial = new JComboBox();
						comboBox_arteMarcial.setBounds(158, 65, 120, 22);
						panel_4.add(comboBox_arteMarcial);
					}
					{
						comboBox_profesor = new JComboBox();
						comboBox_profesor.setBounds(158, 111, 120, 22);
						panel_4.add(comboBox_profesor);
					}
					{
						comboBox_turno = new JComboBox();
						comboBox_turno.setBounds(158, 156, 120, 22);
						panel_4.add(comboBox_turno);
					}
					{
						txtNdeAlumnos = new JTextField();
						txtNdeAlumnos.addKeyListener(this);
						txtNdeAlumnos.setBounds(158, 204, 120, 20);
						panel_4.add(txtNdeAlumnos);
						txtNdeAlumnos.setColumns(10);
					}
				}
				{
					panel_5 = new JPanel();
					panel_5.setBackground(SystemColor.info);
					panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panel_5.setBounds(70, 448, 260, 191);
					moduloClases.add(panel_5);
					panel_5.setLayout(null);
					{
						lblCalificacin = new JLabel("Calificación");
						lblCalificacin.setBounds(10, 11, 186, 35);
						lblCalificacin.setFont(new Font("SansSerif", Font.BOLD, 20));
						panel_5.add(lblCalificacin);
					}
					{
						lblEstrella = new JLabel("ESTRELLA:");
						lblEstrella.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblEstrella.setBounds(10, 57, 109, 35);
						panel_5.add(lblEstrella);
					}
					{
						lblNormal = new JLabel("NORMAL:");
						lblNormal.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblNormal.setBounds(10, 103, 109, 35);
						panel_5.add(lblNormal);
					}
					{
						lblBajo = new JLabel("BAJO:");
						lblBajo.setFont(new Font("SansSerif", Font.BOLD, 16));
						lblBajo.setBounds(10, 149, 109, 35);
						panel_5.add(lblBajo);
					}
					{
						lblNewLabel_5 = new JLabel("ALUMNOS ≥ 22");
						lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
						lblNewLabel_5.setBounds(123, 64, 109, 24);
						panel_5.add(lblNewLabel_5);
					}
					{
						lblNewLabel_6 = new JLabel("21 ≥ ALUMNOS ≥ 12");
						lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
						lblNewLabel_6.setBounds(123, 110, 125, 24);
						panel_5.add(lblNewLabel_6);
					}
					{
						lblNewLabel_7 = new JLabel("11 ≥ ALUMNOS");
						lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
						lblNewLabel_7.setBounds(123, 156, 109, 24);
						panel_5.add(lblNewLabel_7);
					}
				}
				{
					btnRegistrarClase = new JButton("REGISTRAR");
					btnRegistrarClase.addActionListener(this);
					btnRegistrarClase.setFont(new Font("Tahoma", Font.BOLD, 14));
					btnRegistrarClase.setBounds(110, 326, 175, 41);
					moduloClases.add(btnRegistrarClase);
				}
				{
					btnModificarClase = new JButton("MODIFICAR");
					btnModificarClase.addActionListener(this);
					btnModificarClase.setFont(new Font("Tahoma", Font.BOLD, 14));
					btnModificarClase.setBounds(110, 378, 175, 41);
					moduloClases.add(btnModificarClase);
				}
				{
					lblNewLabel_9 = new JLabel("Buscar por fecha:");
					lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_9.setBounds(405, 68, 109, 24);
					moduloClases.add(lblNewLabel_9);
				}
				{
					scrollPane_2 = new JScrollPane();
					scrollPane_2.setBounds(405, 146, 723, 456);
					moduloClases.add(scrollPane_2);
					{
						table_2 = new JTable();
						table_2.addMouseListener(this);
						table_2.setRowHeight(27);
						table_2.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
								{null, null, null, null, null, null},
							},
							new String[] {
								"FECHA", "ARTE MARCIAL", "PROFESOR", "TURNO", "N.\u00BA ALUMNOS", "CALIFICACI\u00D3N"
							}
						));
						table_2.getColumnModel().getColumn(1).setPreferredWidth(93);
						table_2.getColumnModel().getColumn(4).setPreferredWidth(89);
						table_2.getColumnModel().getColumn(5).setPreferredWidth(91);
						scrollPane_2.setViewportView(table_2);
					}
				}
				{
					btnMostrarTodoClases = new JButton("MOSTRAR TODO");
					btnMostrarTodoClases.addActionListener(this);
					btnMostrarTodoClases.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnMostrarTodoClases.setBounds(740, 105, 135, 23);
					moduloClases.add(btnMostrarTodoClases);
				}
				{
					lblPanelDeClases = new JLabel("Panel de Clases");
					lblPanelDeClases.setFont(new Font("SansSerif", Font.BOLD, 20));
					lblPanelDeClases.setBounds(49, 25, 186, 35);
					moduloClases.add(lblPanelDeClases);
				}
				{
					lblNewLabel_12 = new JLabel("Buscar por sede:");
					lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_12.setBounds(405, 103, 109, 24);
					moduloClases.add(lblNewLabel_12);
				}
				{
					btnBuscarClase = new JButton("BUSCAR");
					btnBuscarClase.addActionListener(this);
					btnBuscarClase.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnBuscarClase.setBounds(764, 71, 89, 23);
					moduloClases.add(btnBuscarClase);
				}
				{
					comboBox_SedeClase = new JComboBox();
					comboBox_SedeClase.setModel(new DefaultComboBoxModel(new String[] {"Sede Bellavista", "Sede Pilares"}));
					comboBox_SedeClase.setBounds(515, 103, 164, 22);
					moduloClases.add(comboBox_SedeClase);
				}
			}
			{
				moduloReporte = new JPanel();
				moduloReporte.setBackground(new Color(255, 255, 255));
				panelCentral.add(moduloReporte, "name_5947786422200");
				moduloReporte.setLayout(null);
				{
					tabbedPane = new JTabbedPane(JTabbedPane.TOP);
					tabbedPane.setBounds(10, 11, 1132, 636);
					moduloReporte.add(tabbedPane);
					{
						panel_General = new JPanel();
						tabbedPane.addTab("General", null, panel_General, null);
						panel_General.setLayout(null);
						{
							lblPanelDeReportes = new JLabel("Panel de Reportes");
							lblPanelDeReportes.setFont(new Font("SansSerif", Font.BOLD, 20));
							lblPanelDeReportes.setBounds(60, 44, 186, 35);
							panel_General.add(lblPanelDeReportes);
						}
						{
							scrollPane_3 = new JScrollPane();
							scrollPane_3.setBounds(61, 241, 1003, 315);
							panel_General.add(scrollPane_3);
							{
								tbReporteGeneral = new JTable();
								tbReporteGeneral.setRowHeight(25);
								tbReporteGeneral.setModel(new DefaultTableModel(
									new Object[][] {
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
									},
									new String[] {
										"MES", "SEDE", "ASESOR DESTACADO", "PROFESOR DESTACADO", "ARTE MARCIAL POPULAR", "INGRESO TOTAL"
									}
								));
								tbReporteGeneral.getColumnModel().getColumn(2).setPreferredWidth(131);
								tbReporteGeneral.getColumnModel().getColumn(3).setPreferredWidth(143);
								tbReporteGeneral.getColumnModel().getColumn(4).setPreferredWidth(153);
								tbReporteGeneral.getColumnModel().getColumn(5).setPreferredWidth(100);
								scrollPane_3.setViewportView(tbReporteGeneral);
							}
						}
						{
							panel_8 = new JPanel();
							panel_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							panel_8.setLayout(null);
							panel_8.setBackground(SystemColor.info);
							panel_8.setBounds(60, 90, 455, 121);
							panel_General.add(panel_8);
							{
								lblGeneral = new JLabel("GENERAL");
								lblGeneral.setBounds(10, 11, 186, 35);
								panel_8.add(lblGeneral);
								lblGeneral.setFont(new Font("SansSerif", Font.BOLD, 20));
							}
							{
								lblNewLabel_10 = new JLabel("Seleccione Mes:");
								lblNewLabel_10.setBounds(10, 48, 109, 24);
								panel_8.add(lblNewLabel_10);
								lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
							}
							{
								lblNewLabel_11 = new JLabel("Seleccione Sede:");
								lblNewLabel_11.setBounds(10, 83, 109, 24);
								panel_8.add(lblNewLabel_11);
								lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
							}
							{
								comboBox_mesGeneral = new JComboBox();
								comboBox_mesGeneral.setBounds(139, 50, 120, 22);
								panel_8.add(comboBox_mesGeneral);
								comboBox_mesGeneral.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
							}
							{
								comboBox_sedeGeneral = new JComboBox();
								comboBox_sedeGeneral.setModel(new DefaultComboBoxModel(new String[] {"Sede Bellavista", "Sede Pilares"}));
								comboBox_sedeGeneral.setBounds(139, 85, 120, 22);
								panel_8.add(comboBox_sedeGeneral);
							}
							{
								btnFiltrarGENERAL = new JButton("FILTRAR");
								btnFiltrarGENERAL.addActionListener(this);
								btnFiltrarGENERAL.setBounds(337, 50, 89, 23);
								panel_8.add(btnFiltrarGENERAL);
								btnFiltrarGENERAL.setFont(new Font("Tahoma", Font.BOLD, 11));
							}
							{
								btnMostrarTodoGeneral = new JButton("MOSTRAR TODO");
								btnMostrarTodoGeneral.addActionListener(this);
								btnMostrarTodoGeneral.setBounds(322, 85, 123, 23);
								panel_8.add(btnMostrarTodoGeneral);
								btnMostrarTodoGeneral.setFont(new Font("Tahoma", Font.BOLD, 11));
							}
						}
					}
					{
						panel_Asesores = new JPanel();
						tabbedPane.addTab("Asesores", null, panel_Asesores, null);
						panel_Asesores.setLayout(null);
						{
							lblPanelDeReportes_1 = new JLabel("Panel de Reportes");
							lblPanelDeReportes_1.setFont(new Font("SansSerif", Font.BOLD, 20));
							lblPanelDeReportes_1.setBounds(65, 49, 186, 35);
							panel_Asesores.add(lblPanelDeReportes_1);
						}
						{
							scrollPane_4 = new JScrollPane();
							scrollPane_4.setBounds(66, 246, 1003, 315);
							panel_Asesores.add(scrollPane_4);
							{
								tbReporteAsesores = new JTable();
								tbReporteAsesores.setRowHeight(24);
								tbReporteAsesores.setModel(new DefaultTableModel(
									new Object[][] {
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
										{null, null, null, null, null, null},
									},
									new String[] {
										"MES", "SEDE", "ASESOR", "N.\u00BA VENTAS", "INGRESO GENERADO (S/.)", "COMISI\u00D3N"
									}
								));
								tbReporteAsesores.getColumnModel().getColumn(3).setPreferredWidth(78);
								tbReporteAsesores.getColumnModel().getColumn(4).setPreferredWidth(148);
								scrollPane_4.setViewportView(tbReporteAsesores);
							}
						}
						{
							panel_7 = new JPanel();
							panel_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							panel_7.setLayout(null);
							panel_7.setBackground(SystemColor.info);
							panel_7.setBounds(65, 95, 455, 121);
							panel_Asesores.add(panel_7);
							{
								lblNewLabel_16 = new JLabel("Seleccione Mes:");
								lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
								lblNewLabel_16.setBounds(10, 48, 109, 24);
								panel_7.add(lblNewLabel_16);
							}
							{
								lblAsesores = new JLabel("ASESORES");
								lblAsesores.setBounds(10, 11, 186, 35);
								panel_7.add(lblAsesores);
								lblAsesores.setFont(new Font("SansSerif", Font.BOLD, 20));
							}
							{
								comboBox_mesAsesor = new JComboBox();
								comboBox_mesAsesor.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
								comboBox_mesAsesor.setBounds(149, 50, 120, 22);
								panel_7.add(comboBox_mesAsesor);
							}
							{
								lblNewLabel_13 = new JLabel("Seleccione Asesor:");
								lblNewLabel_13.setBounds(10, 83, 109, 24);
								panel_7.add(lblNewLabel_13);
								lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
							}
							{
								comboBox_asesorAsesor = new JComboBox();
								comboBox_asesorAsesor.setModel(new DefaultComboBoxModel(new String[] {"Axel", "Fabio", "Jimena"}));
								comboBox_asesorAsesor.setBounds(149, 85, 120, 22);
								panel_7.add(comboBox_asesorAsesor);
							}
							{
								btnFiltrarASESORES = new JButton("FILTRAR");
								btnFiltrarASESORES.addActionListener(this);
								btnFiltrarASESORES.setBounds(335, 50, 89, 23);
								panel_7.add(btnFiltrarASESORES);
								btnFiltrarASESORES.setFont(new Font("Tahoma", Font.BOLD, 11));
							}
							{
								btnMostrarTodoAsesores = new JButton("MOSTRAR TODO");
								btnMostrarTodoAsesores.addActionListener(this);
								btnMostrarTodoAsesores.setBounds(322, 85, 123, 23);
								panel_7.add(btnMostrarTodoAsesores);
								btnMostrarTodoAsesores.setFont(new Font("Tahoma", Font.BOLD, 11));
							}
						}
					}
					{
						panel_Profesores = new JPanel();
						tabbedPane.addTab("Profesores", null, panel_Profesores, null);
						panel_Profesores.setLayout(null);
						{
							lblPanelDeReportes_2 = new JLabel("Panel de Reportes");
							lblPanelDeReportes_2.setFont(new Font("SansSerif", Font.BOLD, 20));
							lblPanelDeReportes_2.setBounds(62, 43, 186, 35);
							panel_Profesores.add(lblPanelDeReportes_2);
						}
						{
							panel_6 = new JPanel();
							panel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							panel_6.setBackground(SystemColor.info);
							panel_6.setBounds(62, 99, 455, 121);
							panel_Profesores.add(panel_6);
							panel_6.setLayout(null);
							{
								lblProfesores = new JLabel("PROFESORES");
								lblProfesores.setBounds(10, 11, 137, 26);
								panel_6.add(lblProfesores);
								lblProfesores.setFont(new Font("SansSerif", Font.BOLD, 20));
							}
							{
								lblNewLabel_14 = new JLabel("Seleccione Mes:");
								lblNewLabel_14.setBounds(10, 48, 109, 24);
								panel_6.add(lblNewLabel_14);
								lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 13));
							}
							{
								lblNewLabel_15 = new JLabel("Seleccione Profesor:");
								lblNewLabel_15.setBounds(10, 83, 138, 24);
								panel_6.add(lblNewLabel_15);
								lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
							}
							{
								comboBox_mesProfesor = new JComboBox();
								comboBox_mesProfesor.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
								comboBox_mesProfesor.setBounds(149, 50, 120, 22);
								panel_6.add(comboBox_mesProfesor);
							}
							{
								comboBox_profesorReporte = new JComboBox();
								comboBox_profesorReporte.setModel(new DefaultComboBoxModel(new String[] {"Danny Rosales", "Jordan Pacheco", "William Gómez"}));
								comboBox_profesorReporte.setBounds(149, 85, 120, 22);
								panel_6.add(comboBox_profesorReporte);
							}
							{
								btnFiltrarPROFESOR = new JButton("FILTRAR");
								btnFiltrarPROFESOR.addActionListener(this);
								btnFiltrarPROFESOR.setBounds(334, 50, 89, 23);
								panel_6.add(btnFiltrarPROFESOR);
								btnFiltrarPROFESOR.setFont(new Font("Tahoma", Font.BOLD, 11));
							}
							{
								btnMostrarTodoPROFESOR = new JButton("MOSTRAR TODO");
								btnMostrarTodoPROFESOR.addActionListener(this);
								btnMostrarTodoPROFESOR.setBounds(322, 85, 123, 23);
								panel_6.add(btnMostrarTodoPROFESOR);
								btnMostrarTodoPROFESOR.setFont(new Font("Tahoma", Font.BOLD, 11));
							}
						}
						{
							scrollPane_5 = new JScrollPane();
							scrollPane_5.setBounds(62, 250, 1031, 311);
							panel_Profesores.add(scrollPane_5);
							{
								tbReporteProfesores = new JTable();
								tbReporteProfesores.setFillsViewportHeight(true);
								scrollPane_5.setViewportView(tbReporteProfesores);
							}
						}
					}
				}
			}
		}
		{
			panel = new JPanel();
			panel.setBounds(0, 96, 230, 674);
			contentPane.add(panel);
			panel.setBackground(SystemColor.control);
			panel.setLayout(null);
			{
				btnAlumnos = new JButton("ALUMNOS");
				btnAlumnos.addActionListener(this);
				btnAlumnos.setFont(new Font("SansSerif", Font.BOLD, 15));
				btnAlumnos.setBackground(new Color(112, 128, 144));
				btnAlumnos.setBounds(23, 21, 182, 81);
				panel.add(btnAlumnos);
			}
			{
				btnVenta = new JButton("VENTAS");
				btnVenta.addActionListener(this);
				btnVenta.setFont(new Font("SansSerif", Font.BOLD, 15));
				btnVenta.setBackground(new Color(112, 128, 144));
				btnVenta.setBounds(23, 130, 182, 81);
				panel.add(btnVenta);
			}
			{
				btnClases = new JButton("CLASES");
				btnClases.addActionListener(this);
				btnClases.setFont(new Font("SansSerif", Font.BOLD, 15));
				btnClases.setBackground(new Color(112, 128, 144));
				btnClases.setBounds(23, 235, 182, 81);
				panel.add(btnClases);
			}
			{
				btnReporte = new JButton("REPORTE");
				btnReporte.addActionListener(this);
				btnReporte.setFont(new Font("SansSerif", Font.BOLD, 15));
				btnReporte.setBackground(new Color(112, 128, 144));
				btnReporte.setBounds(23, 347, 182, 81);
				panel.add(btnReporte);
			}
			{
				btnCerrarSesión = new JButton("CERRAR SESIÓN");
				btnCerrarSesión.addActionListener(this);
				btnCerrarSesión.setFont(new Font("SansSerif", Font.BOLD, 15));
				btnCerrarSesión.setBackground(new Color(112, 128, 144));
				btnCerrarSesión.setBounds(23, 570, 182, 81);
				panel.add(btnCerrarSesión);
			}
			{
				btnProgramadores = new JButton("PROGRAMADORES");
				btnProgramadores.addActionListener(this);
				btnProgramadores.setFont(new Font("SansSerif", Font.BOLD, 15));
				btnProgramadores.setBackground(new Color(112, 128, 144));
				btnProgramadores.setBounds(23, 460, 182, 81);
				panel.add(btnProgramadores);
			}
		}
		{
			lblNewLabel_1 = new JLabel("TRUE SPORTS");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 60));
			lblNewLabel_1.setBounds(25, 18, 527, 64);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_4 = new JLabel("− Academia de Artes Marciales");
			lblNewLabel_4.setBounds(509, 18, 578, 67);
			contentPane.add(lblNewLabel_4);
			lblNewLabel_4.setForeground(new Color(255, 255, 255));
			lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 35));
		}
    Listar("");
    
 		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Plan - 1 Mes", "Plan - 2 Meses", "Plan - 3 Meses", "Plan - 6 Meses", "Plan - 12 Meses"}));
 		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Efectivo", "Tarjeta", "Yape/Plin", "Mixto"}));
 		{
 			btnSaldarDeuda = new JButton("SALDAR DEUDA");
 			btnSaldarDeuda.addActionListener(this);
 			btnSaldarDeuda.setFont(new Font("Tahoma", Font.BOLD, 14));
 			btnSaldarDeuda.setBounds(610, 596, 175, 41);
 			moduloVentas.add(btnSaldarDeuda);
 		}
 		{
 			btnLimpiarVentas = new JButton("LIMPIAR");
 			btnLimpiarVentas.addActionListener(this);
 			btnLimpiarVentas.setFont(new Font("Tahoma", Font.BOLD, 14));
 			btnLimpiarVentas.setBounds(839, 596, 175, 41);
 			moduloVentas.add(btnLimpiarVentas);
 		}
 			comboBox_arteMarcial.setModel(new DefaultComboBoxModel(new String[] {"Boxeo", "Muay Thai", "MMA", "Lucha Olímpica", "Luta Livre"}));
 			comboBox_profesor.setModel(new DefaultComboBoxModel(new String[] {"Danny", "Jordan", "William", "José", "Marcos", "Juan", "Katty", "Paco", "Diego", "Enzo"}));
 			comboBox_turno.setModel(new DefaultComboBoxModel(new String[] {"Mañana", "Tarde", "Noche"}));
 			{
 				BFecha_Clases = new JDateChooser();
 				BFecha_Clases.setBounds(515, 71, 164, 20);
 				moduloClases.add(BFecha_Clases);
 			}
 			listarVentas("");
 			comboBox_mesGeneral.setModel(new DefaultComboBoxModel(new String[] { "Seleccione...", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
 			comboBox_mesAsesor.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
 			comboBox_asesorAsesor.setModel(new DefaultComboBoxModel(new String[] {"Axel", "Fabio", "Jimena", "Kiara"}));
 			comboBox_mesProfesor.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
 			comboBox_profesorReporte.setModel(new DefaultComboBoxModel(new String[] {"Danny Rosales", "Jordan", "William" , "José" , "Marcos","Juan","Katty","Paco","Diego","Enzo"}));
 			{
 				moduloProgramadores = new JPanel();
 				panelCentral.add(moduloProgramadores, "name_4645653087400");
 				moduloProgramadores.setLayout(null);
 				{
 					panel_9 = new JPanel();
 					panel_9.setBackground(Color.WHITE);
 					panel_9.setBounds(0, 0, 1152, 674);
 					moduloProgramadores.add(panel_9);
 					panel_9.setLayout(null);
 					{
 						lblNewLabel_17 = new JLabel("New label");
 						lblNewLabel_17.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagenes/ashley4.png")));
 						lblNewLabel_17.setBounds(123, 133, 92, 124);
 						panel_9.add(lblNewLabel_17);
 					}
 					{
 						lblNewLabel_18 = new JLabel("New label");
 						lblNewLabel_18.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagenes/gabriel2.png")));
 						lblNewLabel_18.setBounds(585, 137, 92, 116);
 						panel_9.add(lblNewLabel_18);
 					}
 					{
 						lblNewLabel_19 = new JLabel("New label");
 						lblNewLabel_19.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagenes/miguel1.png")));
 						lblNewLabel_19.setBounds(585, 285, 92, 124);
 						panel_9.add(lblNewLabel_19);
 					}
 					{
 						lblNewLabel_20 = new JLabel("New label");
 						lblNewLabel_20.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagenes/selene3.png")));
 						lblNewLabel_20.setBounds(123, 281, 92, 132);
 						panel_9.add(lblNewLabel_20);
 					}
 					{
 						lblNewLabel_21 = new JLabel("PROGRAMADORES");
 						lblNewLabel_21.setFont(new Font("Verdana", Font.BOLD, 40));
 						lblNewLabel_21.setBounds(123, 62, 428, 71);
 						panel_9.add(lblNewLabel_21);
 					}
 					{
 						lblNewLabel_22 = new JLabel("Ashley Carim Pisfil Ballesteros");
 						lblNewLabel_22.setFont(new Font("Verdana", Font.BOLD, 15));
 						lblNewLabel_22.setBounds(239, 154, 367, 26);
 						panel_9.add(lblNewLabel_22);
 					}
 					{
 						lblNewLabel_23 = new JLabel("N00427750@upn.pe");
 						lblNewLabel_23.setFont(new Font("Verdana", Font.PLAIN, 15));
 						lblNewLabel_23.setBounds(239, 191, 367, 26);
 						panel_9.add(lblNewLabel_23);
 					}
 					{
 						lblNewLabel_24 = new JLabel("ashepisfil@gmail.com");
 						lblNewLabel_24.setFont(new Font("Verdana", Font.PLAIN, 15));
 						lblNewLabel_24.setBounds(239, 210, 367, 26);
 						panel_9.add(lblNewLabel_24);
 					}
 					{
 						lblNewLabel_25 = new JLabel("Selene Jacqueline Carrasco Hernández");
 						lblNewLabel_25.setFont(new Font("Verdana", Font.BOLD, 15));
 						lblNewLabel_25.setBounds(239, 316, 367, 26);
 						panel_9.add(lblNewLabel_25);
 					}
 					{
 						lblNewLabel_26 = new JLabel("N00420472@upn.pe");
 						lblNewLabel_26.setFont(new Font("Verdana", Font.PLAIN, 15));
 						lblNewLabel_26.setBounds(239, 348, 367, 26);
 						panel_9.add(lblNewLabel_26);
 					}
 					{
 						lblNewLabel_27 = new JLabel("Selenechern@gmail.com");
 						lblNewLabel_27.setFont(new Font("Verdana", Font.PLAIN, 15));
 						lblNewLabel_27.setBounds(239, 371, 367, 26);
 						panel_9.add(lblNewLabel_27);
 					}
 					{
 						lblNewLabel_28 = new JLabel("Gabriel Enrique Villarreal Samame");
 						lblNewLabel_28.setFont(new Font("Verdana", Font.BOLD, 15));
 						lblNewLabel_28.setBounds(704, 154, 367, 26);
 						panel_9.add(lblNewLabel_28);
 					}
 					{
 						lblNewLabel_29 = new JLabel("N00427750@upn.pe");
 						lblNewLabel_29.setFont(new Font("Verdana", Font.PLAIN, 15));
 						lblNewLabel_29.setBounds(704, 191, 367, 26);
 						panel_9.add(lblNewLabel_29);
 					}
 					{
 						lblNewLabel_30 = new JLabel("ashepisfil@gmail.com");
 						lblNewLabel_30.setFont(new Font("Verdana", Font.PLAIN, 15));
 						lblNewLabel_30.setBounds(704, 210, 367, 26);
 						panel_9.add(lblNewLabel_30);
 					}
 					{
 						lblNewLabel_31 = new JLabel("Miguel Zaid Cruz Moran");
 						lblNewLabel_31.setFont(new Font("Verdana", Font.BOLD, 15));
 						lblNewLabel_31.setBounds(704, 316, 367, 26);
 						panel_9.add(lblNewLabel_31);
 					}
 					{
 						lblNewLabel_32 = new JLabel("N00444459@upn.pe");
 						lblNewLabel_32.setFont(new Font("Verdana", Font.PLAIN, 15));
 						lblNewLabel_32.setBounds(704, 348, 367, 26);
 						panel_9.add(lblNewLabel_32);
 					}
 					{
 						lblNewLabel_33 = new JLabel("miguelzaid2018@gmail.com");
 						lblNewLabel_33.setFont(new Font("Verdana", Font.PLAIN, 15));
 						lblNewLabel_33.setBounds(704, 371, 367, 26);
 						panel_9.add(lblNewLabel_33);
 					}
 					{
 						lblNewLabel_34 = new JLabel("Ashley Samantha Fierro Moscoso");
 						lblNewLabel_34.setFont(new Font("Verdana", Font.BOLD, 15));
 						lblNewLabel_34.setBounds(239, 478, 367, 26);
 						panel_9.add(lblNewLabel_34);
 					}
 					{
 						lblNewLabel_35 = new JLabel("N00415389@upn.pe");
 						lblNewLabel_35.setFont(new Font("Verdana", Font.PLAIN, 15));
 						lblNewLabel_35.setBounds(239, 515, 367, 26);
 						panel_9.add(lblNewLabel_35);
 					}
 					{
 						lblNewLabel_36 = new JLabel("ashleyfierro1@gmail.com");
 						lblNewLabel_36.setFont(new Font("Verdana", Font.PLAIN, 15));
 						lblNewLabel_36.setBounds(239, 539, 367, 26);
 						panel_9.add(lblNewLabel_36);
 					}
 					{
 						lblNewLabel_37 = new JLabel("New label");
 						lblNewLabel_37.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagenes/samantha5.png")));
 						lblNewLabel_37.setBounds(123, 460, 92, 116);
 						panel_9.add(lblNewLabel_37);
 					}
 				}
 			}
 		// =========================================================
 			// --- RESTRICCIONES DE SEGURIDAD SEGÚN EL ROL (NUEVO) ---
 			// =========================================================
 			if (VentanaLogin.idSedeLogueada != 0) { // Si NO es la Jefa
 				
 			    // 1. Bloqueamos el ComboBox de la Sede en el módulo Clases
 			    comboBox_SedeClase.setEnabled(false);
 			    if (VentanaLogin.idSedeLogueada == 1) {
 			        comboBox_SedeClase.setSelectedItem("Sede Bellavista");
 			    } else if (VentanaLogin.idSedeLogueada == 2) {
 			        comboBox_SedeClase.setSelectedItem("Sede Pilares");
 			    }
 			}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProgramadores) {
			do_btnProgramadores_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiarVentas) {
			do_btnLimpiarVentas_actionPerformed(e);
		}
		if (e.getSource() == btnSaldarDeuda) {
			do_btnSaldarDeuda_actionPerformed(e);
		}
		if (e.getSource() == btnBuscarClase) {
			do_btnBuscarClase_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarTodoClases) {
			do_btnMostrarTodoClases_actionPerformed(e);
		}
		if (e.getSource() == btnModificarClase) {
			do_btnModificarClase_actionPerformed(e);
		}
		if (e.getSource() == btnAnularVenta) {
			do_btnAnularVenta_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnFiltrarGENERAL) {
			do_btnFiltrarGENERAL_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarTodoAsesores) {
			do_btnMostrarTodoAsesores_actionPerformed(e);
		}
		if (e.getSource() == btnFiltrarASESORES) {
			do_btnFiltrarASESORES_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarTodoGeneral) {
			do_btnMostrarTodoGeneral_actionPerformed(e);
		}
		if (e.getSource() == comboBox_1) {
			do_comboBox_1_actionPerformed(e);
		}
		if (e.getSource() == comboBox) {
			do_comboBox_actionPerformed(e);
		}
		if (e.getSource() == btnBuscarDniVenta2) {
			do_btnBuscarDniVenta2_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarClase) {
			do_btnRegistrarClase_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarTodoVentas) {
			do_btnMostrarTodoVentas_actionPerformed(e);
		}
		if (e.getSource() == btnProcesarVenta) {
			do_btnProcesarVenta_actionPerformed(e);
		}
		if (e.getSource() == btnBuscarDniVenta1) {
			do_btnBuscarDniVenta1_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarTodoPROFESOR) {
			do_btnMostrarTodoPROFESOR_actionPerformed(e);
		}
		if (e.getSource() == btnFiltrarPROFESOR) {
			do_btnFiltrarPROFESOR_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiar) {
			do_btnLimpiar_actionPerformed(e);
		}
		if (e.getSource() == btnMostrarTodoAlumnos) {
			do_btnMostrarTodoAlumnos_actionPerformed(e);
		}
		if (e.getSource() == btnBuscarDniAlumno) {
			do_btnBuscarDniAlumno_actionPerformed(e);
		}
		if (e.getSource() == btnMatricular) {
			do_btnMatricular_actionPerformed(e);
		}
		if (e.getSource() == btnCerrarSesión) {
			do_btnCerrarSesión_actionPerformed(e);
		}
		if (e.getSource() == btnReporte) {
			do_btnReporte_actionPerformed(e);
		}
		if (e.getSource() == btnClases) {
			do_btnClases_actionPerformed(e);
		}
		if (e.getSource() == btnAlumnos) {
			do_btnAlumnos_actionPerformed(e);
		}
		if (e.getSource() == btnVenta) {
			do_btnVenta_actionPerformed(e);
		}
	}
	
		//--------------------------------------------------------------------------------------------------------
		//Módulo Alumnos------------------------------------------------------------------------------------------
		public void Listar(String nom) {
			
			DefaultTableModel modelo = new DefaultTableModel() {
			    @Override
			    public boolean isCellEditable(int row, int column) {
			        return false; 
			    }
			};
			modelo.addColumn("Código");
			modelo.addColumn("DNI");
			modelo.addColumn("Nombres");
			modelo.addColumn("Apellidos");
			modelo.addColumn("Celular");
			modelo.addColumn("Fecha de nacimiento");
			modelo.addColumn("Estado");

			try {
				java.sql.Connection cn = utils.Conexion.conectar();
				java.sql.CallableStatement csta = cn.prepareCall("{call SP_LISTAR_ALUMNOS_SEDE(?,?)}");
				
				csta.setString(1, nom);
				csta.setInt(2, VentanaLogin.idSedeLogueada); 
				
				java.sql.ResultSet rs = csta.executeQuery();
				while(rs.next()) {
					Object[] fila = {
						rs.getInt(1),     // Código
						rs.getString(2),  // DNI
						rs.getString(3),  // Nombres
						rs.getString(4),  // Apellidos
						rs.getString(5),  // Celular
						rs.getString(6),  // Fecha de nacimiento
						rs.getString(7)   // Estado
					};
					modelo.addRow(fila);
				}
			} catch (Exception e) {
				System.out.println("Error en Listar Alumnos: " + e.getMessage());
			}
			
			tbTabla.setModel(modelo); 
		}

		public void mostrarApoderado(int codigoAlumno, String nombreAlumno) {
			try {
				java.sql.Connection cn = utils.Conexion.conectar();
				
				String sql = "SELECT * FROM apoderados WHERE codigo_alumno = ?"; 
				
				java.sql.PreparedStatement pst = cn.prepareStatement(sql);
				pst.setInt(1, codigoAlumno); // Enviamos el número entero
				java.sql.ResultSet rs = pst.executeQuery();
				
				if (rs.next()) {
					
					String nombresApo = rs.getString("nombres");
					String apellidosApo = rs.getString("apellidos");
					String celularApo = rs.getString("celular");
					String relacion = rs.getString("parentesco"); 
					
				
					String mensaje = "Información del Apoderado de: " + nombreAlumno + "\n"
							       + "--------------------------------------------------\n"
							       + "Nombres: " + nombresApo + " " + apellidosApo + "\n"
							       + "Parentesco: " + relacion + "\n"
							       + "Celular: " + celularApo;
					
					JOptionPane.showMessageDialog(null, mensaje, "Datos del Apoderado", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "El alumno " + nombreAlumno + " no tiene un apoderado registrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
				
			} catch (Exception ex) {
				System.out.println("Error al buscar apoderado: " + ex.getMessage());
			}
		}

		protected void do_btnAlumnos_actionPerformed(ActionEvent e) {
			moduloAlumnos.setVisible(true);
			moduloClases.setVisible(false);
			moduloReporte.setVisible(false);
			moduloVentas.setVisible(false);
		}

		protected void do_btnMostrarTodoAlumnos_actionPerformed(ActionEvent e) {
			Listar("");
		}

		protected void do_btnBuscarDniAlumno_actionPerformed(ActionEvent e) {
			String Dni_Buscar = txtBuscarDniAlumno.getText().trim();
			
			if (Dni_Buscar.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ingrese un DNI para buscar.");
				Listar("");
				return;
			}
			
		
			arreglo.ArregloAlumno acce = new arreglo.ArregloAlumno();
			java.util.ArrayList<clases.Alumno> lista = acce.ConsultarAlumno(Dni_Buscar);
			
		
			if (lista.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Alumno no encontrado. Verifique el DNI.");
				Listar(""); 
			} else {
				Listar(Dni_Buscar); 
			}
			
			txtBuscarDniAlumno.setText("");
		}
		public void LimpiarAlumnos() {
			txtBuscarDniAlumno.setText("");
			txtDniAlumno.setText("");
			txtNombresAlumno.setText("");
			txtApellidosAlumno.setText("");
			txtCelularAlumno.setText("");
			FechaAlumno.setDate(null);
			txtDniApoderado.setText("");
			txtNombresApoderado.setText("");
			txtApellidosApoderado.setText("");
			txtCelularApoderado.setText("");
			txtParentescoApoderado.setText("");
		}

		protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
			LimpiarAlumnos();
		}

		protected void do_btnMatricular_actionPerformed(ActionEvent e) {
			String dni = txtDniAlumno.getText().trim();
			String nombres = txtNombresAlumno.getText().trim();
			String apellidos = txtApellidosAlumno.getText().trim();
			String celular = txtCelularAlumno.getText().trim();

			if (dni.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || FechaAlumno.getDate() == null) {
			    JOptionPane.showMessageDialog(null, "Por favor, completa todos los datos obligatorios del alumno.");
			    return;
			}

			java.util.Date fechaSeleccionada = FechaAlumno.getDate();

			java.time.LocalDate fechaNac = fechaSeleccionada.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
			java.time.LocalDate hoy = java.time.LocalDate.now();
			int edad = java.time.Period.between(fechaNac, hoy).getYears();

			java.text.SimpleDateFormat formatoBD = new java.text.SimpleDateFormat("yyyy-MM-dd");
			String fechaParaMySQL = formatoBD.format(fechaSeleccionada);

			try {
			    clases.Alumno alu = new clases.Alumno(dni, nombres, apellidos, celular, fechaParaMySQL, "Activo");
			    String dniApo = "";
			    String nomApo = "";
			    String apeApo = "";
			    String celApo = "";
			    String parentesco = "";
			    if (edad < 18) {
			        dniApo = txtDniApoderado.getText().trim();
			        nomApo = txtNombresApoderado.getText().trim();
			        apeApo = txtApellidosApoderado.getText().trim();
			        celApo = txtCelularApoderado.getText().trim();
			        parentesco = txtParentescoApoderado.getText().trim();
			        
			        if (dniApo.isEmpty() || nomApo.isEmpty() || apeApo.isEmpty() || parentesco.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "¡Alto! El alumno es menor de edad (" + edad + " años). Es OBLIGATORIO llenar los datos del apoderado.");
			            return; 
			        }
			    }			    
			    arreglo.ArregloAlumno arreglo = new arreglo.ArregloAlumno();
			    boolean exito = arreglo.InsertarAlumno(alu, VentanaLogin.idSedeLogueada);			    
			    if (exito) {
			        if (edad < 18) {
			            arreglo.InsertarApoderado(dni, dniApo, nomApo, apeApo, celApo, parentesco);
			        }			   
			        JOptionPane.showMessageDialog(null, "¡Alumno matriculado correctamente!");			        
			        LimpiarAlumnos();
			        Listar("");			        
			    } else {
			        JOptionPane.showMessageDialog(null, "Error: No se pudo matricular. El DNI ingresado ya existe en el sistema.", "DNI Duplicado", JOptionPane.ERROR_MESSAGE);
			    }			    
			} catch (Exception ex) {
			    JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar: " + ex.getMessage());
			}
		}
		protected void do_btnModificar_actionPerformed(ActionEvent e) {
			// 1. Validar que hayan tocado la tabla
		    if (codigoAlumnoSeleccionado == -1) {
		        JOptionPane.showMessageDialog(null, "Por favor, selecciona un alumno de la tabla primero.");
		        return;
		    }

		    String dni = txtDniAlumno.getText().trim();
		    String nombres = txtNombresAlumno.getText().trim();
		    String apellidos = txtApellidosAlumno.getText().trim();
		    String celular = txtCelularAlumno.getText().trim();

		    // 2. Validamos que no haya campos vacíos
		    if (dni.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || FechaAlumno.getDate() == null) {
		        JOptionPane.showMessageDialog(null, "Por favor, no deje campos obligatorios vacíos.");
		        return;
		    }

		    // 3. Formateamos la fecha del JDateChooser para MySQL
		    java.text.SimpleDateFormat formatoBD = new java.text.SimpleDateFormat("yyyy-MM-dd");
		    String fechaParaMySQL = formatoBD.format(FechaAlumno.getDate());

		    // 4. Enviamos todo a MySQL
		    try {
		        java.sql.Connection cn = utils.Conexion.conectar();
		        java.sql.CallableStatement csta = cn.prepareCall("{call SP_MODIFICAR_ALUMNO(?,?,?,?,?,?)}");
		        
		        csta.setInt(1, codigoAlumnoSeleccionado);
		        csta.setString(2, dni);
		        csta.setString(3, nombres);
		        csta.setString(4, apellidos);
		        csta.setString(5, celular);
		        csta.setString(6, fechaParaMySQL);

		        csta.executeUpdate();

		        JOptionPane.showMessageDialog(null, "¡Datos del alumno modificados con éxito!");
		        
		        // Limpiamos y refrescamos
		        codigoAlumnoSeleccionado = -1; // Reseteamos la selección
		        LimpiarAlumnos();
		        Listar(""); 
		        
		    } catch (Exception ex) {
		        JOptionPane.showMessageDialog(null, "Error al modificar: " + ex.getMessage());
		    }
		}
		protected void do_tbTabla_mouseClicked(MouseEvent e) {
			int fila = tbTabla.getSelectedRow();
			if (fila >= 0) {
				// 1. GUARDAMOS EL CÓDIGO DEL ALUMNO (¡ESTA ES LA LÍNEA NUEVA!)
		        codigoAlumnoSeleccionado = Integer.parseInt(String.valueOf(tbTabla.getValueAt(fila, 0)));
		        
		        // 2. Llenamos los txt (Esto ya lo tenías)
		        txtDniAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 1)));
		        txtNombresAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 2)));
		        txtApellidosAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 3)));
		        txtCelularAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 4)));
		        
		        // 3. Llenamos el JDateChooser (Lo que hicimos en el paso anterior)
		        try {
		            String fechaTabla = String.valueOf(tbTabla.getValueAt(fila, 5));
		            java.util.Date fechaParsed = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(fechaTabla);
		            FechaAlumno.setDate(fechaParsed);
		        } catch (Exception ex) {
		            FechaAlumno.setDate(null);
		        }
				if (e.getClickCount() == 2) {
					
					int codigoAlumno = Integer.parseInt(String.valueOf(tbTabla.getValueAt(fila, 0)));
					String nombreAlumno = String.valueOf(tbTabla.getValueAt(fila, 2));
					
					mostrarApoderado(codigoAlumno, nombreAlumno);
				}
			}
		  }

		//---------------------------------------------------------------------------------------------------------
		//Módulo Clases-------------------------------------------------------------------------------------------
		public void ListarClases(String fecha, int idSedeFiltro) {
		    
			// 1. Creamos las 7 columnas directamente desde el código
			DefaultTableModel modelo = new DefaultTableModel() {
			    @Override
			    public boolean isCellEditable(int row, int column) {
			        return false; 
			    }
			};   
		    modelo.addColumn("ID");             // Columna 0 (Se ocultará)
		    modelo.addColumn("FECHA");          // Columna 1
		    modelo.addColumn("ARTE MARCIAL");   // Columna 2
		    modelo.addColumn("PROFESOR");       // Columna 3
		    modelo.addColumn("TURNO");          // Columna 4
		    modelo.addColumn("N.º ALUMNOS");    // Columna 5
		    modelo.addColumn("CALIFICACIÓN");   // Columna 6
		    
		    try {
		        java.sql.Connection cn = utils.Conexion.conectar();
		        java.sql.CallableStatement csta = cn.prepareCall("{call SP_LISTAR_CLASES(?,?)}");
		        csta.setString(1, fecha);
		        csta.setInt(2, idSedeFiltro); 
		        java.sql.ResultSet rs = csta.executeQuery();
		        
		        while(rs.next()) {
		            Object[] fila = new Object[7]; 
		            // Usamos los nombres exactos de la base de datos
		            fila[0] = rs.getInt("id_clase");           // ID oculto
		            fila[1] = rs.getString("fecha_clase");     // Fecha
		            fila[2] = rs.getString("nombre_disciplina"); // Disciplina
		            fila[3] = rs.getString("nombres");         // Profesor
		            fila[4] = rs.getString("turno");           // Turno (Mañana, Tarde, Noche)
		            fila[5] = rs.getInt("cantidad_alumnos");   // Cantidad
		            fila[6] = rs.getString("calificacion");    // Calificación
		            modelo.addRow(fila); 
		        }
		        
		        // 2. Le asignamos este nuevo modelo a tu tabla visual
		        table_2.setModel(modelo); 
		        
		        // 3. EL TRUCO: Ocultamos la columna 0 (ID) reduciendo su tamaño a 0 píxeles
		        table_2.getColumnModel().getColumn(0).setMaxWidth(0);
		        table_2.getColumnModel().getColumn(0).setMinWidth(0);
		        table_2.getColumnModel().getColumn(0).setPreferredWidth(0);
		        table_2.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
		        table_2.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
		        
		    } catch (Exception e) {
		        JOptionPane.showMessageDialog(null, "Error al cargar tabla: " + e.getMessage());
		    }
		}

		protected void do_btnClases_actionPerformed(ActionEvent e) {
			moduloAlumnos.setVisible(false);
			moduloClases.setVisible(true);
			moduloReporte.setVisible(false);
			moduloVentas.setVisible(false);
		}

		protected void do_btnRegistrarClase_actionPerformed(ActionEvent e) {
			try {
				int idDisciplina = comboBox_arteMarcial.getSelectedIndex() + 1; 
				int idProfesor = comboBox_profesor.getSelectedIndex() + 1;
				String turno = comboBox_turno.getSelectedItem().toString();
				int numAlumnos = Integer.parseInt(txtNdeAlumnos.getText().trim());
				
				// Lógica de calificación automática
				String calificacion = "";
				if (numAlumnos >= 22) calificacion = "Estrella";
				else if (numAlumnos >= 12) calificacion = "Normal";
				else calificacion = "Bajo";

				arreglo.ArregloClases arrClase = new arreglo.ArregloClases();
				arrClase.InsertarClase(turno, numAlumnos, calificacion, idProfesor, idDisciplina, VentanaLogin.idSedeLogueada);


	            JOptionPane.showMessageDialog(null, "¡Clase registrada con calificación: " + calificacion + "!");
	            txtNdeAlumnos.setText(""); 
	            
	           
	            ListarClases("",VentanaLogin.idSedeLogueada); 
	            
	        } catch(Exception exe) {
	        	JOptionPane.showMessageDialog(null,exe);
	            JOptionPane.showMessageDialog(null, "Error: Ingrese una cantidad válida de alumnos (solo números enteros).");
	        }
		}
		protected void do_table_2_mouseClicked(MouseEvent e) {
			int fila = table_2.getSelectedRow();
		    if (fila >= 0) {
		        // Guardamos el ID en la variable global
		        idClaseSeleccionada = Integer.parseInt(table_2.getValueAt(fila, 0).toString());
		        
		        // Llenamos los campos del formulario
		        comboBox_arteMarcial.setSelectedItem(table_2.getValueAt(fila, 2).toString());
		        comboBox_profesor.setSelectedItem(table_2.getValueAt(fila, 3).toString());
		        comboBox_turno.setSelectedItem(table_2.getValueAt(fila, 4).toString());
		        txtNdeAlumnos.setText(table_2.getValueAt(fila, 5).toString());
		    }
		}
		protected void do_btnModificarClase_actionPerformed(ActionEvent e) {
			// 1. Validar que hayan tocado la tabla
		    if (idClaseSeleccionada == -1) {
		        JOptionPane.showMessageDialog(null, "Por favor, selecciona una clase de la tabla primero.");
		        return;
		    }

		    try {
		        int idDisciplina = comboBox_arteMarcial.getSelectedIndex() + 1; 
		        int idProfesor = comboBox_profesor.getSelectedIndex() + 1;
		        String turno = comboBox_turno.getSelectedItem().toString();
		        int numAlumnos = Integer.parseInt(txtNdeAlumnos.getText().trim());
		        
		        // Lógica de calificación automática
		        String calificacion = "";
		        if (numAlumnos >= 22) calificacion = "Estrella";
		        else if (numAlumnos >= 12) calificacion = "Normal";
		        else calificacion = "Bajo";

		        // Conexión y envío al SP_MODIFICAR
		        arreglo.ArregloClases arrClase = new arreglo.ArregloClases();
		        arrClase.ModificarClase(idClaseSeleccionada, turno, numAlumnos, calificacion, idProfesor, idDisciplina);

		        JOptionPane.showMessageDialog(null, "¡Clase modificada con éxito!");
		        
		        // Limpiamos todo
		        txtNdeAlumnos.setText(""); 
		        idClaseSeleccionada = -1; // Reseteamos la selección
		        
		        // Refrescamos la tabla (asegúrate de llamar al método de buscar que uses por defecto)
		        ListarClases("", VentanaLogin.idSedeLogueada); 
		        
		    } catch(Exception exe) {
		        JOptionPane.showMessageDialog(null, "Error: Revisa los campos ingresados.");
		    }
		}
		protected void do_btnMostrarTodoClases_actionPerformed(ActionEvent e) {
            if(VentanaLogin.idSedeLogueada == 0){
			ListarClases("",0); 
            }
            else ListarClases("",VentanaLogin.idSedeLogueada);
		}
		protected void do_btnBuscarClase_actionPerformed(ActionEvent e) {
			// 1. Leemos la fecha (Si el JDateChooser está vacío, mandamos "")
		    String fechaParaBuscar = "";
		    if (BFecha_Clases.getDate() != null) {
		        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		        fechaParaBuscar = sdf.format(BFecha_Clases.getDate());
		    }

		    // 2. Determinamos qué sede buscar (por defecto, la sede del usuario logueado)
		    int sedeParaBuscar = VentanaLogin.idSedeLogueada;

		    // 3. ¡El permiso especial de la Jefa!
		    // Si la Jefa está usando el sistema (sede 0), leemos qué escogió en el ComboBox
		    if (VentanaLogin.idSedeLogueada == 0) {
		        // *Ojo: Cambia "comboBox_sedeBusqueda" por el nombre real de tu ComboBox
		        String seleccionSede = comboBox_SedeClase.getSelectedItem().toString();
		        
		        if (seleccionSede.contains("Sede Bellavista")) {
		            sedeParaBuscar = 1;
		        } else if (seleccionSede.contains("Sede Pilares")) {
		            sedeParaBuscar = 2;
		        } else {
		            sedeParaBuscar = 0; 
		        }
		    }
		    // 4. Llamamos al método actualizado enviando ambos datos
		    ListarClases(fechaParaBuscar, sedeParaBuscar);
		}

		//--------------------------------------------------------------------------------------------------------
		//Módulo Ventas-------------------------------------------------------------------------------------------
		
		public void listarVentas(String dniBuscar) {
			DefaultTableModel modelo = new DefaultTableModel() {
			    @Override
			    public boolean isCellEditable(int row, int column) {
			        return false; 
			    }
			};
		    modelo.addColumn("CÓDIGO");
		    modelo.addColumn("FECHA");
		    modelo.addColumn("DNI ALUMNO");
		    modelo.addColumn("PLAN");
		    modelo.addColumn("MÉTODO");
		    modelo.addColumn("TOTAL PLAN");
		    modelo.addColumn("SALDO PEND."); 
		    modelo.addColumn("VENCIMIENTO"); 
		    modelo.addColumn("ESTADO");      

		    try {
		        java.sql.Connection cn = utils.Conexion.conectar();
		        java.sql.CallableStatement csta = cn.prepareCall("{call SP_LISTAR_VENTAS_SEDE(?,?)}");
		        csta.setString(1, dniBuscar);
		        csta.setInt(2, VentanaLogin.idSedeLogueada); 
		        
		        java.sql.ResultSet rs = csta.executeQuery();
		        while(rs.next()) {
		            String fechaVenc = rs.getString(8); // Lee la fecha de vencimiento
		            if(fechaVenc == null) fechaVenc = "-"; // Si está pagado (no hay fecha), pone un guión
		            
		            Object[] fila = {
		                rs.getInt(1),     
		                rs.getString(2),  
		                rs.getString(3),  
		                rs.getString(4),  
		                rs.getString(5),  
		                "S/. " + rs.getDouble(6),
		                "S/. " + rs.getDouble(7), // Saldo Pendiente
		                fechaVenc,                // Fecha Vencimiento
		                rs.getString(9)           // Estado
		            };
		            modelo.addRow(fila);
		        }
		    } catch (Exception e) {
		        System.out.println("Error en Listar Ventas: " + e.getMessage());
		    }
		    tbTablaVentas.setModel(modelo); 
		}

		protected void do_btnVenta_actionPerformed(ActionEvent e) {
			moduloAlumnos.setVisible(false);
			moduloClases.setVisible(false);
			moduloReporte.setVisible(false);
			moduloVentas.setVisible(true);
		}

		protected void do_btnBuscarDniVenta1_actionPerformed(ActionEvent e) {
		    String dni = txtBuscarDniVenta1.getText().trim();
		    		   
		    if (dni.isEmpty()) {
		        JOptionPane.showMessageDialog(null, "Ingrese un DNI para buscar en la tabla.");
		        listarVentas(""); 
		        return;
		    }
		    
		    listarVentas(dni);
		}

		protected void do_btnBuscarDniVenta2_actionPerformed(ActionEvent e) {
			String dni = txtBuscarDniVenta2.getText().trim();
			if (dni.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ingrese un DNI para buscar.");
				return;
			}
			
			arreglo.ArregloAlumno arrAlumno = new arreglo.ArregloAlumno();
			java.util.ArrayList<clases.Alumno> lista = arrAlumno.ConsultarAlumno(dni);
			
			if (lista.size() > 0) {
				
				textField_7.setText(lista.get(0).getNom() + " " + lista.get(0).getApellidos());
			} else {
		
				JOptionPane.showMessageDialog(null, "Alumno no encontrado. Debe matricularlo en el módulo de Alumnos primero.");
				textField_7.setText("");
			}
		}

		protected void do_btnProcesarVenta_actionPerformed(ActionEvent e) {

			    String dni = txtBuscarDniVenta2.getText().trim();
			    if (dni.isEmpty() || textField_7.getText().isEmpty()) {
			        JOptionPane.showMessageDialog(null, "Primero busque y seleccione un alumno válido.");
			        return;
			    }

			    try {
			        int idPlan = comboBox.getSelectedIndex() + 1; 
			        String metodoPago = comboBox_1.getSelectedItem().toString();
			        
			        double total = textField_8.getText().isEmpty() ? 0.0 : Double.parseDouble(textField_8.getText());
			        if (total <= 0) {
			            JOptionPane.showMessageDialog(null, "Seleccione un plan válido.");
			            return;
			        }

			        double efectivo = 0.0;
			        double digital = 0.0;

			        if (metodoPago.equals("Mixto")) {
			            efectivo = textField_10.getText().isEmpty() ? 0.0 : Double.parseDouble(textField_10.getText());
			            digital = textField_11.getText().isEmpty() ? 0.0 : Double.parseDouble(textField_11.getText());
			        } else if (metodoPago.equals("Efectivo")) {
			            efectivo = textField_10.getText().isEmpty() ? 0.0 : Double.parseDouble(textField_10.getText());
			        } else { 
			            digital = textField_11.getText().isEmpty() ? 0.0 : Double.parseDouble(textField_11.getText());
			        }

			        double sumaPagada = efectivo + digital;
			        double saldoPendiente = 0.0;
			        String fechaVencimiento = null;
			        String estado = "Cancelado";

			        // LÓGICA 1: Si falta dinero (Generar Deuda)
			        if (sumaPagada < total) {
			            saldoPendiente = total - sumaPagada;
			            int respuesta = JOptionPane.showConfirmDialog(null, 
			                "Falta S/ " + String.format(java.util.Locale.US, "%.2f", saldoPendiente) + "para completar el pago. ¿Desea generar un saldo pendiente?", 
			                "Aviso de Saldo", JOptionPane.YES_NO_OPTION);
			            
			            if (respuesta == JOptionPane.YES_OPTION) {
			                
			                // --- INICIO DEL CÓDIGO JCALENDAR ---
			                com.toedter.calendar.JDateChooser dateChooser = new com.toedter.calendar.JDateChooser();
			                dateChooser.setDateFormatString("yyyy-MM-dd"); // Formato exacto para MySQL
			                
			                Object[] mensaje = {
			                    "Seleccione la fecha límite de pago en el calendario:", 
			                    dateChooser
			                };
			                
			                int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Fecha de Vencimiento", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			                
			                if (opcion == JOptionPane.OK_OPTION && dateChooser.getDate() != null) {
			                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
			                    fechaVencimiento = sdf.format(dateChooser.getDate());
			                    estado = "Pendiente";
			                } else {
			                    JOptionPane.showMessageDialog(null, "Operación cancelada. Debe seleccionar una fecha.");
			                    return;
			                }
			                // --- FIN DEL CÓDIGO JCALENDAR ---
			                
			            } else {
			                return; // Si dice que NO, se cancela el proceso para que siga editando las cajitas
			            }
			        } 
			        // LÓGICA 2: Si sobra dinero (Dar Vuelto)
			        else if (sumaPagada > total) {
			            double vuelto = sumaPagada - total;
			            JOptionPane.showMessageDialog(null, "Pago exitoso. Entregar vuelto de: S/ " + String.format(java.util.Locale.US, "%.2f", vuelto));
			            
			            // Ajustamos lo que se guarda en la BD para que cuadre exacto con el plan
			            if (metodoPago.equals("Efectivo") || metodoPago.equals("Mixto")) {
			                efectivo = efectivo - vuelto; 
			            }
			        }

			        
			     // Creamos el objeto empaquetado
			        clases.Venta nuevaVenta = new clases.Venta(dni, idPlan, metodoPago, efectivo, digital, total, saldoPendiente, fechaVencimiento, estado, VentanaLogin.idSedeLogueada, VentanaLogin.idUsuarioLogueado);

			        // Se lo mandamos al arreglo
			        arreglo.ArregloVenta arrVenta = new arreglo.ArregloVenta();
			        arrVenta.InsertarVenta(nuevaVenta);
			        
			        // Limpiar cajas
			        txtBuscarDniVenta2.setText("");
			        textField_7.setText("");
			        textField_8.setText("");
			        textField_10.setText("");
			        textField_11.setText("");
			        comboBox.setSelectedIndex(0);
			        comboBox_1.setSelectedIndex(0);
			        
			        listarVentas("");
			        
			    } catch (Exception ex) {
			        JOptionPane.showMessageDialog(null, "Error: Revise los montos ingresados.");
			    }
			}



		protected void do_btnMostrarTodoVentas_actionPerformed(ActionEvent e) {
			listarVentas(""); 
		    txtBuscarDniVenta1.setText(""); 
		}

		protected void do_comboBox_actionPerformed(ActionEvent e) {
			int index = comboBox.getSelectedIndex();
			double precio = 0.0;
			
			
			switch(index) {
				case 0: precio = 209.90; break; // Plan - 1 Mes
				case 1: precio = 259.90; break; // Plan - 2 Meses
				case 2: precio = 329.90; break; // Plan - 3 Meses
				case 3: precio = 499.90; break; // Plan - 6 Meses
				case 4: precio = 839.90; break; // Plan - 12 Meses
			}
			
			textField_8.setText(String.valueOf(precio)); 
			textField_8.setEditable(false); 
			textField_10.setText("");
			textField_11.setText("");
		}

		protected void do_comboBox_1_actionPerformed(ActionEvent e) {
		    String metodo = comboBox_1.getSelectedItem().toString();
		    
		    if (metodo.equals("Mixto")) {
		        textField_10.setEditable(true);
		        textField_11.setEditable(true); 
		        textField_10.setText("");
		        textField_11.setText("");
		        textField_10.requestFocus(); 
		        
		    } else if (metodo.equals("Efectivo")) {
		        textField_10.setEditable(true);
		        textField_11.setEditable(false);
		        textField_10.setText("");
		        textField_11.setText("");
		        textField_10.requestFocus();
		        
		    } else {
		        textField_10.setEditable(false);
		        textField_11.setEditable(true);
		        textField_10.setText("");
		        textField_11.setText("");
		        textField_11.requestFocus();
		    }
		}

		protected void do_textField_10_keyReleased(KeyEvent e) {
			if (comboBox_1.getSelectedItem().toString().equals("Mixto")) {
				try {
					double total = Double.parseDouble(textField_8.getText());
					String textoEfectivo = textField_10.getText().trim();
					
					if (textoEfectivo.isEmpty()) {
						textField_11.setText("");
						return;
					}
					
					double efectivo = Double.parseDouble(textoEfectivo);
					
					if (efectivo > total) {
						textField_11.setText("¡Se pasó!"); 
					} else {
						double digital = total - efectivo;
					
						textField_11.setText(String.format(java.util.Locale.US, "%.2f", digital));
					}
				} catch (Exception ex) {
					textField_11.setText("");
				}
			}
		}

		//--------------------------------------------------------------------------------------------------------
		//Módulo Reporte------------------------------------------------------------------------------------------
		public void ListarProfesores(String mesFiltro, String profesorFiltro) {
			DefaultTableModel modelo = new DefaultTableModel() {
			    @Override
			    public boolean isCellEditable(int row, int column) {
			        return false; 
			    }
			};
			ArregloProfesor acce = new ArregloProfesor();
			
			ArrayList<ReporteProfesor> lista = acce.ListarTodosProfesores();
			
			modelo.addColumn("MES");
			modelo.addColumn("SEDE");
			modelo.addColumn("PROFESOR");
			modelo.addColumn("DISCIPLINA");
			modelo.addColumn("N.º CLASES DICTADAS");
			modelo.addColumn("CALIFICACIÓN PROMEDIO");
			
			Iterator it = lista.iterator();
			int i = 0;
			while(it.hasNext()) {
				ReporteProfesor acceso = (ReporteProfesor) it.next();
			
				boolean pasaFiltroSede = false;
				if (VentanaLogin.idSedeLogueada == 0) {
					pasaFiltroSede = true; 
				} else {
					String sededelReporte = String.valueOf(acceso.getSede()).toLowerCase();
					if (VentanaLogin.idSedeLogueada == 1 && (sededelReporte.equals("1") || sededelReporte.contains("bellavista"))) {
						pasaFiltroSede = true;
					} else if (VentanaLogin.idSedeLogueada == 2 && (sededelReporte.equals("2") || sededelReporte.contains("pilares"))) {
						pasaFiltroSede = true;
					}
				}
				
				boolean pasaFiltroCombo = true;
				String mesBD = acceso.getMes();
				String profBD = acceso.getProfesor();
				
				if (!mesFiltro.contains("Seleccione") && !mesFiltro.equals("") && !mesBD.equalsIgnoreCase(mesFiltro)) {
					pasaFiltroCombo = false;
				}
				if (!profesorFiltro.contains("Seleccione") && !profesorFiltro.equals("") && !profBD.equalsIgnoreCase(profesorFiltro)) {
					pasaFiltroCombo = false;
				}
		
				if (pasaFiltroSede && pasaFiltroCombo) {
					modelo.setRowCount(modelo.getRowCount() + 1); 
					modelo.setValueAt(acceso.getMes(), i, 0);
					modelo.setValueAt(acceso.getSede(), i, 1);
					modelo.setValueAt(acceso.getProfesor(), i, 2);
					modelo.setValueAt(acceso.getDisciplina(), i, 3);
					modelo.setValueAt(acceso.getnClasesDictadas(), i, 4);
					modelo.setValueAt(acceso.getCalificacionPromedio(), i, 5);
					i++;
				}
			}
			tbReporteProfesores.setModel(modelo);
		}

		public void ListarReporteAsesores(String mesFiltro, String asesorFiltro) {
			DefaultTableModel modelo = new DefaultTableModel() {
			    @Override
			    public boolean isCellEditable(int row, int column) {
			        return false; 
			    }
			};
			modelo.addColumn("MES");
			modelo.addColumn("SEDE");
			modelo.addColumn("ASESOR");
			modelo.addColumn("N.º VENTAS");
			modelo.addColumn("INGRESO GENERADO (S/.)");
			modelo.addColumn("COMISIÓN");

			try {
				java.sql.Connection cn = utils.Conexion.conectar();
				java.sql.CallableStatement csta = cn.prepareCall("{call SP_REPORTE_ASESORES(?)}");
				csta.setInt(1, VentanaLogin.idSedeLogueada); 
				
				java.sql.ResultSet rs = csta.executeQuery();
				while(rs.next()) {
					String mesBD = rs.getString("MES");
					String asesorBD = rs.getString("ASESOR");
					
					boolean pasaFiltro = true;
					
					if (!mesFiltro.contains("Seleccione") && !mesFiltro.equals("") && !mesBD.equalsIgnoreCase(mesFiltro)) {
						pasaFiltro = false;
					}
					if (!asesorFiltro.contains("Seleccione") && !asesorFiltro.equals("") && !asesorBD.equalsIgnoreCase(asesorFiltro)) {
						pasaFiltro = false;
					}
					
					if (pasaFiltro) {
						Object[] fila = {
							mesBD,
							rs.getString("SEDE"),
							asesorBD,
							rs.getInt("N_VENTAS"),
							"S/. " + rs.getDouble("INGRESO_GENERADO"),
							"S/. " + rs.getDouble("COMISION")
						};
						modelo.addRow(fila);
					}
				}
			} catch (Exception e) {
				System.out.println("Error en Reporte Asesores: " + e.getMessage());
			}
			
			tbReporteAsesores.setModel(modelo); 
		}

		public void ListarReporteGeneral(String mesFiltro, String sedeFiltro) {
			DefaultTableModel modelo = new DefaultTableModel() {
			    @Override
			    public boolean isCellEditable(int row, int column) {
			        return false; 
			    }
			};
			modelo.addColumn("MES");
			modelo.addColumn("SEDE");
			modelo.addColumn("ASESOR DESTACADO");
			modelo.addColumn("PROFESOR DESTACADO");
			modelo.addColumn("ARTE MARCIAL POPULAR");
			modelo.addColumn("INGRESO TOTAL");

			try {
				java.sql.Connection cn = utils.Conexion.conectar();
				java.sql.CallableStatement csta = cn.prepareCall("{call SP_REPORTE_GENERAL(?)}");
				csta.setInt(1, VentanaLogin.idSedeLogueada); 
				java.sql.ResultSet rs = csta.executeQuery();
				while(rs.next()) {
					String mesBD = rs.getString("MES");
					String sedeBD = rs.getString("SEDE");
					boolean pasaFiltro = true;
					
					if (!mesFiltro.contains("Seleccione") && !mesFiltro.equals("") && !mesBD.equalsIgnoreCase(mesFiltro)) {
						pasaFiltro = false;
					}
					if (!sedeFiltro.contains("Seleccione") && !sedeFiltro.equals("") && !sedeBD.equalsIgnoreCase(sedeFiltro)) {
						pasaFiltro = false;
					}
					if (pasaFiltro) {
						Object[] fila = {
							mesBD,
							sedeBD,
							rs.getString("ASESOR_DESTACADO"),
							rs.getString("PROFESOR_DESTACADO"),
							rs.getString("ARTE_MARCIAL_POPULAR"),
							"S/. " + rs.getDouble("INGRESO_TOTAL")
						};
						modelo.addRow(fila);
					}
				}
			} catch (Exception e) {
				System.out.println("Error en Reporte General: " + e.getMessage());
			}
			
			tbReporteGeneral.setModel(modelo); 
		}

		protected void do_btnReporte_actionPerformed(ActionEvent e) {
			if (VentanaLogin.idSedeLogueada != 0) {
		        JOptionPane.showMessageDialog(null, 
		            "¡Acceso denegado! Solo la Jefa de la academia tiene permisos para visualizar los reportes financieros.", 
		            "Permisos insuficientes", 
		            JOptionPane.WARNING_MESSAGE);		       
		    }
			else {
			moduloAlumnos.setVisible(false);
			moduloClases.setVisible(false);
			moduloReporte.setVisible(true);
			moduloVentas.setVisible(false);
			ListarProfesores("", "");
			ListarReporteAsesores("", "");
			ListarReporteGeneral("", "");
			}
		}

		protected void do_btnFiltrarPROFESOR_actionPerformed(ActionEvent e) {
			String mesSeleccionado = comboBox_mesProfesor.getSelectedItem().toString();
			String profesorSeleccionado = comboBox_profesorReporte.getSelectedItem().toString();
			ListarProfesores(mesSeleccionado, profesorSeleccionado);
		}

		protected void do_btnMostrarTodoPROFESOR_actionPerformed(ActionEvent e) {
			ListarProfesores("", "");
			comboBox_mesProfesor.setSelectedIndex(0);
			comboBox_profesorReporte.setSelectedIndex(0);
		}

		protected void do_btnFiltrarASESORES_actionPerformed(ActionEvent e) {
			String mes = comboBox_mesAsesor.getSelectedItem().toString();
			String asesor = comboBox_asesorAsesor.getSelectedItem().toString();
			ListarReporteAsesores(mes, asesor);
		}

		protected void do_btnMostrarTodoAsesores_actionPerformed(ActionEvent e) {
			ListarReporteAsesores("", "");
			comboBox_mesAsesor.setSelectedIndex(0);
			comboBox_asesorAsesor.setSelectedIndex(0);
		}

		protected void do_btnFiltrarGENERAL_actionPerformed(ActionEvent e) {
			String mes = comboBox_mesGeneral.getSelectedItem().toString();
			String sede = comboBox_sedeGeneral.getSelectedItem().toString();
			ListarReporteGeneral(mes, sede);
		}

		protected void do_btnMostrarTodoGeneral_actionPerformed(ActionEvent e) {
			ListarReporteGeneral("", "");
			comboBox_mesGeneral.setSelectedIndex(0);
			comboBox_sedeGeneral.setSelectedIndex(0);
		}

		//---------------------------------------------------------------------------------------------------------
		//Eventos Generales y Listeners----------------------------------------------------------------------------
		protected void do_btnCerrarSesión_actionPerformed(ActionEvent e) {
			VentanaLogin login = new VentanaLogin();
			login.setVisible(true);
			this.dispose();
		}

		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == table_2) {
				do_table_2_mouseClicked(e);
			}
			if (e.getSource() == tbTabla) {
				do_tbTabla_mouseClicked(e);
			}
		}
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
		public void keyPressed(KeyEvent e) {
		}
		public void keyReleased(KeyEvent e) {
			if (e.getSource() == textField_10) {
				do_textField_10_keyReleased(e);
			}
		}
		public void keyTyped(KeyEvent e) {
			if (e.getSource() == txtNdeAlumnos) {
				do_txtNdeAlumnos_keyTyped(e);
			}
			if (e.getSource() == textField_11) {
				do_textField_11_keyTyped(e);
			}
			if (e.getSource() == txtBuscarDniVenta2) {
				do_txtBuscarDniVenta2_keyTyped(e);
			}
			if (e.getSource() == txtBuscarDniVenta1) {
				do_txtBuscarDniVenta1_keyTyped(e);
			}
			if (e.getSource() == txtParentescoApoderado) {
				do_txtParentescoApoderado_keyTyped(e);
			}
			if (e.getSource() == txtBuscarDniAlumno) {
				do_txtBuscarDniAlumno_keyTyped(e);
			}
			if (e.getSource() == txtCelularApoderado) {
				do_txtCelularApoderado_keyTyped(e);
			}
			if (e.getSource() == txtApellidosApoderado) {
				do_txtApellidosApoderado_keyTyped(e);
			}
			if (e.getSource() == txtNombresApoderado) {
				do_txtNombresApoderado_keyTyped(e);
			}
			if (e.getSource() == txtDniApoderado) {
				do_txtDniApoderado_keyTyped(e);
			}
			if (e.getSource() == txtCelularAlumno) {
				do_txtCelularAlumno_keyTyped(e);
			}
			if (e.getSource() == txtDniAlumno) {
				do_txtDniAlumno_keyTyped(e);
			}
			if (e.getSource() == txtApellidosAlumno) {
				do_txtApellidosAlumno_keyTyped(e);
			}
			if (e.getSource() == txtNombresAlumno) {
				do_txtNombresAlumno_keyTyped(e);
			}
			
		}

	protected void do_btnAnularVenta_actionPerformed(ActionEvent e) {
	    int fila = tbTablaVentas.getSelectedRow();    
	    if (fila == -1) {
	        JOptionPane.showMessageDialog(null, "Primero debe seleccionar la venta que desea anular de la tabla.");
	        return;
	    }
	    
	    String estadoActual = tbTablaVentas.getValueAt(fila, 8).toString();
	    if (estadoActual.equals("Anulado")) {
	        JOptionPane.showMessageDialog(null, "Esta venta ya se encuentra anulada en el sistema.");
	        return;
	    }
	    
	    int primeraConfirmacion = JOptionPane.showConfirmDialog(null, 
	            "¿Está completamente seguro de que desea ANULAR esta venta?\nEsta acción dejará los montos de la transacción en S/. 0.00.", 
	            "Confirmación de Anulación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);	
	    
	    if (primeraConfirmacion == JOptionPane.YES_OPTION) {
	        int segundaConfirmacion = JOptionPane.showConfirmDialog(null, 
	                "¡ALTO! Al confirmar, la venta cambiará permanentemente a estado 'Anulado'.\n¿Desea proceder?", 
	                "Última Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
	        
	        if (segundaConfirmacion == JOptionPane.YES_OPTION) {
	            int codigoVenta = Integer.parseInt(tbTablaVentas.getValueAt(fila, 0).toString());
	            arreglo.ArregloVenta arrVenta = new arreglo.ArregloVenta();
	            arrVenta.AnularVenta(codigoVenta);	            
	            JOptionPane.showMessageDialog(null, "¡La venta ha sido anulada exitosamente!\nPor favor, proceda a generar la nueva transacción corregida si es necesario.");	          
	            listarVentas(""); 
	        }
	    }
	}
	
	
	protected void do_btnSaldarDeuda_actionPerformed(ActionEvent e) {
	    int fila = tbTablaVentas.getSelectedRow();
	    if (fila == -1) {
	        JOptionPane.showMessageDialog(null, "Primero seleccione una venta de la tabla.");
	        return;
	    }
	    String estado = tbTablaVentas.getValueAt(fila, 8).toString();	    
	    if (estado.equals("Cancelado")) {
	        JOptionPane.showMessageDialog(null, "Esta venta ya se encuentra pagada en su totalidad.");
	        return;
	    }	    
	    String saldoStr = tbTablaVentas.getValueAt(fila, 6).toString().replace("S/. ", "");
	    double saldo = Double.parseDouble(saldoStr);	    
	    String[] opciones = {"Efectivo", "Digital (Yape/Tarjeta)", "Mixto"};
	    int seleccion = JOptionPane.showOptionDialog(null, 
	            "El alumno debe saldar: S/. " + saldo + "\n¿Con qué método está pagando esta deuda?", 
	            "Saldar Deuda", 
	            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);	           
	    double pagoEfectivo = 0.0;
	    double pagoDigital = 0.0;	    
	    if (seleccion == 0) {
	        pagoEfectivo = saldo; 
	    } else if (seleccion == 1) {
	        pagoDigital = saldo;
	    } else if (seleccion == 2) {	 
	        String montoEf = JOptionPane.showInputDialog("Ingrese el monto que está entregando en EFECTIVO:");
	        if (montoEf == null || montoEf.trim().isEmpty()) return; 	        
	        try {
	            pagoEfectivo = Double.parseDouble(montoEf);
	            pagoDigital = saldo - pagoEfectivo;
	            
	            if (pagoDigital < 0) {
	                 JOptionPane.showMessageDialog(null, "Error: El monto en efectivo ingresado supera la deuda.");
	                 return;
	            }
	            JOptionPane.showMessageDialog(null, "El monto digital restante a cobrar es: S/. " + String.format(java.util.Locale.US, "%.2f", pagoDigital));
	        } catch (Exception ex) {
	            JOptionPane.showMessageDialog(null, "Monto inválido.");
	            return;
	        }
	    } else {
	        return; 
	    }
	    int codigoVenta = Integer.parseInt(tbTablaVentas.getValueAt(fila, 0).toString());
	    arreglo.ArregloVenta arrVenta = new arreglo.ArregloVenta();
	    arrVenta.SaldarDeuda(codigoVenta, pagoEfectivo, pagoDigital);	    
	    JOptionPane.showMessageDialog(null, "¡Deuda saldada e ingresos actualizados correctamente!");
	    listarVentas(""); 
	}
	protected void do_btnLimpiarVentas_actionPerformed(ActionEvent e) {
		txtBuscarDniVenta2.setText("");
		textField_7.setText("");
		textField_8.setText("");
		textField_10.setText("");
	}

	protected void do_txtNombresAlumno_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isDigit(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa letras");
		}
	}
	protected void do_txtApellidosAlumno_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isDigit(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa letras");
		}
	}
	protected void do_txtDniAlumno_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isLetter(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa números");
		}
			if (txtDniAlumno.getText().length() >= 8) {
		        e.consume();
		        JOptionPane.showMessageDialog(this, "El DNI como máximo se ingresan 8 dígitos");
		    }
		
	}
	protected void do_txtCelularAlumno_keyTyped(KeyEvent e) {
		
			char validarNumero=e.getKeyChar();
			if(Character.isLetter(validarNumero)) {
				e.consume();
				JOptionPane.showMessageDialog(this, "Solamente se ingresa números");
			}
			if (txtCelularAlumno.getText().length() >= 9) {
		        e.consume();
		        JOptionPane.showMessageDialog(this, "El teléfono como máximo se ingresan 9 dígitos");
		    }
		}
		
	
	protected void do_txtDniApoderado_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isLetter(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa números");
		}
		if (txtDniApoderado.getText().length() >= 8) {
	        e.consume();
	        JOptionPane.showMessageDialog(this, "El DNI como máximo se ingresan 8 dígitos");
	    }
	}
	protected void do_txtNombresApoderado_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isDigit(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa letras");
		}
	}
	protected void do_txtApellidosApoderado_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isDigit(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa letras");
		}
	}
	protected void do_txtCelularApoderado_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isLetter(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa números");
		}
		if (txtCelularApoderado.getText().length() >= 9) {
	        e.consume();
	        JOptionPane.showMessageDialog(this, "El teléfono como máximo se ingresan 9 dígitos");
	    }
	}
	protected void do_txtBuscarDniAlumno_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isLetter(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa números");
		}
		if (txtBuscarDniAlumno.getText().length() >= 8) {
	        e.consume();
	        JOptionPane.showMessageDialog(this, "El DNI como máximo se ingresan 8 dígitos");
	    }
	}
	protected void do_btnProgramadores_actionPerformed(ActionEvent e) {
		moduloAlumnos.setVisible(false);
		moduloClases.setVisible(false);
		moduloReporte.setVisible(false);
		moduloVentas.setVisible(false);
		moduloProgramadores.setVisible(true);
	}
	protected void do_txtParentescoApoderado_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isDigit(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa letras");
	}
	}
	protected void do_txtBuscarDniVenta1_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isLetter(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa números");
		}
		if (txtBuscarDniVenta1.getText().length() >= 8) {
	        e.consume();
	        JOptionPane.showMessageDialog(this, "El DNI como máximo se ingresan 8 dígitos");
	    }
	}
	protected void do_txtBuscarDniVenta2_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isLetter(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa números");
		}
		if (txtBuscarDniVenta2.getText().length() >= 8) {
	        e.consume();
	        JOptionPane.showMessageDialog(this, "El DNI como máximo se ingresan 8 dígitos");
	    }
	}
	protected void do_textField_11_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isLetter(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa números");
		}
	}
	protected void do_txtNdeAlumnos_keyTyped(KeyEvent e) {
		char validarNumero=e.getKeyChar();
		if(Character.isLetter(validarNumero)) {
			e.consume();
			JOptionPane.showMessageDialog(this, "Solamente se ingresa números");
		}
	}
}

