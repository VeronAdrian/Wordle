
import java.util.Random;

public class Wordle {
	
	private String[] palabrasEsp=new String[]{"casak","patos","gaseo","marce","dubai"};
	private String[] palabrasEspSieteLetras=new String[]{"casaksa","patossa","gaseosa","marcesa","dubaisa"};
	private String[] palabrasEng=new String[]{"banks","board","glows","group","queen"};
	private String[] palabrasEngSieteLetras=new String[]{"banksas","boardsa","glowssa","groupsa","queesan"};
	private String palabraOriginal;
	private int intentos;
	private Boolean GameOver;
	private Boolean Ganador;
	private int longitud;
	
	private String _recordNombre;
	private int _recordIntento;
	
	public boolean get_Ganador() {
		return Ganador;
	}
	
	public boolean get_GameOver() {
		return GameOver;
	}
	
	public String get_palabraOriginal() {
		return palabraOriginal.toUpperCase();
	}
	
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
		System.out.println(this.palabraOriginal);
		if (GameOver == false && Ganador == false) {		
		palabraIngresada.toLowerCase();		
		if (palabraIngresada.length() != palabraOriginal.length()) {
				throw new RuntimeException("Deben ser "+ palabraOriginal.length() +" caracteres");			
		}		
		for (int i = 0; i < palabraIngresada.length(); i++) {
			if (palabraIngresada.charAt(i) < 97 || palabraIngresada.charAt(i) > 122) { // se fija si la palabra contiene																						// unicamente letras
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
		Random random = new Random();
		int numeroAleatorio = random.nextInt(palabrasEsp.length);
		
		this.palabraOriginal = palabrasEsp[numeroAleatorio];
	}
	
	public void palabraRandomEs7 () {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(palabrasEspSieteLetras.length);
		this.palabraOriginal = palabrasEspSieteLetras[numeroAleatorio];
	}
	
	public void palabraRandomEng5 () {	
		Random random = new Random();
		int numeroAleatorio = random.nextInt(palabrasEng.length);
		
		this.palabraOriginal = palabrasEng[numeroAleatorio];
	}
	
	public void palabraRandomEng7 () {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(palabrasEngSieteLetras.length);
		this.palabraOriginal = palabrasEngSieteLetras[numeroAleatorio];
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
	
}
