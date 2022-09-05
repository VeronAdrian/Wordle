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
	private Wordle _wordle;
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
		frmWungsdle.setBackground(Color.WHITE);
		frmWungsdle.setForeground(Color.BLACK);
		frmWungsdle.setFont(new Font("Dialog", Font.BOLD, 20));
		frmWungsdle.setIconImage(Toolkit.getDefaultToolkit().getImage("img/w-ungs,dleLogo.png"));
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
		
		JPanel gamemodeEN = new JPanel();
		gamemodeEN.setBounds(200, 0, 200, 510);
		gamemodeEN.setVisible(false);
		
		JPanel EN = new JPanel();
		EN.setBounds(0, 111, 200, 399);
		EN.setVisible(false);
		menu.setLayout(null);
		
		JPanel howToPlayEN = new JPanel();
		howToPlayEN.setBackground(new Color(17, 149, 207));
		howToPlayEN.setLayout(null);
		howToPlayEN.setBounds(200, 75, 760, 350);
		howToPlayEN.setVisible(false);
		
		JPanel howToPlayES = new JPanel();
		howToPlayES.setBackground(new Color(17, 149, 207));
		howToPlayES.setBounds(200, 75, 760, 350);
		menu.add(howToPlayES);
		howToPlayES.setLayout(null);
		howToPlayES.setVisible(false);
		
		JLabel lblTittleES = new JLabel("Wordle");
		lblTittleES.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblTittleES.setBounds(310, 40, 120, 30);
		howToPlayES.add(lblTittleES);
		
		JTextPane txtpnHowToPlayES = new JTextPane();
		txtpnHowToPlayES.setText("  El jugador tiene seis intentos para adivinar una palabra que puede tener 5 letras o 7 letras, el mismo recibira pistas en funcion de las letras.\r\n Adicionalmente se puede jugar un modo Contrareloj en el cual el jugador tendra 15 segundos para adivinar la palabra. En este modo de juego si el jugador rompe el record se convertira en el nuevo Campeon del Wordle y ganara... nada, pero su nombre puede aparecer en el menu.");
		txtpnHowToPlayES.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtpnHowToPlayES.setBackground(new Color(17, 149, 207));
		txtpnHowToPlayES.setBounds(84, 100, 620, 200);
		howToPlayES.add(txtpnHowToPlayES);
		menu.add(howToPlayEN);
		
		JLabel lblTittleEN = new JLabel("Wordle");
		lblTittleEN.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblTittleEN.setBounds(310, 40, 120, 30);
		howToPlayEN.add(lblTittleEN);
		
		JTextPane txtpnHowToPlayEN = new JTextPane();
		txtpnHowToPlayEN.setBackground(new Color(17, 149, 207));
		txtpnHowToPlayEN.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtpnHowToPlayEN.setText(" Player have six attempts to guess the word who can have 5 letters or 7 seven letters, with feedback given for each guess. \r\n Adiccionally can play a Time Trial were the player have 15 seconds to guess the word. In this gamemode if the player break the record he will the new Champion of the Wordle an be reward with... nothing, but you can put your name in the menu.\r\n");
		txtpnHowToPlayEN.setBounds(84, 100, 620, 200);
		howToPlayEN.add(txtpnHowToPlayEN);
		EN.setBackground(new Color(17, 149, 207));
		menu.add(EN);
		EN.setLayout(null);
		
		JButton btnPlayButton = new JButton("Play");
		btnPlayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				howToPlayEN.setVisible(false);
				gamemodeEN.setVisible(true);
				btnPlayButton.setBackground(new Color(255, 255, 255));
			}
		});
		btnPlayButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnPlayButton.setBounds(40, 30, 110, 50);
		EN.add(btnPlayButton);
		
		JButton btnHowToPlayButton = new JButton("How To Play");
		btnHowToPlayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gamemodeEN.setVisible(false);
				howToPlayEN.setVisible(true);
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
		gamemodeEN.setLayout(null);
		gamemodeEN.setBackground(new Color(17, 149, 207));
		menu.add(gamemodeEN);
		
		JButton btnMode1ButtonEN = new JButton("5 Letters");
		btnMode1ButtonEN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_wordle = new Wordle();
			}
		});
		btnMode1ButtonEN.setFont(new Font("Arial", Font.BOLD, 12));
		btnMode1ButtonEN.setBounds(41, 140, 110, 50);
		gamemodeEN.add(btnMode1ButtonEN);
		
		JButton btnMode2ButtonEN = new JButton("7 Letters");
		btnMode2ButtonEN.setFont(new Font("Arial", Font.BOLD, 12));
		btnMode2ButtonEN.setBounds(41, 220, 110, 50);
		gamemodeEN.add(btnMode2ButtonEN);
		
		JButton btnContratiempoEN = new JButton("Time Trial");
		btnContratiempoEN.setFont(new Font("Arial", Font.BOLD, 12));
		btnContratiempoEN.setBounds(41, 300, 110, 50);
		gamemodeEN.add(btnContratiempoEN);
		
		JPanel gamemodeES = new JPanel();
		gamemodeES.setBounds(200, 0, 200, 510);
		gamemodeES.setVisible(false);
		
		JPanel ES = new JPanel();
		ES.setBounds(0, 111, 200, 399);
		ES.setVisible(false);
		ES.setLayout(null);
		ES.setBackground(new Color(17, 149, 207));
		menu.add(ES);
		ES.setVisible(false);
		
		JButton btnPlayButton_1 = new JButton("Jugar");
		btnPlayButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gamemodeES.setVisible(true);
				howToPlayES.setVisible(false);
				_wordle = new Wordle();
			}
		});
		btnPlayButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnPlayButton_1.setBounds(40, 30, 110, 50);
		ES.add(btnPlayButton_1);
		
		JButton btnHowToPlayButton_1 = new JButton("ComoJugar");
		btnHowToPlayButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gamemodeES.setVisible(false);
				howToPlayES.setVisible(true);
			}
		});
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
		gamemodeES.setBackground(new Color(17, 149, 207));
		menu.add(gamemodeES);
		gamemodeES.setLayout(null);
		
		JButton btnMode1Button = new JButton("5 Letras");
		btnMode1Button.setFont(new Font("Arial", Font.BOLD, 12));
		btnMode1Button.setBounds(41, 140, 110, 50);
		gamemodeES.add(btnMode1Button);
		
		JButton btnMode2Button = new JButton("7 Ketras");
		btnMode2Button.setFont(new Font("Arial", Font.BOLD, 12));
		btnMode2Button.setBounds(41, 220, 110, 50);
		gamemodeES.add(btnMode2Button);
		
		JButton btnContratiempo = new JButton("Contratiempo");
		btnContratiempo.setFont(new Font("Arial", Font.BOLD, 12));
		btnContratiempo.setBounds(41, 300, 110, 50);
		gamemodeES.add(btnContratiempo);
		
		JLabel imgFondo = new JLabel("");
		imgFondo.setBounds(0, 0, 960, 510);
		imgFondo.setIcon(new ImageIcon("img/fondoMenu.png"));
		menu.add(imgFondo);
		
		JPanel lenguaje = new JPanel();
		lenguaje.setBounds(0, 0, 954, 511);
		frmWungsdle.getContentPane().add(lenguaje);
		lenguaje.setLayout(null);
		
		JButton btnEspaniolButton = new JButton("");
		btnEspaniolButton.setIcon(new ImageIcon("img/flagES.png"));
		btnEspaniolButton.setBounds(600, 300, 200, 100);
		lenguaje.add(btnEspaniolButton);
		
		JButton btnEnglishButton = new JButton("");
		btnEnglishButton.setIcon(new ImageIcon("img/flagEN.png"));
		btnEnglishButton.setBounds(160, 300, 200, 100);
		lenguaje.add(btnEnglishButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img/fondoGeneral.png"));
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
