package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Shiip");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Alura");
		lista.add(empresa);
		lista.add(empresa2);
		
	}

	public void adiocna(Empresa empresa) {
		lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista ;
	}
	
}
