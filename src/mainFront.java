import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Label;


public class mainFront {
	private JFrame frmWungsdle;
	private String _lenguaje;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFront window = new mainFront();
					window.frmWungsdle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainFront() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWungsdle = new JFrame();
		frmWungsdle.setResizable(false);
		frmWungsdle.getContentPane().setEnabled(false);
		frmWungsdle.setTitle("W-UNGS-dle");
		frmWungsdle.setBounds(100, 100, 960, 540);
		frmWungsdle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWungsdle.getContentPane().setLayout(null);
		
		JPanel lenguaje = new JPanel();
		lenguaje.setBounds(0, 0, 954, 511);
		frmWungsdle.getContentPane().add(lenguaje);
		lenguaje.setLayout(null);
		
		JButton btnEspaniolButton = new JButton("Espa\u00F1ol");
		btnEspaniolButton.setBounds(657, 301, 89, 23);
		lenguaje.add(btnEspaniolButton);
		
		btnEspaniolButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lenguaje.setVisible(false);
				set_lenguaje("ES");
			}
		});
		
		JButton btnEnglishButton = new JButton("Ingles");
		btnEnglishButton.setBounds(147, 301, 89, 23);
		lenguaje.add(btnEnglishButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\srver\\Desktop\\UNGS\\Programacion III\\WUNGSDLE\\img\\fondoGeneral.png"));
		lblNewLabel.setBounds(0, 0, 960, 510);
		lenguaje.add(lblNewLabel);
		
		btnEnglishButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lenguaje.setVisible(false);
				set_lenguaje("EN");
			}
		});
		
		JPanel menu = new JPanel();
		menu.setBounds(0, 0, 475, 240);
		frmWungsdle.getContentPane().add(menu);
		menu.setLayout(null);
		
		
	}

	public String get_lenguaje() {
		return _lenguaje;
	}

	public void set_lenguaje(String _lenguaje) {
		this._lenguaje = _lenguaje;
	}
}
