package modelo_principal;

import modelo_mandos.*;
import java.util.Arrays;

public class MainMandos {
	public static void main(String[] args) {

		MandoDistancia[] tiendaMandos = new MandoDistancia[5];

		tiendaMandos[0] = new MandoTelevision("Samsung TMLS489", 5.0);
		tiendaMandos[1] = new MandoMiniCadena("LG GM23", 4.32);
		tiendaMandos[2] = new MandoAspiradora("Dyson 304", 5.75);
		tiendaMandos[3] = new MandoAireAcondicionado("Daikin ATC3000", 4.0, 21);
		tiendaMandos[4] = new MandoAireAcondicionado("Daikin ATC3500", 4.7, 19);

		// Ordenamos el array alfabéticamente por modelo usando compareTo
		System.out.println("Tienda ordenada alfabéticamente por modelo:");
		Arrays.sort(tiendaMandos);
		for (MandoDistancia mando : tiendaMandos) {
			System.out.println(mando.toString());
		}

		System.out.println("\n Probando operaciones de los mandos...");
		for (MandoDistancia mando : tiendaMandos) {
			System.out.println("\n>>> " + mando.getModelo());

			// Encender el mando
			mando.encender();

			// Según el tipo, ejecutar las acciones correspondientes
			if (mando instanceof MandoTelevision) {
				MandoTelevision tv = (MandoTelevision) mando;
				tv.setCanal(77);
				tv.subirNivel();
				tv.bajarNivel();
				System.out.println("TV → Canal: " + tv.getCanal() + " | Volumen: " + tv.getVolumen());

			} else if (mando instanceof MandoMiniCadena) {
				MandoMiniCadena miniCadena = (MandoMiniCadena) mando;
				miniCadena.subirNivel();
				miniCadena.bajarNivel();
				System.out.println("MiniCadena → Volumen: " + miniCadena.getVolumen());

			} else if (mando instanceof MandoAspiradora) {
				MandoAspiradora aspiradora = (MandoAspiradora) mando;
				aspiradora.subirNivel();
				aspiradora.bajarNivel();
				System.out.println("Aspiradora → Velocidad: " + aspiradora.getVelocidad());

			} else if (mando instanceof MandoAireAcondicionado) {
				MandoAireAcondicionado aireAcondicionado = (MandoAireAcondicionado) mando;
				aireAcondicionado.cambiarModo();
				aireAcondicionado.setTemperatura(28.0);
				aireAcondicionado.subirNivel();
				aireAcondicionado.bajarNivel();
				System.out.println("Aire → Modo: " + aireAcondicionado.getModo() + " | Temp: "
						+ aireAcondicionado.getTemperatura() + "°C" + " | Vel: " + aireAcondicionado.getVelocidad());
			}

			System.out.println(mando.toString());
		}
	}
}