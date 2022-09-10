

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

class PanelPalabras extends JPanel {

	JLabel[] palabraEnColumnas;

	public PanelPalabras(int j) {
		palabraEnColumnas = new JLabel[j];
		this.setLayout(new GridLayout(1, 5));
		Border blackBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		for (int i = 0; i < j; i++) {
			palabraEnColumnas[i] = new JLabel();
			palabraEnColumnas[i].setHorizontalAlignment(JLabel.CENTER);
			palabraEnColumnas[i].setOpaque(true);
			palabraEnColumnas[i].setBorder(blackBorder);
			this.add(palabraEnColumnas[i]);
		}
	}

	public void  limpiarPaneles() {
		for (int i = 0; i < 5; i++) {
			palabraEnColumnas[i].setText("");
		}
	}

	public void textoEnPanel(String charValue, int position, Color color) {
		this.palabraEnColumnas[position].setText(charValue);
		this.palabraEnColumnas[position].setBackground(color);
	}
}
