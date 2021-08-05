package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			String Login = request.getParameter ("Login");
			String Senha = request.getParameter("Senha");
		
			System.out.println("logando" + Login);
		
			return "rediret:entrada?acao=ListaEmpresas";
	}

}
