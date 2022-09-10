

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PanelUsuario extends JPanel {

	private JTextField input;
	private JButton botonEnviar;

	public PanelUsuario() {
		this.setLayout(new GridLayout(1, 2));
		input = new JTextField();
		this.add(input);
		botonEnviar = new JButton("OK");
		this.add(botonEnviar);
	}

	public JTextField getInput() {
		return input;
	}

	public void setInput(JTextField input) {
		this.input = input;
	}

	public JButton getBotonEnviar() {
		return botonEnviar;
	}



}