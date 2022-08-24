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
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.SystemColor;


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
		frmWungsdle.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\srver\\Desktop\\UNGS\\Programacion III\\WUNGSDLE\\img\\w-ungs,dleLogo.png"));
		frmWungsdle.setResizable(false);
		frmWungsdle.getContentPane().setEnabled(false);
		frmWungsdle.setTitle("W-UNGS-dle");
		frmWungsdle.setBounds(100, 100, 960, 540);
		frmWungsdle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWungsdle.getContentPane().setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setVisible(false);
		menu.setBounds(0, 0, 960, 510);
		frmWungsdle.getContentPane().add(menu);
		menu.setLayout(null);
		
		JPanel ES = new JPanel();
		ES.setVisible(false);
		ES.setLayout(null);
		ES.setBackground(new Color(17, 149, 207));
		ES.setBounds(0, 111, 200, 399);
		menu.add(ES);
		
		JButton btnPlayButton_1 = new JButton("Jugar");
		btnPlayButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnPlayButton_1.setBounds(40, 30, 110, 50);
		ES.add(btnPlayButton_1);
		
		JButton btnHowToPlayButton_1 = new JButton("ComoJugar");
		btnHowToPlayButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnHowToPlayButton_1.setBounds(40, 110, 110, 50);
		ES.add(btnHowToPlayButton_1);
		
		JButton btnQuitButton_1 = new JButton("Salir");
		btnQuitButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuitButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnQuitButton_1.setBounds(40, 190, 110, 50);
		ES.add(btnQuitButton_1);
		
		JPanel EN = new JPanel();
		EN.setVisible(false);
		EN.setBackground(new Color(17, 149, 207));
		EN.setBounds(0, 111, 200, 399);
		menu.add(EN);
		EN.setLayout(null);
		
		JButton btnPlayButton = new JButton("Play");
		btnPlayButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnPlayButton.setBounds(40, 30, 110, 50);
		EN.add(btnPlayButton);
		
		JButton btnHowToPlayButton = new JButton("How To Play");
		btnHowToPlayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnHowToPlayButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnHowToPlayButton.setBounds(40, 110, 110, 50);
		EN.add(btnHowToPlayButton);
		
		JButton btnQuitButton = new JButton("Quit");
		btnQuitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuitButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnQuitButton.setBounds(40, 190, 110, 50);
		EN.add(btnQuitButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\srver\\Desktop\\UNGS\\Programacion III\\WUNGSDLE\\img\\fondoMenu.png"));
		lblNewLabel_1.setBounds(0, 0, 960, 510);
		menu.add(lblNewLabel_1);
		
		JPanel lenguaje = new JPanel();
		lenguaje.setBounds(0, 0, 954, 511);
		frmWungsdle.getContentPane().add(lenguaje);
		lenguaje.setLayout(null);
		
		JButton btnEspaniolButton = new JButton("Espa\u00F1ol");
		btnEspaniolButton.setBounds(657, 301, 89, 23);
		lenguaje.add(btnEspaniolButton);
		
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
				menu.setVisible(true);
				EN.setVisible(true);
			}
		});
		
		btnEspaniolButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lenguaje.setVisible(false);
				set_lenguaje("ES");
				menu.setVisible(true);
				ES.setVisible(true);
			}
		});
		
	}

	public String get_lenguaje() {
		return _lenguaje;
	}

	public void set_lenguaje(String _lenguaje) {
		this._lenguaje = _lenguaje;
	}
}
