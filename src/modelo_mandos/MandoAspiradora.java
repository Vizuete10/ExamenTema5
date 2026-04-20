package modelo_mandos;

public class MandoAspiradora extends MandoDistancia implements Ajustable {

	final int VELOCIDAD_MAXIMA = 3;
	final int VELOCIDAD_MINIMA = 0;
	final int INCREMENTO = 1;

	private int velocidad;

	/**
	 * Constructor del mando de aspiradora. La velocidad se inicializa a 0 (parada)
	 * 
	 * @param modelo
	 * @param precio
	 */
	public MandoAspiradora(String modelo, double precio) {
		super(modelo, precio);
		this.velocidad = 0;
	}

	// GETTERS

	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Sube de velocidad de 1 en 1
	 */
	@Override
	public void subirNivel() {
		this.velocidad += INCREMENTO;
		// Si la velocidad se pasa de la maxima la velocidad se pone la VELOCIDAD_MAXIMA
		if (this.velocidad > VELOCIDAD_MAXIMA) {
			this.velocidad = VELOCIDAD_MAXIMA;
		}
	}

	/**
	 * Baja de velocidad de 1 en 1
	 */
	@Override
	public void bajarNivel() {
		this.velocidad -= INCREMENTO;
		// Si la velocidad es inferior a la minima, la velocidad se pone la
		// VELOCIDAD_MINIMA
		if (this.velocidad < VELOCIDAD_MINIMA) {
			this.velocidad = VELOCIDAD_MINIMA;
		}
	}

	/**
	 * Devuelve toda la información del mando de aspiradora.
	 * 
	 * @return String con los datos base más la velocidad actual.
	 */
	@Override
	public String toString() {
		return super.toString() + " | [MandoAspiradora] Vel: " + velocidad + "-" + VELOCIDAD_MAXIMA;
	}

}
