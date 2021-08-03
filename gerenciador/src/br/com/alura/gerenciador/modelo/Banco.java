package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSeguencial = 1;
	
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSeguencial++);
		empresa.setNome("Shiip");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSeguencial++);
		empresa2.setNome("Alura");
		lista.add(empresa);
		lista.add(empresa2);
		
	}

	public void adiocna(Empresa empresa) {
		empresa.setId(Banco.chaveSeguencial++);
		Banco.lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista ;
	}
	
	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}	
		
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
	
}
