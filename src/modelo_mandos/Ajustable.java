package modelo_mandos;

/**
 * Interfaz que agrupa el comportamiento de subir y bajar un nivel numérico
 * (volumen o velocidad) en los mandos a distancia compatibles. Cada subclase
 * implementa el incremento que le corresponde.
 */
public interface Ajustable {

	/**
	 * Sube el nivel del dispositivo, respetando los incrementos de cada uno y los
	 * maximos y minimos
	 */
	public void subirNivel();

	/**
	 * Baja el nivel del dispositivo, respetando los incrementos de cada uno y los
	 * maximos y minimos
	 */
	public void bajarNivel();
}