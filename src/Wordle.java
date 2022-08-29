import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Wordle {
	private ArrayList<String> _palabras;
	private String _palabraElegida;
	private String _palabraActual;
	private int _turnos;

	public Wordle(){
		_palabras = new ArrayList<String>();
		getPalabra();
	}
	
	private String elegirPalabra() {
		
		try {
			
			//Uso File Reader para leer el archivo.
			
			FileReader entrada= new FileReader("Palabras.txt");
				
				BufferedReader mibuffer= new BufferedReader(entrada);
					
				String linea="";
				
				int posicionAleatoria = (int)Math.floor(Math.random()*(121));
				
				boolean encontrePalabra= false;
			
				int i= 0;
				
				while(!encontrePalabra) {
						
					linea= mibuffer.readLine();
						
					if( i == posicionAleatoria) {
						encontrePalabra= true;
					}
					
					else
						i++;
				}
			
				return linea != null? linea.toUpperCase(): "";
				
        } catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
        }
		return "";
	}

	public void getPalabra() {
		_palabraElegida = elegirPalabra();
	}
		
	public String ganar() {
		return "Ganaste";
	}
	
	public String perder() {
		return "Perdiste";
	}
	
	public String arriesgarPalabra(String entrada) {
		if(entrada.length()>5) {
			return "La palabra debe tener 5 letras"; 
		}
		entrada = entrada.toUpperCase();
		if(entrada.equals(get_palabraElegida())) {
			return ganar();
		}
		else {
			set_turnos(get_turnos()-1);
			return mostrarEstado(entrada);
		}
	}
	
	public String mostrarEstado(String entrada) {
		int caracter=0;
		StringBuilder string = new StringBuilder();
		while(caracter<entrada.length()) {
			if(contiene(entrada.charAt(caracter))) {
				if(contiene(entrada.charAt(caracter), caracter)) {
					string.append(entrada.charAt(caracter));
				}
				else {
					string.append("+");
				}
			}
			else {
				string.append("_");
			}
			caracter++;
		}
		return string.toString();
	}

	private boolean contiene(char charAt, int index) {
		int caracter = 0;
		while(caracter < get_palabraElegida().length()) {
			if(get_palabraElegida().charAt(caracter) == charAt && caracter == index) {
				return true;
			}
			caracter++;
		}
		return false;
	}
	
	private boolean contiene(char charAt) {
		int caracter = 0;
		while(caracter < get_palabraElegida().length()) {
			if(get_palabraElegida().charAt(caracter) == charAt) {
				return true;
			}
			caracter++;
		}
		return false;
	}

	public int get_turnos() {
		return _turnos;
	}

	public void set_turnos(int _turnos) {
		this._turnos = _turnos;
	}

	public String get_palabraElegida() {
		return _palabraElegida;
	}

	public void set_palabraElegida(String _palabraElegida) {
		this._palabraElegida = _palabraElegida;
	}

	public String get_palabraActual() {
		return _palabraActual;
	}

	public void set_palabraActual(String _palabraActual) {
		this._palabraActual = _palabraActual;
	}
}
