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
	private JTextField txtFechaNaciAlumno;
	private JLabel lblDni_1;
	private JLabel lblNombre_1;
	private JLabel lblApellidos_1;
	private JLabel lblCelular_1;
	private JLabel lblParentesco;
	private JTextField txtDniApoderado;
	private JTextField txtNombresApoderado;
	private JTextField txtApellidosApoderado;
	private JTextField txtCelularApoderado;
	private JTextField txtParentescoApoderado;
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
	private JTextField txtBuscarFechaClase;
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

	/**
	 * Launch the application.
	 */
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
						txtNombresAlumno.setBounds(123, 94, 324, 24);
						panel_2.add(txtNombresAlumno);
						txtNombresAlumno.setColumns(10);
					}
					{
						txtDniAlumno = new JTextField();
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
						txtFechaNaciAlumno = new JTextField();
						txtFechaNaciAlumno.setBounds(159, 215, 288, 24);
						panel_2.add(txtFechaNaciAlumno);
						txtFechaNaciAlumno.setColumns(10);
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
						txtDniApoderado.setBounds(70, 57, 459, 24);
						panel_3.add(txtDniApoderado);
						txtDniApoderado.setColumns(10);
					}
					{
						txtNombresApoderado = new JTextField();
						txtNombresApoderado.setBounds(120, 94, 409, 24);
						panel_3.add(txtNombresApoderado);
						txtNombresApoderado.setColumns(10);
					}
					{
						txtApellidosApoderado = new JTextField();
						txtApellidosApoderado.setBounds(120, 134, 409, 24);
						panel_3.add(txtApellidosApoderado);
						txtApellidosApoderado.setColumns(10);
					}
					{
						txtCelularApoderado = new JTextField();
						txtCelularApoderado.setBounds(120, 177, 409, 24);
						panel_3.add(txtCelularApoderado);
						txtCelularApoderado.setColumns(10);
					}
					{
						txtParentescoApoderado = new JTextField();
						txtParentescoApoderado.setBounds(152, 215, 377, 24);
						panel_3.add(txtParentescoApoderado);
						txtParentescoApoderado.setColumns(10);
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
					btnProcesarVenta.setBounds(362, 596, 175, 41);
					moduloVentas.add(btnProcesarVenta);
				}
				{
					btnAnularVenta = new JButton("ANULAR");
					btnAnularVenta.setBounds(584, 596, 175, 41);
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
					txtBuscarFechaClase = new JTextField();
					txtBuscarFechaClase.setColumns(10);
					txtBuscarFechaClase.setBounds(515, 71, 164, 20);
					moduloClases.add(txtBuscarFechaClase);
				}
				{
					scrollPane_2 = new JScrollPane();
					scrollPane_2.setBounds(405, 146, 723, 456);
					moduloClases.add(scrollPane_2);
					{
						table_2 = new JTable();
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
					btnBuscarClase.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnBuscarClase.setBounds(764, 71, 89, 23);
					moduloClases.add(btnBuscarClase);
				}
				{
					comboBox_SedeClase = new JComboBox();
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
								comboBox_sedeGeneral.setModel(new DefaultComboBoxModel(new String[] {"Bellavista", "Pilares"}));
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
				btnAlumnos.setBounds(23, 48, 182, 81);
				panel.add(btnAlumnos);
			}
			{
				btnVenta = new JButton("VENTAS");
				btnVenta.addActionListener(this);
				btnVenta.setFont(new Font("SansSerif", Font.BOLD, 15));
				btnVenta.setBackground(new Color(112, 128, 144));
				btnVenta.setBounds(23, 170, 182, 81);
				panel.add(btnVenta);
			}
			{
				btnClases = new JButton("CLASES");
				btnClases.addActionListener(this);
				btnClases.setFont(new Font("SansSerif", Font.BOLD, 15));
				btnClases.setBackground(new Color(112, 128, 144));
				btnClases.setBounds(23, 291, 182, 81);
				panel.add(btnClases);
			}
			{
				btnReporte = new JButton("REPORTE");
				btnReporte.addActionListener(this);
				btnReporte.setFont(new Font("SansSerif", Font.BOLD, 15));
				btnReporte.setBackground(new Color(112, 128, 144));
				btnReporte.setBounds(23, 417, 182, 81);
				panel.add(btnReporte);
			}
			{
				btnCerrarSesión = new JButton("CERRAR SESIÓN");
				btnCerrarSesión.addActionListener(this);
				btnCerrarSesión.setFont(new Font("SansSerif", Font.BOLD, 15));
				btnCerrarSesión.setBackground(new Color(112, 128, 144));
				btnCerrarSesión.setBounds(23, 541, 182, 81);
				panel.add(btnCerrarSesión);
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
 			comboBox_arteMarcial.setModel(new DefaultComboBoxModel(new String[] {"Boxeo", "Muay Thai", "MMA", "Lucha Olímpica", "Luta Livre"}));
 			comboBox_profesor.setModel(new DefaultComboBoxModel(new String[] {"Danny Rosales", "Jordan Pacheco", "William Gómez"}));
 			comboBox_turno.setModel(new DefaultComboBoxModel(new String[] {"Mañana", "Tarde", "Noche"}));
 			listarVentas("");
 			comboBox_mesGeneral.setModel(new DefaultComboBoxModel(new String[] { "Seleccione...", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
 			comboBox_sedeGeneral.setModel(new DefaultComboBoxModel(new String[] {"Bellavista", "Pilares"}));
 			comboBox_mesAsesor.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
 			comboBox_asesorAsesor.setModel(new DefaultComboBoxModel(new String[] {"Axel", "Fabio", "Jimena", "Kiara"}));
 			comboBox_mesProfesor.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
 			comboBox_profesorReporte.setModel(new DefaultComboBoxModel(new String[] {"Danny Rosales", "Jordan", "William" , "José" , "Marcos","Juan","Katty","Paco","Diego","Enzo"}));
	}
	public void actionPerformed(ActionEvent e) {
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
	public void Listar(String nom) {
		DefaultTableModel modelo = new DefaultTableModel();
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
	
	public void listarVentas(String dniBuscar) {
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.addColumn("CÓDIGO VENTA");
			modelo.addColumn("FECHA");
			modelo.addColumn("DNI ALUMNO");
			modelo.addColumn("PLAN");
			modelo.addColumn("MÉTODO DE PAGO");
			modelo.addColumn("TOTAL PAGADO");

			try {
				java.sql.Connection cn = utils.Conexion.conectar();
				java.sql.CallableStatement csta = cn.prepareCall("{call SP_LISTAR_VENTAS_SEDE(?,?)}");
				csta.setString(1, dniBuscar);
				csta.setInt(2, VentanaLogin.idSedeLogueada); 
				
				java.sql.ResultSet rs = csta.executeQuery();
				while(rs.next()) {
					Object[] fila = {
						rs.getInt(1),     // codigo_venta
						rs.getString(2),  // fecha_venta
						rs.getString(3),  // dni (traído del JOIN)
						rs.getString(4),  // nombre_plan (traído del JOIN)
						rs.getString(5),  // metodo_pago
						"S/. " + rs.getDouble(6) // total_pagado
					};
					modelo.addRow(fila);
				}
			} catch (Exception e) {
				System.out.println("Error en Listar Ventas: " + e.getMessage());
			}
			tbTablaVentas.setModel(modelo); 
		}
	
	public void ListarProfesores(String mesFiltro, String profesorFiltro) {
		DefaultTableModel modelo = new DefaultTableModel();
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
	
	//Módulo Ventas-------------------------------------------------------------------------------------------
	protected void do_btnVenta_actionPerformed(ActionEvent e) {
		moduloAlumnos.setVisible(false);
		moduloClases.setVisible(false);
		moduloReporte.setVisible(false);
		moduloVentas.setVisible(true);
	}

	
	//--------------------------------------------------------------------------------------------------------
	//Módulo Alumnos-------------------------------------------------------------------------------------------
	protected void do_btnAlumnos_actionPerformed(ActionEvent e) {
		moduloAlumnos.setVisible(true);
		moduloClases.setVisible(false);
		moduloReporte.setVisible(false);
		moduloVentas.setVisible(false);
	}
	protected void do_tbTabla_mouseClicked(MouseEvent e) {
int fila = tbTabla.getSelectedRow();
		
		if (fila >= 0) {
			
			txtDniAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 1)));
			txtNombresAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 2)));
			txtApellidosAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 3)));
			txtCelularAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 4)));
			txtFechaNaciAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 5)));			
		
			if (e.getClickCount() == 2) {
				
				int codigoAlumno = Integer.parseInt(String.valueOf(tbTabla.getValueAt(fila, 0)));
				String nombreAlumno = String.valueOf(tbTabla.getValueAt(fila, 2));
				
				mostrarApoderado(codigoAlumno, nombreAlumno);
			}
		}
		
	}
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
		txtBuscarDniAlumno.setText("");
		txtDniAlumno.setText("");
		txtNombresAlumno.setText("");
		txtApellidosAlumno.setText("");
		txtCelularAlumno.setText("");
		txtFechaNaciAlumno.setText("");
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
	protected void do_btnMatricular_actionPerformed(ActionEvent e) {
		String dni = txtDniAlumno.getText().trim();
		String nombres = txtNombresAlumno.getText().trim();
		String apellidos = txtApellidosAlumno.getText().trim();
		String celular = txtCelularAlumno.getText().trim();
		String fechaTexto = txtFechaNaciAlumno.getText().trim(); 

		if (dni.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || fechaTexto.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Por favor, completa todos los datos obligatorios del alumno.");
			return;
		}

		String fechaParaMySQL = "";
		int edad = 0;

		try {
			java.time.format.DateTimeFormatter formatoEntrada = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
			java.time.LocalDate fechaNac = java.time.LocalDate.parse(fechaTexto, formatoEntrada);
			java.time.LocalDate hoy = java.time.LocalDate.now();
			
			edad = java.time.Period.between(fechaNac, hoy).getYears();
			
			java.time.format.DateTimeFormatter formatoBD = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
			fechaParaMySQL = fechaNac.format(formatoBD);
			
		} catch (java.time.format.DateTimeParseException ex) {
			JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Usa el formato DD/MM/AAAA (Ejemplo: 25/10/2005)", "Aviso", JOptionPane.WARNING_MESSAGE);
			return; 
		}

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
	        
	        if (exito == true) {
	            
	            if (edad < 18) {
	                arreglo.InsertarApoderado(dni, dniApo, nomApo, apeApo, celApo, parentesco);
	            }
	            
	            JOptionPane.showMessageDialog(null, "¡Alumno matriculado correctamente!");
	            
	            
	            do_btnLimpiar_actionPerformed(null);
	            Listar("");
	            
	        } else {
	            
	            JOptionPane.showMessageDialog(null, "Error: No se pudo matricular. El DNI ingresado ya existe en el sistema.", "DNI Duplicado", JOptionPane.ERROR_MESSAGE);
	        }
	        
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar: " + ex.getMessage());
	    }
	}
	    
	    
	
	//---------------------------------------------------------------------------------------------------------
	//Módulo Clases-------------------------------------------------------------------------------------------
	protected void do_btnClases_actionPerformed(ActionEvent e) {
		moduloAlumnos.setVisible(false);
		moduloClases.setVisible(true);
		moduloReporte.setVisible(false);
		moduloVentas.setVisible(false);
	}
	//--------------------------------------------------------------------------------------------------------
	//Módulo Reporte-------------------------------------------------------------------------------------------
	protected void do_btnReporte_actionPerformed(ActionEvent e) {
		moduloAlumnos.setVisible(false);
		moduloClases.setVisible(false);
		moduloReporte.setVisible(true);
		moduloVentas.setVisible(false);
		ListarProfesores("", "");
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
	
	//---------------------------------------------------------------------------------------------------------
	protected void do_btnCerrarSesión_actionPerformed(ActionEvent e) {
		VentanaLogin login = new VentanaLogin();
		login.setVisible(true);
		this.dispose();
	}
	public void mouseClicked(MouseEvent e) {
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
	
	

	//--------------------------------------------------------------------------------------------------------
		//Módulo Venta-------------------------------------------------------------------------------------------
	
	protected void do_btnBuscarDniVenta1_actionPerformed(ActionEvent e) {
		String dni = txtBuscarDniVenta1.getText().trim();
		if (dni.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ingrese un DNI para buscar.");
			return;
		}
		
		arreglo.ArregloAlumno arrAlumno = new arreglo.ArregloAlumno();
		java.util.ArrayList<clases.Alumno> lista = arrAlumno.ConsultarAlumno(dni);
		
		if (lista.size() > 0) {
			
			textField_7.setText(lista.get(0).getNom() + " " + lista.get(0).getApellidos());
		} else {
			JOptionPane.showMessageDialog(null, "Alumno no encontrado. Debe matricularlo primero.");
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
				
				
				if (Math.abs((efectivo + digital) - total) > 0.1) {
					JOptionPane.showMessageDialog(null, "Error: En método Mixto, la suma exacta debe ser " + total);
					return;
				}
			} else if (metodoPago.equals("Efectivo")) {
				efectivo = total; 
				digital = 0.0;
			} else { 
				
				efectivo = 0.0;
				digital = total; 
			}

		
			arreglo.ArregloVenta arrVenta = new arreglo.ArregloVenta();
			System.out.println("DEBUG: Estoy intentando registrar con la Sede ID: " + VentanaLogin.idSedeLogueada);
			arrVenta.InsertarVenta(dni, idPlan, metodoPago, efectivo, digital, total, 1);
			
			JOptionPane.showMessageDialog(null, "¡Venta registrada con éxito en el sistema!");
			
		
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

			// Conexión y envío a MySQL
			java.sql.Connection cn = utils.Conexion.conectar();
			java.sql.CallableStatement csta = cn.prepareCall("{call SP_INSERTAR_CLASE(?,?,?,?,?)}");
			csta.setString(1, turno);
			csta.setInt(2, numAlumnos);
			csta.setString(3, calificacion);
			csta.setInt(4, idProfesor);
			csta.setInt(5, idDisciplina);
			csta.executeUpdate();

            JOptionPane.showMessageDialog(null, "¡Clase registrada con calificación: " + calificacion + "!");
            txtNdeAlumnos.setText(""); 
            
           
            ListarClases(""); 
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese una cantidad válida de alumnos (solo números enteros).");
        }
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
			textField_11.setEditable(false); 
			textField_10.setText("");
			textField_11.setText("");
			textField_10.requestFocus(); 
		} else {
			
			textField_10.setEditable(false);
			textField_11.setEditable(false);
			textField_10.setText("");
			textField_11.setText("");
		}
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == textField_10) {
			do_textField_10_keyReleased(e);
		}
	}
	public void keyTyped(KeyEvent e) {
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
	
	public void ListarClases(String fecha) {
	    
	    DefaultTableModel modelo = (DefaultTableModel) table_2.getModel();
	    modelo.setRowCount(0); 
	    
	    try {
	        java.sql.Connection cn = utils.Conexion.conectar();
	        java.sql.CallableStatement csta = cn.prepareCall("{call SP_LISTAR_CLASES(?)}");
	        csta.setString(1, fecha);
	        java.sql.ResultSet rs = csta.executeQuery();
	        
	        while(rs.next()) {
	            Object[] fila = new Object[6]; 
	            fila[0] = rs.getString(1);
	            fila[1] = rs.getString(2); 
	            fila[2] = rs.getString(3); 
	            fila[3] = rs.getString(4); 
	            fila[4] = rs.getInt(5);    
	            fila[5] = rs.getString(6); 
	            
	            modelo.addRow(fila); 
	        }
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Error al cargar tabla: " + e.getMessage());
	    }
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
	
	public void ListarReporteAsesores(String mesFiltro, String asesorFiltro) {
		DefaultTableModel modelo = new DefaultTableModel();
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
	
	protected void do_btnMostrarTodoGeneral_actionPerformed(ActionEvent e) {
		ListarReporteGeneral("", "");
		comboBox_mesGeneral.setSelectedIndex(0);
		comboBox_sedeGeneral.setSelectedIndex(0);
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
	
	public void ListarReporteGeneral(String mesFiltro, String sedeFiltro) {
		DefaultTableModel modelo = new DefaultTableModel();
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
	protected void do_btnFiltrarGENERAL_actionPerformed(ActionEvent e) {
		String mes = comboBox_mesGeneral.getSelectedItem().toString();
		String sede = comboBox_sedeGeneral.getSelectedItem().toString();
		ListarReporteGeneral(mes, sede);
	}
}
