package br.com.alura.java_io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteDeEntradaESaida {

	public static void main(String[] args) throws IOException {
		
		//Socket s = new Socket();
		
		InputStream fis = new FileInputStream("Java_io_Teste.txt"); // System.in; //s.getInputStream();
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		OutputStream fos = System.out; //new FileOutputStream("Java_io_Teste2.txt"); // s.getOutputStream();
		Writer ows = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ows);

		String linha = br.readLine();

		while (linha != null && ! linha.isEmpty()) {
			
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}
}
