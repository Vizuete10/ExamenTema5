package modelo_mandos;

public class MandoTelevision extends MandoDistancia implements Ajustable {

	final int INCREMENTO_VOLUMEN = 5;
	final int VOLUMEN_MAXIMO = 100;
	final int VOLUMEN_MINIMO = 0;

	private int volumen;
	private int canal;
	
	/**
     * Constructor del mando de televisión.
     * El volumen se inicializa a 50 y el canal a 1 por defecto.
     * @param modelo  Modelo del mando.
     * @param precio  Precio en euros.
     */
	public MandoTelevision(String modelo, double precio) {
		super(modelo, precio);
		// Valores iniciales para los Mandos de TV
		this.volumen = 50;
		this.canal = 1;
	}
	
	// GETTERS AND SETTERS 
	
	public int getVolumen() { return volumen; }
    public int getCanal() { return canal; }
    public void setCanal(int canal) { this.canal = canal; }
	
    /**
     * Se sube el volumen de 5 en 5
     */
    @Override
    public void subirNivel() {
        this.volumen += INCREMENTO_VOLUMEN;
        // Si supera el máximo lo fijamos al maximo
        if (this.volumen > VOLUMEN_MAXIMO) {
            this.volumen = VOLUMEN_MAXIMO;
        }
    }
    
    /**
     * Se baja el volumen de 5 en 5
     */
    @Override
    public void bajarNivel() {
        this.volumen -= INCREMENTO_VOLUMEN;
        // Si el volumen es menor que el minimo se fija en el minimo
        if (this.volumen < VOLUMEN_MINIMO) {
            this.volumen = VOLUMEN_MINIMO;
        }
    }
    
    /**
     * Devuelve toda la información del mando de televisión.
     * @return String con los datos base más volumen y canal actuales.
     */
    @Override
    public String toString() {
        return super.toString() + " | [MandoTV] Vol: " + volumen + " | Canal: " + canal;
    }
    
}
