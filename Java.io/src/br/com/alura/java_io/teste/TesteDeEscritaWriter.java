package br.com.alura.java_io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteDeEscritaWriter {

	public static void main(String[] args) throws IOException {

		// FileWhiter fw = new FileWriter("Java_io_Teste2.txt");

		BufferedWriter bw = new BufferedWriter(new FileWriter("Java_io_Teste2.txt"));

		bw.write("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		bw.newLine(); // bw.write(System.lineSeparator());
		bw.newLine();
		bw.newLine();
		bw.write("Teste de escrita 2");

		bw.close();

	}
}
