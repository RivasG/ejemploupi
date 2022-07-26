
package com.mycompany.ejemploupi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class emeplo {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
		int valor1;
		int valor2;
		int valor3;
		// definir variables
		// entrada de datos
		System.out.println(" Digite los valores correspondientes ");
		valor1 = entrada.nextInt();
		valor2 = entrada.nextInt();
		valor3 = entrada.nextInt();
		if (valor1>valor2 && valor1>valor3) {
			System.out.println(valor1+" Es el mayor");
		} else {
			if (valor2>valor1 && valor2>valor3) {
				System.out.println(valor2+" Es el mayor");
			} else {
				if (valor3>valor1 && valor3>valor2) {
					System.out.println(valor3+" Es el mayor");
				} else {
					System.out.println(" numero son iguales ");
				}
			}
		}
		if (valor1<valor2 && valor1<valor3) {
			System.out.println(valor1+" Es el menor");
		} else {
			if (valor2<valor1 && valor2<valor3) {
				System.out.println(valor2+" Es el menor");
			} else {
				if (valor3<valor1 && valor3<valor2) {
					System.out.println(valor3+" Es el menor ");
				} else {
					System.out.println(" Los datos son iguales  ");
				}
			}
		}
	}

    
}
