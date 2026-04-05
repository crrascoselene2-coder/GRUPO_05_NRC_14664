package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
<<<<<<< HEAD
import javax.swing.JLabel;
=======
import javax.swing.JButton;
>>>>>>> 2893f46f2cc41a0b90c8b78a38597ce94268001a

public class V1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
<<<<<<< HEAD
	private JLabel lblNewLabel;
=======
	private JButton btnNewButton;
>>>>>>> 2893f46f2cc41a0b90c8b78a38597ce94268001a

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
		setBounds(100, 100, 483, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
<<<<<<< HEAD
			lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(10, 24, 44, 12);
			contentPane.add(lblNewLabel);
=======
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(10, 11, 89, 23);
			contentPane.add(btnNewButton);
>>>>>>> 2893f46f2cc41a0b90c8b78a38597ce94268001a
		}

	}
}
