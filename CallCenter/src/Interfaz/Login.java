package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.asteriskjava.config.dialplan.ConfigExtension;
import org.jruby.management.Config;

//import Clases.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.font.TextAttribute;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.beans.PropertyChangeListener;
import java.util.Map;
import java.beans.PropertyChangeEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitular;
	private JTextField txtExtension;
	private JPasswordField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 343, 366);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblS = new JLabel("Sign In");
		lblS.setFont(new Font("Verdana", Font.BOLD, 15));
		lblS.setForeground(Color.LIGHT_GRAY);
		lblS.setBounds(12, 13, 83, 16);
		panel.add(lblS);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 191, 255));
		separator.setBounds(22, 36, 282, 8);
		panel.add(separator);
		
		JLabel lblTitular = new JLabel("Titular");
		lblTitular.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitular.setBounds(45, 65, 56, 16);
		panel.add(lblTitular);
		
		txtTitular = new JTextField();
		txtTitular.setBounds(45, 94, 148, 22);
		panel.add(txtTitular);
		txtTitular.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Extension");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(45, 193, 90, 16);
		panel.add(lblNewLabel);
		
		txtExtension = new JTextField();
		txtExtension.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
                int CharLimit= 4;
				
				if(txtExtension.getText().length()==CharLimit)
				{
					e.consume();
				}
			}
		});
		txtExtension.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent e) 
			{
				
			}
		});
		txtExtension.setBounds(45, 222, 148, 22);
		panel.add(txtExtension);
		txtExtension.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(45, 129, 95, 16);
		panel.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 191, 255));
		separator_1.setBounds(28, 293, 286, 8);
		panel.add(separator_1);
		
		JButton btnEntrarAsterisk = new JButton("Entrar");
		btnEntrarAsterisk.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				  
			}
		});
		btnEntrarAsterisk.setBounds(114, 257, 113, 25);
		panel.add(btnEntrarAsterisk);
		
		JButton btnAgregarExt = new JButton("Agregar Ext.");
		btnAgregarExt.setBounds(114, 328, 118, 25);
		panel.add(btnAgregarExt);
		
		JLabel lblNewLabel_2 = new JLabel("Add New Ext....?");
		lblNewLabel_2.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) 
			{
			  Font font = lblNewLabel_2.getFont();
			  Map attributes = font.getAttributes();
			  attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
			  lblNewLabel_2.setFont(font.deriveFont(attributes));
			}
		});
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setBounds(124, 299, 103, 16);
		panel.add(lblNewLabel_2);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(45, 158, 148, 22);
		panel.add(txtContraseña);
	}
}
