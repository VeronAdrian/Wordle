
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Wordle {	
	private String palabraOriginal;
	private int intentos;
	private Boolean GameOver;
	private Boolean Ganador;	
	private String _recordNombre;
	private int _recordIntento;
	
	public Wordle () {	
		this.intentos = 0;
		this.GameOver= false;
		this.Ganador= false;
		this.set_recordNombre("Anonimo");
		this.set_recordTiempo(3);
	}
	
	public boolean palabraValida(String palabraIngresada) {
		if (palabraIngresada.length() == palabraOriginal.length()) {
			return true;			
		}
		return false;
	}
	
	public void intento (String palabraIngresada) {		
		if (GameOver == false && Ganador == false) {		
		palabraIngresada.toLowerCase();		
		if (palabraIngresada.length() != palabraOriginal.length()) {
				throw new RuntimeException("Deben ser "+ palabraOriginal.length() +" caracteres");			
		}		
		for (int i = 0; i < palabraIngresada.length(); i++) {
			if (palabraIngresada.charAt(i) < 97 || palabraIngresada.charAt(i) > 122) { 																					// unicamente letras
				throw new RuntimeException("No es una palabra valida");
			}}		
		if (intentos == 6) {
			this.GameOver=true;
		}		
		if (palabraIngresada.equals(this.palabraOriginal)) {
			this.Ganador=true;
			this.GameOver=true;
		}		
		intentos++;
		mostrarEstado(palabraIngresada);		
		}
	}
		
	public String endGame() {
		if (Ganador == true) {
			return "Ganaste";
		}		
		return "Perdiste";		
	}	
	
	public String mostrarEstado(String entrada) {
		int caracter=0;
		StringBuilder string = new StringBuilder();
		while(caracter<entrada.length()) {
			if(contieneLaLetra(entrada.charAt(caracter))) {
				if(contieneLaLetra(entrada.charAt(caracter), caracter)) {
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
			
	private boolean contieneLaLetra(char letra, int index) {
		int caracter = 0;
		while(caracter < this.palabraOriginal.length()) {
			if(this.palabraOriginal.charAt(caracter) == letra && caracter == index) {
				return true;
			}
			caracter++;
		}
		return false;
	}
	
	private boolean contieneLaLetra(char letra) {
		int caracter = 0;
		while(caracter < this.palabraOriginal.length()) {
			if(this.palabraOriginal.charAt(caracter) == letra) {
				return true;
			}
			caracter++;
		}
		return false;
	}	
	
	public boolean hayGanador () {
		return this.Ganador;
	}
	
	public boolean HayPerdedor() {
		return this.GameOver;
	}	
	
	public void palabraRandomEs5 () {	
		try {			
			FileReader entrada= new FileReader("txt/palbras5LetrasES.txt");				
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
				this.palabraOriginal = linea;				
        } catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
        }
	}
	
	public void palabraRandomEs7 () {
		try {			
			FileReader entrada= new FileReader("txt/palbras7LetrasES.txt");				
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
				this.palabraOriginal = linea;				
        } catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
        }
	}
	
	public void palabraRandomEng7 () {
		try {			
			FileReader entrada= new FileReader("txt/palbras7LetrasEN.txt");				
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
				this.palabraOriginal = linea;				
        } catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
        }
	}
	
	public void palabraRandomEng5() {		
		try {			
			FileReader entrada= new FileReader("txt/palbras5LetrasEN.txt");				
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
				this.palabraOriginal = linea;				
        } catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
        }
	}
	
	public Boolean compararLetras (String palabraElegida, char letra) {
		for (int i = 0; i < palabraElegida.length(); i++) {	
			if (palabraElegida.charAt(i)== letra) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean letraIgual(String palabraOriginal, String palabraIngresada, int indice) {
		if (palabraOriginal.charAt(indice) == palabraIngresada.charAt(indice)) {
			return true;
		}
		return false;
	}

	public String get_recordNombre() {
		return _recordNombre;
	}

	public void set_recordNombre(String _recordNombre) {
		this._recordNombre = _recordNombre;
	}

	public String get_recordIntentos() {
		StringBuilder string = new StringBuilder();
		return string.append(_recordIntento).toString();
	}

	public void set_recordTiempo(int _recordTiempo) {
		this._recordIntento = _recordTiempo;
	}

	public boolean rompeRecord() {
		if(this._recordIntento > intentos) {
			return true;
		}
		return false;
	}

	public void nuevoRecord(String record) {
		this._recordNombre = record;
		this._recordIntento = intentos;
	}
	
	public boolean get_Ganador() {
		return Ganador;
	}
	
	public boolean get_GameOver() {
		return GameOver;
	}
	
	public String get_palabraOriginal() {
		return palabraOriginal.toUpperCase();
	}
	
}
