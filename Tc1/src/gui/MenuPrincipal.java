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

public class MenuPrincipal extends JFrame implements ActionListener, MouseListener {

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
	private JTable table_1;
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
	private JTable table_3;
	private JButton btnMostrarTodoGeneral;
	private JLabel lblPanelDeReportes_1;
	private JLabel lblAsesores;
	private JLabel lblNewLabel_13;
	private JComboBox comboBox_mesAsesor;
	private JComboBox comboBox_asesor;
	private JButton btnFiltrarASESORES;
	private JScrollPane scrollPane_4;
	private JButton btnMostrarTodoAsesores;
	private JTable table_4;
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
	private JLabel lblNewLabel_17;
	private JComboBox comboBox_JefaSede;
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
						table_1 = new JTable();
						table_1.setRowHeight(25);
						table_1.setModel(new DefaultTableModel(
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
						table_1.getColumnModel().getColumn(0).setPreferredWidth(99);
						table_1.getColumnModel().getColumn(0).setMinWidth(18);
						table_1.getColumnModel().getColumn(1).setPreferredWidth(80);
						table_1.getColumnModel().getColumn(2).setPreferredWidth(90);
						table_1.getColumnModel().getColumn(3).setPreferredWidth(80);
						table_1.getColumnModel().getColumn(4).setPreferredWidth(115);
						table_1.getColumnModel().getColumn(5).setPreferredWidth(102);
						scrollPane_1.setViewportView(table_1);
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
								table_3 = new JTable();
								table_3.setRowHeight(25);
								table_3.setModel(new DefaultTableModel(
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
								table_3.getColumnModel().getColumn(2).setPreferredWidth(131);
								table_3.getColumnModel().getColumn(3).setPreferredWidth(143);
								table_3.getColumnModel().getColumn(4).setPreferredWidth(153);
								table_3.getColumnModel().getColumn(5).setPreferredWidth(100);
								scrollPane_3.setViewportView(table_3);
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
								btnFiltrarGENERAL.setBounds(337, 50, 89, 23);
								panel_8.add(btnFiltrarGENERAL);
								btnFiltrarGENERAL.setFont(new Font("Tahoma", Font.BOLD, 11));
							}
							{
								btnMostrarTodoGeneral = new JButton("MOSTRAR TODO");
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
								table_4 = new JTable();
								table_4.setRowHeight(24);
								table_4.setModel(new DefaultTableModel(
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
								table_4.getColumnModel().getColumn(3).setPreferredWidth(78);
								table_4.getColumnModel().getColumn(4).setPreferredWidth(148);
								scrollPane_4.setViewportView(table_4);
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
								comboBox_asesor = new JComboBox();
								comboBox_asesor.setModel(new DefaultComboBoxModel(new String[] {"Axel", "Fabio", "Jimena"}));
								comboBox_asesor.setBounds(149, 85, 120, 22);
								panel_7.add(comboBox_asesor);
							}
							{
								btnFiltrarASESORES = new JButton("FILTRAR");
								btnFiltrarASESORES.setBounds(335, 50, 89, 23);
								panel_7.add(btnFiltrarASESORES);
								btnFiltrarASESORES.setFont(new Font("Tahoma", Font.BOLD, 11));
							}
							{
								btnMostrarTodoAsesores = new JButton("MOSTRAR TODO");
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
			lblNewLabel_17 = new JLabel("Modo Operativo");
			lblNewLabel_17.setForeground(Color.WHITE);
			lblNewLabel_17.setFont(new Font("Verdana", Font.BOLD, 15));
			lblNewLabel_17.setBounds(1217, 18, 137, 34);
			contentPane.add(lblNewLabel_17);
		}
		{
			lblNewLabel_4 = new JLabel("− Academia de Artes Marciales");
			lblNewLabel_4.setBounds(509, 18, 578, 67);
			contentPane.add(lblNewLabel_4);
			lblNewLabel_4.setForeground(new Color(255, 255, 255));
			lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 35));
		}
		{
			comboBox_JefaSede = new JComboBox();
			comboBox_JefaSede.setBounds(1217, 50, 137, 22);
			contentPane.add(comboBox_JefaSede);
		}
    Listar("");
	}
	public void actionPerformed(ActionEvent e) {
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
		DefaultTableModel modelo=new DefaultTableModel();
		ArregloAlumno acce=new ArregloAlumno();
		ArrayList<Alumno> lista=new ArrayList<Alumno>();
		if(nom.length()==0)
			lista=acce.ListarAlumnos();
		else
			lista=acce.ConsultarAlumno(nom);
		modelo.addColumn("Código");
		modelo.addColumn("DNI");
		modelo.addColumn("Nombres");
		modelo.addColumn("Apellidos");
		modelo.addColumn("Celular");
		modelo.addColumn("Fecha de nacimiento");
		modelo.addColumn("Estado");
		modelo.setRowCount(lista.size());
		Iterator it=lista.iterator();
		int i=0;
		while(it.hasNext()) {
			Object obj=it.next();
			Alumno acceso=(Alumno)obj;
			modelo.setValueAt(acceso.getCódigo(), i, 0);
			modelo.setValueAt(acceso.getDni(), i, 1);
			modelo.setValueAt(acceso.getNom(), i, 2);
			modelo.setValueAt(acceso.getApellidos(), i, 3);
			modelo.setValueAt(acceso.getCelular(), i, 4);
			modelo.setValueAt(acceso.getFecha_nacimiento(), i, 5);
			modelo.setValueAt(acceso.getEstado(), i, 6);
			i++;
		}
		tbTabla.setModel(modelo);
	}
	public void ListarProfesores(String mesFiltro, String profesorFiltro) {
	    DefaultTableModel modelo = new DefaultTableModel();
	    ArregloProfesor acce = new ArregloProfesor();
	    ArrayList<ReporteProfesor> lista = new ArrayList<ReporteProfesor>();
	    
	    if(mesFiltro.length() == 0 || profesorFiltro.length() == 0) { 
	        lista = acce.ListarTodosProfesores();
	    } else {
	        lista = acce.FiltrarProfesores(mesFiltro, profesorFiltro);
	    }
	    
	    modelo.addColumn("MES");
	    modelo.addColumn("SEDE");
	    modelo.addColumn("PROFESOR");
	    modelo.addColumn("DISCIPLINA");
	    modelo.addColumn("N.º CLASES DICTADAS");
	    modelo.addColumn("CALIFICACIÓN PROMEDIO");
	    
	    modelo.setRowCount(lista.size());
	    
	    Iterator it = lista.iterator();
	    int i = 0;
	    while(it.hasNext()) {
	        Object obj = it.next();
	        ReporteProfesor acceso = (ReporteProfesor)obj;
	        modelo.setValueAt(acceso.getMes(), i, 0);
	        modelo.setValueAt(acceso.getSede(), i, 1);
	        modelo.setValueAt(acceso.getProfesor(), i, 2);
	        modelo.setValueAt(acceso.getDisciplina(), i, 3);
	        modelo.setValueAt(acceso.getnClasesDictadas(), i, 4);
	        modelo.setValueAt(acceso.getCalificacionPromedio(), i, 5);
	        
	        i++;
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
		int fila=tbTabla.getSelectedRow();
		txtDniAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 1)));
		txtNombresAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 2)));
		txtApellidosAlumno.setText(String.valueOf(tbTabla.getValueAt(fila,3 )));
		txtCelularAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 4)));
		txtFechaNaciAlumno.setText(String.valueOf(tbTabla.getValueAt(fila, 5)));
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
		String Dni_Buscar=txtBuscarDniAlumno.getText().trim();
		Listar(Dni_Buscar);
		txtBuscarDniAlumno.setText("");
	}
	protected void do_btnMatricular_actionPerformed(ActionEvent e) {
	    String dni = txtDniAlumno.getText();
	    String nombres = txtNombresAlumno.getText();
	    String apellidos = txtApellidosAlumno.getText();
	    String celular = txtCelularAlumno.getText();
	    String fecha_nacimiento=txtFechaNaciAlumno.getText();
	    if (dni.isEmpty() || nombres.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Campos obligatorios incompletos.");
	        return;
	    }
	    try {
	        Alumno alu = new Alumno(dni, nombres, apellidos, celular, fecha_nacimiento ,"Activo");
	        ArregloAlumno arreglo = new ArregloAlumno();
	        arreglo.InsertarAlumno(alu);
	        JOptionPane.showMessageDialog(null, "¡Alumno matriculado correctamente!");
			txtDniAlumno.setText("");
			txtNombresAlumno.setText("");
			txtApellidosAlumno.setText("");
			txtCelularAlumno.setText("");
			txtFechaNaciAlumno.setText("");
			Listar("");
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
	
	


	
}
