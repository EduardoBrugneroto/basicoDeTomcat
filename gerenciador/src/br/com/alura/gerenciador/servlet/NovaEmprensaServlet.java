package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  implementation class NovaEmprensaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmprensaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setName(nomeEmpresa);
		
		Banco banco = new Banco();
		banco.adiocna(empresa);
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa " +  nomeEmpresa + " cadastrada com sucesso!</body></html>");
		;
	}

}
