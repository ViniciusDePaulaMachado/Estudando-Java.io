package br.com.alura.java_io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;



public class TesteDeEscrita {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("Java_io_Teste2.txt");
		Writer ows = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ows);
		
		bw.write("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("Teste de escrita 1");
		
		bw.close();

	}
}
