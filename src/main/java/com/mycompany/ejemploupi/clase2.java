
package com.mycompany.ejemploupi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase2 {
  public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int valor1;
		int valor2;
		int valor3;
		// definir variables
		// entrada de datos
		System.out.println("Digite las tres valores que desea");
		valor1 = Integer.parseInt(bufEntrada.readLine());
		valor2 = Integer.parseInt(bufEntrada.readLine());
		valor3 = Integer.parseInt(bufEntrada.readLine());
		// proceso de datos
		if (valor1>valor2 && valor1>valor3) {
			System.out.println(valor1+" Es el mayor");
		} else {
			if (valor2>valor1 && valor2>valor3) {
				System.out.println(valor2+" Es el mayor");
			} else {
				if (valor3>valor1 && valor3>valor2) {
					System.out.println(valor3+" Es el mayor");
				} else {
					System.out.println(" Los numero son iguales");
				}
			}
		}
		if (valor1<valor2 && valor1<valor3) {
			System.out.println(valor1+" Es el menor ");
		} else {
			if (valor2<valor1 && valor2<valor3) {
				System.out.println(valor2+" Es el menor ");
			} else {
				if (valor3<valor2 && valor3<valor1) {
					System.out.println(valor3+" Es el menor ");
				} else {
					System.out.println(" Los numero son iguales ");
				}
			}
		}
	}

  
}
