package com.stefanini.cachorro.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stefanini.cachorro.Cachorro;

/**
 * Servlet implementation class BuscaCachoro
 */
@WebServlet("/busca")
public class BuscaCachorro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscaCachorro() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	System.out.println("chamou metodo iniciar");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("chamou o metodo get");

		
		List<Cachorro> cachorros = new ArrayList<>();
		cachorros.add(new Cachorro("Shrek",1));
		cachorros.add(new Cachorro("Pingo",3));
		cachorros.add(new Cachorro("Fiona",5));
		
		
		PrintWriter imprimi = response.getWriter();
		imprimi.println("<html><body>");
		
		imprimi.println("<ul>");
		for (Cachorro cachorro : cachorros) {
			imprimi.println("<li>"+cachorro.getNome()+" "+cachorro.getIdade()+"</li>");
						
		}
		imprimi.println("</ul>");
		imprimi.println("</html></body>");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("chamou o metodo service");
	}

	

}
