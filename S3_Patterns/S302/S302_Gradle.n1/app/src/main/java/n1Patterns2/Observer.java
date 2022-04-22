package n1Patterns2;

import java.util.ArrayList;

public class Observer {

	static class CanviBorsaNotificador {

		ArrayList<AgenciaBorsa> agencies = new ArrayList<AgenciaBorsa>();

		private double valor = 15.7;
		private double valorActual = 15.5;

		void afegirAgencia(AgenciaBorsa agencia) {
			agencies.add(agencia);

		}

		void canvisBorsa() {
			if (valor != valorActual) {
				for (AgenciaBorsa agencia : agencies) {
					agencia.avisar();
				}
			} else {
				System.out.println("No hi ha hagut variacions en els valors borsàtils");
			}

		}

		public static void main(String[] args) {

			CanviBorsaNotificador avisador = new CanviBorsaNotificador();

			avisador.afegirAgencia(new AgenciaBorsa("Agència Valors de Barcelona"));
			avisador.afegirAgencia(new AgenciaBorsa("Agència Inversions Borsa"));
			avisador.afegirAgencia(new AgenciaBorsa("Agència Bona Inversió"));
			avisador.afegirAgencia(new AgenciaBorsa("Agència IIB"));

			avisador.canvisBorsa();

		}
	}
}
