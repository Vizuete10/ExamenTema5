package modelo_mandos;

/**
 * Representa un mando a distancia de minicadena. Solo puede controlar el
 * volumen, que sube y baja de 10 en 10. Implementa Ajustable para la gestión
 * del volumen.
 */
public class MandoMiniCadena extends MandoDistancia implements Ajustable {

	final int INCREMENTO_VOLUMEN = 10;
	final int VOLUMEN_MAXIMO = 100;
	final int VOLUMEN_MINIMO = 0;

	private int volumen;

	public MandoMiniCadena(String modelo, double precio) {
		super(modelo, precio);
		this.volumen = 30;
	}

	// GETTERS

	public int getVolumen() {
		return volumen;
	}

	/**
	 * Sube el Volumen de
	 */
	@Override
	public void subirNivel() {
		this.volumen += INCREMENTO_VOLUMEN;
		if (this.volumen > VOLUMEN_MAXIMO) {
			this.volumen = VOLUMEN_MAXIMO;
		}
	}

	/**
	 * Baja el volumen de 10 en 10
	 */
	@Override
	public void bajarNivel() {
		this.volumen -= INCREMENTO_VOLUMEN;
		if (this.volumen < VOLUMEN_MINIMO) {
			this.volumen = VOLUMEN_MINIMO;
		}
	}

	/**
	 * Devuelve toda la información del mando de minicadena.
	 * 
	 * @return String con los datos base más el volumen actual.
	 */
	@Override
	public String toString() {
		return super.toString() + " | [MandoMiniCadena] Vol: " + volumen;
	}

}
