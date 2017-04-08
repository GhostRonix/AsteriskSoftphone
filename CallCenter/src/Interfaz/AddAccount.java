package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddAccount extends JFrame {
	
	

	private JPanel contentPane;
	private JTextField txtNewUsername;
	private JTextField txtNewExtension;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAccount frame = new AddAccount();
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
	public AddAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 432, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNuevaExtension = new JLabel("Nueva Extension");
		lblNuevaExtension.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNuevaExtension.setForeground(new Color(119, 136, 153));
		lblNuevaExtension.setBackground(new Color(119, 136, 153));
		lblNuevaExtension.setBounds(144, 13, 130, 16);
		panel.add(lblNuevaExtension);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(65, 105, 225));
		separator.setBounds(22, 38, 383, 2);
		panel.add(separator);
		
		JLabel lblTitularUsarname = new JLabel(" Titular Usarname:");
		lblTitularUsarname.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitularUsarname.setBounds(12, 53, 130, 16);
		panel.add(lblTitularUsarname);
		
		txtNewUsername = new JTextField();
		txtNewUsername.setBounds(197, 53, 116, 22);
		panel.add(txtNewUsername);
		txtNewUsername.setColumns(10);
		
		JLabel lblNuevaExtenscion = new JLabel("Nueva Extension:");
		lblNuevaExtenscion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNuevaExtenscion.setBounds(26, 97, 116, 16);
		panel.add(lblNuevaExtenscion);
		
		txtNewExtension = new JTextField();
		txtNewExtension.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				 int CharLimit= 4;
					
					if(txtNewExtension.getText().length()==CharLimit)
					{
						e.consume();
					}
			}
		});
		txtNewExtension.setBounds(197, 94, 116, 22);
		panel.add(txtNewExtension);
		txtNewExtension.setColumns(10);
		
		JLabel lblHost = new JLabel("HOST:");
		lblHost.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHost.setBounds(36, 132, 56, 16);
		panel.add(lblHost);
		
		textField = new JTextField();
		textField.setBounds(197, 129, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(65, 105, 225));
		separator_1.setBounds(22, 200, 383, 2);
		panel.add(separator_1);
		
		JButton btnAceptarYGuardar = new JButton("Aceptar y Guardar");
		btnAceptarYGuardar.setBounds(144, 215, 149, 25);
		panel.add(btnAceptarYGuardar);
	}

}
