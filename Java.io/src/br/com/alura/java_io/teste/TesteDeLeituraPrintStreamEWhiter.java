package br.com.alura.java_io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteDeLeituraPrintStreamEWhiter {

	public static void main(String[] args) throws IOException {

		long inicio = System.currentTimeMillis();

		//PrintStream ps = new PrintStream("Java_io_teste2.txt");
		PrintWriter ps = new PrintWriter("Java_io_teste2.txt");

		ps.println("Olá");
		ps.println("");
		ps.println("Ola 2");

		ps.close();

		long fim = System.currentTimeMillis();

		System.out.println("Demorou " + (fim - inicio) + " Ms");
	}
}
