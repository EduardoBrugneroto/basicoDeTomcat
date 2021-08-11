package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.XStreamer;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

@WebServlet("/Empresas")
public class EmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Empresa> empresas = new Banco().getEmpresas();
		
		
		XStream xstream = new XStream();
		xstream.alias("Empresa", Empresa.class);
		String xml = xstream.toXML(empresas);
		
		response .setContentType("application/xml");
		response.getWriter().print(xml);		
		
//		Gson gson = new Gson();
//		String json = gson.toJson(empresas);
//		
//		response .setContentType("application/json");
//		response.getWriter().print(json);
	}

}
