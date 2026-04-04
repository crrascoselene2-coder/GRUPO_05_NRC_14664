package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Clase1;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnhola;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnhola = new JButton("hola");
			btnhola.addActionListener(this);
			btnhola.setBounds(10, 11, 89, 23);
			contentPane.add(btnhola);
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnhola) {
			do_btnhola_actionPerformed(e);
		}
	}
	
	protected void do_btnhola_actionPerformed(ActionEvent e) {	
    Clase1 cl=new Clase1();
    cl.Imprimir();
	}
}
