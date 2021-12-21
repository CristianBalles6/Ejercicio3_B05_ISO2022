package ISOTesting.Ejercicio3;

import java.io.IOException;
import java.math.*;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los datos de completitud");
		int completitud = sc.nextInt();
		System.out.println("Introduce los datos de correcion");
		int correcion = sc.nextInt();
		System.out.println("Introduce los datos de pertinencia");
		int pertinencia = sc.nextInt();

		completitud = algo(completitud, 0, 1, 2, 2, 3, 4);
		correcion = algo(correcion, 0, 1, 1, 2, 3, 5);
		pertinencia = algo(pertinencia, 0, 2, 2, 3, 4, 5);

		int adecuacion = Math.min(completitud, Math.min(correcion, pertinencia));
		// System.out.println(adecuacion);

		System.out.println("Introduce los datos de modularidad");
		int modularidad = sc.nextInt();
		System.out.println("Introduce los datos de reusabilidad");
		int reusabilidad = sc.nextInt();
		System.out.println("Introduce los datos de analizabilidad");
		int analizabilidad = sc.nextInt();
		System.out.println("Introduce los datos de modificado");
		int modificado = sc.nextInt();
		System.out.println("Introduce los datos de probado");
		int probado = sc.nextInt();

		modularidad = algo(modularidad, 0, 1, 2, 2, 3, 4);
		reusabilidad = algo(reusabilidad, 0, 1, 2, 2, 3, 5);
		analizabilidad = algo(analizabilidad, 0, 0, 1, 2, 3, 5);
		modificado = algo(modificado, 0, 1, 2, 3, 4, 5);
		probado = algo(probado, 0, 1, 1, 2, 4, 4);

		int aux1 = Math.min(modularidad, reusabilidad);
		int aux2 = Math.min(modificado, probado);
		int mantenibilidad = Math.min(aux1, Math.min(aux2, analizabilidad));
		// System.out.println(mantenibilidad);
		int calidad = calcular(adecuacion, mantenibilidad);
		// System.out.println(calidad);
		if (calidad >= 3)
			System.out.println("Toma tu certificado");
		else
			System.out.println("Tienes que ir a extraordinaria");
	}

	public static int calcular(int ad, int man) {
		int calidad = 0;

		if (ad == 0 || man == 0)
			calidad = -1;
		else {
			if (ad == 1)
				calidad = 1;
			else if (ad == 2 && man == 1)
				calidad = 1;
			else if (ad == 2 && man != 1)
				calidad = 2;
			else if (ad == 3 && (man == 1 || man == 2))
				calidad = 2;
			else if (ad == 3 && man > 2)
				calidad = 3;
			else if (ad == 4 && man == 5)
				calidad = 4;
			else if (ad == 4 && man != 5)
				calidad = 3;
			else if (ad == 5 && (man == 1 || man == 2))
				calidad = 3;
			else if (ad == 5 && man == 5)
				calidad = 5;
			else
				calidad = 4;
		}

		return calidad;
	}

	public static int algo(int valor, int v1, int v2, int v3, int v4, int v5, int v6) {

		int aux = 0;
		if (valor < 0 || valor > 100) {
			aux = -1;
		}else {
			if (valor < 10) {
				aux = v1;
			} else if (valor >= 10 && valor < 35) {
				aux = v2;
			} else if (valor >= 35 && valor < 50) {
				aux = v3;
			} else if (valor >= 50 && valor < 70) {
				aux = v4;
			} else if (valor >= 70 && valor < 90) {
				aux = v5;
			} else {
				aux = v6;
			}
		}

		return aux;
	}

}
