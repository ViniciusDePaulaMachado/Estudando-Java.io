package br.com.alura.java_io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		Cliente cliente = new Cliente();
//		cliente.setNome("Vinicius");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("12312312312");
//		
//
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getProfissao());
		
		
		
		
	}
}
