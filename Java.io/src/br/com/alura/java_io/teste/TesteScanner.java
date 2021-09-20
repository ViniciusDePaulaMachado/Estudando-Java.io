package br.com.alura.java_io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");

		while (scanner.hasNextLine()) {

			String linha = scanner.nextLine();
			System.out.println();
			//System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);

			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String TipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt", "BR"),"%s- %d-%d, %1.10s: %08.2f",
											TipoConta, agencia, numero, titular, saldo);

			linhaScanner.close();
		}
		scanner.close();
	}
}
