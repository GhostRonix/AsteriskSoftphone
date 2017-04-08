package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Telefono extends JFrame {

	private JPanel contentPane;
	private JTextField txtPantalla;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telefono frame = new Telefono();
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
	public Telefono() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PanelShowExt = new JPanel();
		PanelShowExt.setBounds(0, 0, 292, 58);
		contentPane.add(PanelShowExt);
		PanelShowExt.setLayout(null);
		
		txtPantalla = new JTextField();
		txtPantalla.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtPantalla.setEditable(false);
		txtPantalla.setBackground(new Color(245, 245, 245));
		txtPantalla.setBounds(0, 0, 215, 58);
		PanelShowExt.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JButton btnBorrar = new JButton("\u25C4");
		btnBorrar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				 if(txtPantalla.getText().length()!=0)
				 {
					 txtPantalla.setText(txtPantalla.getText().substring(0, txtPantalla.getText().length()-1));
			        }
				//txtPantalla.setText(null);
			}
		});
		btnBorrar.setBounds(216, 0, 76, 58);
		PanelShowExt.add(btnBorrar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 66, 270, 2);
		contentPane.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(0, 79, 292, 294);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btn1.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(0, 16, 97, 55);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btn2.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(98, 16, 97, 55);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btn3.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(195, 16, 97, 55);
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btn4.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(0, 84, 97, 55);
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btn5.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(98, 84, 97, 55);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btn6.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(195, 84, 97, 55);
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btn7.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(0, 152, 97, 55);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btn8.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(98, 152, 97, 55);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btn9.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(195, 152, 97, 55);
		panel.add(btn9);
		
		JButton btnAsterisco = new JButton("*");
		btnAsterisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btnAsterisco.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btnAsterisco.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAsterisco.setBounds(0, 220, 97, 55);
		panel.add(btnAsterisco);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btn0.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(98, 220, 97, 55);
		panel.add(btn0);
		
		JButton btnNum = new JButton("#");
		btnNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String pulsar;
				pulsar= txtPantalla.getText() + btnNum.getText();
				txtPantalla.setText(pulsar);
			}
		});
		btnNum.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNum.setBounds(195, 220, 97, 55);
		panel.add(btnNum);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 386, 268, 2);
		contentPane.add(separator_1);
		
	//////////////////////////////////////////////////////////////////
		
		JButton btnLlamar = new JButton("Llamar");
		btnLlamar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnLlamar.setVisible(false);
				//btnColgar.setVisible(true);
				
				
				//mostrar Call Status
				
				//CallStatus statuscalls= new CallStatus();
				 //statuscalls.setVisible(true);
			  
				
				/*long calltime1 = System.nanoTime();
				long calltime2 = System.nanoTime();
				
				txtPantalla.setText(null);
				
				txtPantalla.setText("Tiempode Lladama: "+(calltime2- calltime1));*/
				
				
			}
		});
		btnLlamar.setBounds(93, 401, 97, 25);
		contentPane.add(btnLlamar);
		
		
		JButton btnColgar = new JButton("Colgar");
		btnColgar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				btnLlamar.setVisible(true);
				txtPantalla.setText(null);
				
				
				///Bye Call Status///
				
				//CallStatus statuscalls = new CallStatus();
				
			}
		});
		btnColgar.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) 
			{
				
				btnColgar.setVisible(true);
				
			}
		});
		
			btnColgar.setBounds(93, 401, 97, 25);
			contentPane.add(btnColgar);
			
			JButton btnLog = new JButton("Log");
			btnLog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					LogLlamadas log= new LogLlamadas();
					 log.setVisible(true);
				}
			});
			btnLog.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnLog.setBounds(225, 402, 55, 25);
			contentPane.add(btnLog);
		
		
		
	}
}
