package gui;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import utils.Conexion;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame implements ActionListener {
	int intentos = 0;
	public static int idSedeLogueada = 0; 
	public static String rolUsuario = "";
	public static int idUsuarioLogueado;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	private JButton btnInicioSesion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
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
	public VentanaLogin() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("USUARIO");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel.setBounds(181, 29, 83, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("CONTRASEÑA");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_1.setBounds(173, 101, 114, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtUsuario = new JTextField();
			txtUsuario.setBounds(150, 54, 114, 20);
			contentPane.add(txtUsuario);
			txtUsuario.setColumns(10);
		}
		{
			txtContrasena = new JPasswordField();
			txtContrasena.setBounds(150, 126, 114, 20);
			contentPane.add(txtContrasena);
		}
		{
			btnInicioSesion = new JButton("Iniciar sesión");
			btnInicioSesion.addActionListener(this);
			btnInicioSesion.setFont(new Font("Tahoma", Font.ITALIC, 11));
			btnInicioSesion.setBounds(150, 175, 114, 23);
			contentPane.add(btnInicioSesion);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInicioSesion) {
			do_btnInicioSesion_actionPerformed(e);
		}
	}


	protected void do_btnInicioSesion_actionPerformed(ActionEvent e) {
	    
	    String usuario = txtUsuario.getText();
	    String clave = new String(txtContrasena.getPassword());

	    if (usuario.isEmpty() || clave.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Por favor, ingresa tu usuario y contraseña.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
	        return;
	    }

	    try {
	        Connection cn = Conexion.conectar();
	        
	        String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
	        PreparedStatement pst = cn.prepareStatement(sql);
	        pst.setString(1, usuario);
	        pst.setString(2, clave);
	        
	        ResultSet rs = pst.executeQuery();
	        
	        if (rs.next()) {
	            
	            String rol = rs.getString("rol");
	            String nombre = rs.getString("nombres");
	            int sedeDB = rs.getInt("id_sede");
	            int idUsuarioDB = rs.getInt("id_usuario"); // <-- CAPTURAMOS EL ID DEL USUARIO
	            rolUsuario = rol; 
	            VentanaLogin.idUsuarioLogueado = idUsuarioDB; // <-- LO GUARDAMOS EN LA VARIABLE GLOBAL
	            
	            if (rol.equals("Jefa")) {
	                idSedeLogueada = 0; 
	            } else {
	                idSedeLogueada = sedeDB; 
	            }
	            
	            JOptionPane.showMessageDialog(null, "¡Bienvenid@ " + nombre + "!\nIngresaste como: " + rol);
	            MenuPrincipal menu = new MenuPrincipal();
	            menu.setVisible(true);
	            this.dispose();
	            
	        } else {
	            // --- INICIO DE LA LÓGICA DE 3 INTENTOS ---
	            intentos++; // Sumamos 1 error
	            
	            if (intentos >= 3) {
	                JOptionPane.showMessageDialog(null, 
	                    "¡Acceso bloqueado! Ha superado el límite de 3 intentos fallidos por seguridad.", 
	                    "Alerta de Seguridad", 
	                    JOptionPane.ERROR_MESSAGE);
	                System.exit(0); // Cierra el sistema por seguridad
	            } else {
	                JOptionPane.showMessageDialog(null, 
	                    "Usuario o contraseña incorrectos. Le quedan " + (3 - intentos) + " intentos.", 
	                    "Acceso Denegado", 
	                    JOptionPane.WARNING_MESSAGE);
	                
	                // Limpiamos la contraseña para que vuelva a intentar
	                txtContrasena.setText("");
	                txtContrasena.requestFocus();
	            }
	            // --- FIN DE LA LÓGICA ---
	        }
	        
	        cn.close();
	        
	    } catch (Exception e1) {
	        JOptionPane.showMessageDialog(null, "Error del sistema: " + e1.getMessage());
	    }	
	}
}
