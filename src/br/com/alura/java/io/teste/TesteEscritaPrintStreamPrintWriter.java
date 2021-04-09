package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		long ini = System.currentTimeMillis();
		
		PrintStream ps = new PrintStream("lorem2.txt"); 
				
		ps.println("Teste de escrita no arquivo");
		ps.println("Teste de escrita no arquivo");
		ps.print("Escrevendo na outra linha.");
		ps.close();
		
		PrintWriter pw = new PrintWriter("Lorem3.txt", "UTF-8");
		
		pw.println("Teste de escrita");
		pw.print("teste de escrita 2");
		pw.close();
		
		long fim = System.currentTimeMillis();
		
		 System.out.println("Passaram " + (ini) + " milissegundos");
		 System.out.println("Passaram " + (ini/1000) + " segundos");
		 System.out.println("Passaram " + ((ini/1000)/60) + " minutos");
		 System.out.println("Passaram " + (((ini/1000)/60)/60) + " horas");
		 System.out.println("Passaram " + ((((ini/1000)/60)/60)/24) + " dias");
		 System.out.println("Passaram " + (((((ini/1000)/60)/60)/24)/365) + " anos");
		
	}

}

